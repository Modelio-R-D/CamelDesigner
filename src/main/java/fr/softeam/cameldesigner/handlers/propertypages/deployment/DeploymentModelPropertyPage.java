package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ee5b319e-272b-4ecf-b744-0d58902f0a25")
public abstract class DeploymentModelPropertyPage<T extends DeploymentModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("7ab30523-3e8f-4a46-b045-41782d1a6f11")
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
    @objid ("6209c706-ddd0-47e5-b019-dadf1bee848e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("d989693a-fe1a-4161-aab9-9cd3b8ee3698")
    public DeploymentModelPropertyPage(T elt) {
        super(elt);
    }

}
