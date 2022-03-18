package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("29c56672-2a16-4ff6-b7ee-09886fd75952")
public abstract class NamedElementPropertyPage<T extends NamedElement> extends CamelElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("cbdca913-f340-4678-8075-456e1d6225d2")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        this._currentRow = row;
        if(row == 1){
            this._element.setName(value);
        } else if(row == 2){
            this._element.setDescription(value);
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("47aac7fd-b682-4df6-ab52-1383ae0b01e2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Name",   getNotNull(this._element.getName()));
        
        table.addProperty("Description",   getNotNull(this._element.getDescription()));
    }

    @objid ("703eb3be-3c0b-45dc-8667-0e2e6f3bbd23")
    public NamedElementPropertyPage(T elt) {
        super(elt);
    }

}
