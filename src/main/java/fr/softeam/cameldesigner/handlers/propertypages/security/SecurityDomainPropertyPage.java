package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("e5ad43f1-3c60-441d-9a02-1b7e22316c2b")
public class SecurityDomainPropertyPage<T extends SecurityDomain> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4bad27f1-9081-4d31-88ca-0091b968b4d9")
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
    @objid ("4179a506-b7d0-4255-aadc-9557bf7da195")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("26db7512-5387-4365-94e9-83f67e960419")
    public SecurityDomainPropertyPage(T elt) {
        super(elt);
    }

}
