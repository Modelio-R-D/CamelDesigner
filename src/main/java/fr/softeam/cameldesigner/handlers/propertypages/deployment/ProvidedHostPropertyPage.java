package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("980ff704-f85d-4f43-91b2-0d7e2c86ebe3")
public class ProvidedHostPropertyPage<T extends HostingPort> extends HostingPortPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("bac6c82f-ffb4-466f-84ba-ead5f357f5f9")
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
    @objid ("d20ddde5-279b-467c-91fd-36032d92337c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("6821a589-3007-404d-8e42-af303c3aa9b5")
    public ProvidedHostPropertyPage(T elt) {
        super(elt);
    }

}
