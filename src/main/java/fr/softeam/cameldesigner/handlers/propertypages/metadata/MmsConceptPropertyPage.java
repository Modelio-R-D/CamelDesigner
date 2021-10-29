package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;

public class MmsConceptPropertyPage<T extends MmsConcept> extends MmsObjectPropertyPage<T> {
    
    private List<ModelElement> _parent = null;

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
        	 Class elt = (Class) getModelElt(this._parent, value);
             if (MmsConcept.canInstantiate(elt)) {
                 this._element.setParent(MmsConcept.safeInstantiate(elt));
             }
        	break;
        }
        this._currentRow -= 1;

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
        
        // Parent
        this._parent = MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Parent", getCamelName(this._element.getParent()), getCamelNames(this._parent));
 

    }

    public MmsConceptPropertyPage(T elt) {
        super(elt);
    }

}
