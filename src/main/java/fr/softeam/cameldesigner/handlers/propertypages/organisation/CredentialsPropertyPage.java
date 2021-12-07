package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("e977502b-fc95-4fce-803e-fb1b201df865")
public class CredentialsPropertyPage<T extends Credentials> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d9978a61-d429-4cf8-a878-d9c321f71247")
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
    @objid ("dbcc3e60-fe16-4410-b23b-b666cd6073e4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("dc1c6bc4-9bf6-433a-a02f-4ab554140874")
    public CredentialsPropertyPage(T elt) {
        super(elt);
    }

}
