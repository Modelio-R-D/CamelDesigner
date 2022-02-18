package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement;


public abstract class SoftRequirementPropertyPage<T extends SoftRequirement> extends RequirementPropertyPage<T> {

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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Mimimise
        table.addProperty("Priority", this._element.getPriority());

    }

    public SoftRequirementPropertyPage(T elt) {
        super(elt);
    }

}
