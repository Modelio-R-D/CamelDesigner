package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("810b6f62-535c-4054-98b1-14ebe81ae551")
public class AttributeAttributePropertyPage<T extends AttributeAttribute> extends CamelAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("3d495f5b-f65b-46cb-828d-a0dfb961237c")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
          this._element.setValue(value);
        }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("8d2b7d42-ea9d-415a-90c6-2c115bdbfb08")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Value
        table.addProperty("Value", this._element.getValue());
    }

    @objid ("7845573e-61c1-45d8-b8b6-1826903ef6d0")
    public AttributeAttributePropertyPage(T elt) {
        super(elt);
    }

}
