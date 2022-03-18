package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("b3ef8d79-fba4-4f1b-9923-0f22c6ae741a")
public abstract class SoftRequirementPropertyPage<T extends SoftRequirement> extends RequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d0ea3e7e-98cb-470c-bd40-1057beacee8f")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        case 1 :
            this._element.setPriority(value);
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
    @objid ("b26a5aee-d347-4481-9ebb-e0bf7860a96a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Mimimise
        table.addProperty("Priority", getNotNull(this._element.getPriority()));
    }

    @objid ("68c59007-4a50-4368-83ca-7741792c6b11")
    public SoftRequirementPropertyPage(T elt) {
        super(elt);
    }

}
