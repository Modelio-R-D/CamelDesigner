package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("2cf3c957-ede7-4b67-bf01-a837e222a841")
public class RequiredHostPropertyPage<T extends HostingPort> extends HostingPortPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("41cfd89f-4c2e-4b1f-b45a-a4bede17c229")
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
    @objid ("819a89b0-f363-423f-b81a-3af1d3cdd640")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("e696cc6a-874c-40d5-8ae3-61fd63a70068")
    public RequiredHostPropertyPage(T elt) {
        super(elt);
    }

}
