package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("e9cb98f5-70b0-4110-b9a9-5fdad5fc104d")
public class CloudProviderPropertyPage<T extends CloudProvider> extends OrganisationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("399414aa-19d7-43c4-917b-191de64a9989")
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
    @objid ("ad1741f8-b455-4134-b61f-cf063003a0e7")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("5d7d2d20-c1ee-47c8-b4d2-c1c7105ca302")
    public CloudProviderPropertyPage(T elt) {
        super(elt);
    }

}
