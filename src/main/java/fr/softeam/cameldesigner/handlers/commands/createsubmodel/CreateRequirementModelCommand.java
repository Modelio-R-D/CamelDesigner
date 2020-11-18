package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
public class CreateRequirementModelCommand extends CreateCamelSubModelCommand {
    public CreateRequirementModelCommand() {
        super("Requirement Model", RequirementModel.STEREOTYPE_NAME, "Requirement Model Diagram", RequirementModelDiagram.STEREOTYPE_NAME);
    }

}
