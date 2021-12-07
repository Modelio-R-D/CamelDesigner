package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.DeploymentModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("17b7995a-c56c-443d-8c73-08e8b18aa3fb")
public class DeploymentInstanceModelPropertyPage<T extends DeploymentInstanceModel> extends DeploymentModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b018a0bf-936e-4aff-ab91-7a1e90c13933")
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
    @objid ("ad922f0d-4e1a-4655-b607-3cf0b43b924c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("6f75b84c-da51-45f4-a21b-e51dbf5e7191")
    public DeploymentInstanceModelPropertyPage(T elt) {
        super(elt);
    }

}
