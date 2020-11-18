package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

public class CreateTypeModelCommand extends CreateCamelSubModelCommand {
    public CreateTypeModelCommand() {
        super("Type Model", TypeModel.STEREOTYPE_NAME, "Type Model Diagram", TypeModelDiagram.STEREOTYPE_NAME);
    }

}
