package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.ComponentRelationPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("997dc0f2-cc54-46d2-9a22-b6fc22929b80")
public class CommunicationPropertyPage<T extends Communication> extends ComponentRelationPropertyPage<T> {
    @objid ("5729f1e4-ad7f-4cad-8cb6-29ba0aab5c2e")
    public CommunicationPropertyPage(T elt) {
        super(elt);
    }

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("21f1b0d7-2b66-47be-9fab-f2e57c0cf542")
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
    @objid ("cd5be132-1bce-4624-a2fd-d3a3ac4b1faf")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
