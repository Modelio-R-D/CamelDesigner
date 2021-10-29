package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;

public class HistoryInfoPropertyPage<T extends HistoryInfo> extends FeatureClassPropertyPage<T> {
   
    private List<ModelElement> _subject = null;

    private List<ModelElement> _action = null;

    private List<ModelElement> _objectRef = null;

    
	/**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
	    switch (this._currentRow) {
	     
	    case 1 :
	        this._element.setObject(value);
	        break;
	
	    case 2 :
	        this._element.setStartTime(value);
	        break;
	
	    case 3 :
	        this._element.setEndTime(value);
	        break;
	    }
	
	    if(this._currentRow == 4){
	    	ModelElement elt = getModelElt(this._subject, value);
            if ((elt.getClass())==MmsObject.class) {
                this._element.setSubject((MmsObject) elt);
            }
        }


        else if(this._currentRow == 5){
            Class elt = (Class) getModelElt(this._action, value);
            if (MmsObject.canInstantiate(elt)) {
                this._element.setAction(null);
            }
        }

        else if(this._currentRow == 6){
            ModelElement elt = getModelElt(this._objectRef, value);
            if (EObject.canInstantiate(elt)) {
            this._element.setObjectRef((CamelElement) elt);;
            }
        }
	    this._currentRow -= 6;
	}
	    

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        
        table.addProperty("Object", getValue(this._element.getObject()));
        table.addProperty("Start Time", getValue(this._element.getStartTime()));
        table.addProperty("End Time", getValue(this._element.getEndTime()));
        
        //Subject
        this._subject = MmsObject.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Subject", getCamelName(this._element.getSubject()), getCamelNames(this._subject));
        
        //Action
        this._action = MmsObject.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Action", getCamelName(this._element.getAction()), getCamelNames(this._action));
        
        //Object Ref
        this._objectRef = EObject.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Object Ref", getCamelName(this._element.getAction()), getCamelNames(this._action));
        
        

    }

    public HistoryInfoPropertyPage(T elt) {
        super(elt);
    }

}
