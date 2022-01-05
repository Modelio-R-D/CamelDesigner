package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("437aee60-de78-465b-a013-23a7bdf92710")
public class PlatformCredentialsPropertyPage<T extends PlatformCredentials> extends CredentialsPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0c0b7e8e-d0f3-4bf8-b2f3-c5825427306f")
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
    @objid ("bd56f462-43b8-4683-b24b-0cc447a242c9")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("107167a7-61fc-4455-a4b3-e1f62d957204")
    public PlatformCredentialsPropertyPage(T elt) {
        super(elt);
    }

}
