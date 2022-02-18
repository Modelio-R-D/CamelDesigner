package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;

@objid ("6a94e9ca-8d2d-4632-a2b3-783b6a3717a0")
public class CamelAttributePropertyPage<T extends CamelAttribute> extends ExpendableElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("174c4292-dec8-4d8d-aa70-9e4235682ec4")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @objid ("1e4cec89-f4dd-41ba-b623-930f17a16dfc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("844da422-4698-44d6-a3fa-add9a5901ff3")
    public CamelAttributePropertyPage(T elt) {
        super(elt);
    }

}
