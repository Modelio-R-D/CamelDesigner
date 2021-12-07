package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("1f053003-fbbc-4ed3-8e21-2b438a8eb577")
public class ProvidedCommunicationPropertyPage<T extends CommunicationPort> extends CommunicationPortPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ecd4de7f-3bcc-4272-a73a-45df8ce0b6d9")
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
    @objid ("98806459-7d05-4032-9fce-b798562c18b8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("1f570a49-3637-41d5-8941-3afe0c4ea1d2")
    public ProvidedCommunicationPropertyPage(T elt) {
        super(elt);
    }

}
