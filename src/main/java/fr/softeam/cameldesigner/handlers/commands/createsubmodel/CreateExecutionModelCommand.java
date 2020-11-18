package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

public class CreateExecutionModelCommand extends CreateCamelSubModelCommand {
    public CreateExecutionModelCommand() {
        super("Execution Model", ExecutionModel.STEREOTYPE_NAME, "Execution Model Diagram", ExecutionModelDiagram.STEREOTYPE_NAME);
    }

}
