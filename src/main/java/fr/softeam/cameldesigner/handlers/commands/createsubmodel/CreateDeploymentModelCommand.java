package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
public class CreateDeploymentModelCommand extends CreateCamelSubModelCommand {
    public CreateDeploymentModelCommand() {
        super("Deployment Model", DeploymentTypeModel.STEREOTYPE_NAME, "Deployment Type Model Diagram", DeploymentModelDiagram.STEREOTYPE_NAME);
    }

}
