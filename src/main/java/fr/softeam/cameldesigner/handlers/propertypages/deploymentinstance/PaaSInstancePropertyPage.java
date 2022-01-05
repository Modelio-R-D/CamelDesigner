package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("9039a88d-4f0b-4e37-9207-f44566b259ff")
public class PaaSInstancePropertyPage<T extends PaaSInstance> extends ComponentInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("1b43fdc7-9d6f-4dcf-b07c-4565a7d738d0")
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
    @objid ("8dfe4f9a-2720-46f3-8499-ff8d78101a4f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("7090a99e-1b82-41de-8a64-2a89010a9559")
    public PaaSInstancePropertyPage(T elt) {
        super(elt);
    }

}
