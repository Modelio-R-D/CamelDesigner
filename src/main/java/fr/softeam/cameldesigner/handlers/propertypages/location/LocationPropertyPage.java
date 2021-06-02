package fr.softeam.cameldesigner.handlers.propertypages.location;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;

public class LocationPropertyPage<T extends Location> extends NamedElementPropertyPage<T> {
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

        if (this._currentRow == 1)
            this._element.setId(value);

        this._currentRow -= 1 ;
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

        table.addProperty("Id",  getValue(this._element.getId()));
    }

    public LocationPropertyPage(T elt) {
        super(elt);
    }

}
