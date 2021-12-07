package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("cbc1abbb-dbd3-40ff-b96b-cccf08a83d86")
public class DeploymentTypeModelPropertyPage<T extends DeploymentTypeModel> extends DeploymentModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ee00d49a-7cca-453e-97c2-c56d80d5cf9a")
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
    @objid ("f1dd369a-fb09-4c18-9be1-e227ec3bc340")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("35de5bc6-e07d-4312-846f-713794645dfc")
    public DeploymentTypeModelPropertyPage(T elt) {
        super(elt);
    }

}
