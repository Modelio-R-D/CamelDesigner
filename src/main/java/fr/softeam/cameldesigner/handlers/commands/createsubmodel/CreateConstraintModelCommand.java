package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
public class CreateConstraintModelCommand extends CreateCamelSubModelCommand {
    public CreateConstraintModelCommand() {
        super("ConstraintModel", ConstraintModel.STEREOTYPE_NAME, "Constraint Model Diagram", ConstraintModelDiagram.STEREOTYPE_NAME);
    }

}
