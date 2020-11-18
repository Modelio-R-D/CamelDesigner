package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

public class CreateUnitModelCommand extends CreateCamelSubModelCommand {
    public CreateUnitModelCommand() {
        super("Unit Model", UnitModel.STEREOTYPE_NAME, "Unit Model Diagram", UnitModelDiagram.STEREOTYPE_NAME);
    }

}
