package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

public class CreateSecurityModelCommand extends CreateCamelSubModelCommand {
    public CreateSecurityModelCommand() {
        super("Security Model", SecurityModel.STEREOTYPE_NAME, "Security Model Diagram", SecurityModelDiagram.STEREOTYPE_NAME);
    }

}
