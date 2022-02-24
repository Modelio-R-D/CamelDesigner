package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("681cd0ba-ff2c-4eb6-9dc9-0ae8ba6df6aa")
public class SubModelPropertyPage<T extends SubModel> extends ExpendableElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ecb371a4-35ab-480d-b746-f498ac1885c7")
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
    @objid ("47bba4ae-9c48-4055-b459-a20f10684da6")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("313c64c1-3392-45db-b606-fe0792e8a318")
    public SubModelPropertyPage(T elt) {
        super(elt);
    }

}
