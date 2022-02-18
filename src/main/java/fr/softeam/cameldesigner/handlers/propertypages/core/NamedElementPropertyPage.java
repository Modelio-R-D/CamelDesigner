package fr.softeam.cameldesigner.handlers.propertypages.core;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;


public abstract class NamedElementPropertyPage<T extends NamedElement> extends CamelElementPropertyPage<T> {


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

        this._currentRow = row;
        if(row == 1){
            this._element.setName(value);
        } else if(row == 2){
            this._element.setDescription(value);
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

        table.addProperty("Name",   getValue(this._element.getName()));

        table.addProperty("Description",   getValue(this._element.getDescription()));
    }

    public NamedElementPropertyPage(T elt) {
        super(elt);
    }

}
