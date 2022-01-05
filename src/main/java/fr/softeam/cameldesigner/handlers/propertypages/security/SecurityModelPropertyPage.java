package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("e8fd2efe-755a-42c6-90ca-8923f9231fce")
public class SecurityModelPropertyPage<T extends SecurityModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("63743107-71db-4118-801a-cf35c7e68b0f")
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
    @objid ("6c15d7a5-dc2a-4b56-b0ee-6f193604ce70")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("f25d8b7d-87a9-452c-b547-62c1e4160e6f")
    public SecurityModelPropertyPage(T elt) {
        super(elt);
    }

}
