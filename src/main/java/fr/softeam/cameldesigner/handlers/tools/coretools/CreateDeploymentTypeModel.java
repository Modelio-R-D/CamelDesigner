package fr.softeam.cameldesigner.handlers.tools.coretools;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;

/**
 * @author kchaabouni
 */
public class CreateDeploymentTypeModel extends CreateSubModelTool {
    public CreateDeploymentTypeModel() {
        super("DeploymentModel", DeploymentTypeModel.STEREOTYPE_NAME, "DeploymentTypeModelDiagram", DeploymentModelDiagram.STEREOTYPE_NAME);
    }

}
