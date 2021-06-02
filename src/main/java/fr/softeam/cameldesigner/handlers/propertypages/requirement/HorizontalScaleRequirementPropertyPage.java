package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;

public class HorizontalScaleRequirementPropertyPage<T extends HorizontalScaleRequirement> extends ScaleRequirementPropertyPage<T> {
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
            this._element.setMinInstances(value);
            break;

        case 2 :
            this._element.setMaxInstances(value);
            break;
        }
        this._currentRow -= 2;
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

        //MinInstances
        table.addProperty("MinInstances", this._element.getMinInstances());

        //MaxInstances
        table.addProperty("MaxInstances", this._element.getMaxInstances());
    }

    public HorizontalScaleRequirementPropertyPage(T elt) {
        super(elt);
    }

}
