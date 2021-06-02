package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;

public class LocationRequirementPropertyPage<T extends LocationRequirement> extends HardRequirementPropertyPage<T> {
    private List<ModelElement> _locations = null;

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

        if(this._currentRow == 1) {
            this._element.setAllRequired(Boolean.valueOf(value));
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

        //AllRequired
        table.addProperty("AllRequired", this._element.isAllRequired());
    }

    public LocationRequirementPropertyPage(T elt) {
        super(elt);
    }

}
