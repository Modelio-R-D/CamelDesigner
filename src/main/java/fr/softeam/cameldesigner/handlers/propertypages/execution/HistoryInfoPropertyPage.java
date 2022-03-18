package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("55311e4b-6b19-4075-a553-7859762db246")
public class HistoryInfoPropertyPage<T extends HistoryInfo> extends FeatureClassPropertyPage<T> {
    @objid ("bc5e47d0-95bf-480a-b175-f77cbca471e8")
    private List<ModelElement> _subject = null;

    @objid ("5f67cf6d-ed11-4721-ba5d-5af9b2aec12a")
    private List<ModelElement> _action = null;

    @objid ("d122dea3-c912-4055-9bdc-124d5b18defd")
    private List<ModelElement> _objectRef = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b5942133-5258-4ac1-9810-97343383920f")
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
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME)) {
                this._element.setSubject((MmsObject) elt);
            }
        }
        
        
        else if(this._currentRow == 5){
            Class elt = (Class) getModelElt(this._action, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME)) {
                this._element.setAction((MmsObject) elt);
            }
        }
        
        else if(this._currentRow == 6){
            ModelElement elt = getModelElt(this._objectRef, value);
            if (CamelElement.canInstantiate(elt)) {
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
    @objid ("5b5b6dab-1aab-4532-b95d-e86e674e74bb")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        
        table.addProperty("Object", getNotNull(this._element.getObject()));
        table.addProperty("Start Time", getNotNull(this._element.getStartTime()));
        table.addProperty("End Time", getNotNull(this._element.getEndTime()));
        
        //Subject
        this._subject = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Subject", getCamelName(this._element.getSubject()), getCamelNames(this._subject));
        
        //Action
        this._action = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Action", getCamelName(this._element.getAction()), getCamelNames(this._action));
        
        //Object Ref
        this._objectRef = CamelElement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Object Ref", getCamelName(this._element.getAction()), getCamelNames(this._action));
    }

    @objid ("f03d4a7a-4c36-416a-812c-8f6ab2b0ea87")
    public HistoryInfoPropertyPage(T elt) {
        super(elt);
    }

}
