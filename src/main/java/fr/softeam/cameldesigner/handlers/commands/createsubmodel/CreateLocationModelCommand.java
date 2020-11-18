package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

public class CreateLocationModelCommand extends CreateCamelSubModelCommand {
    public CreateLocationModelCommand() {
        super("Location Model", LocationModel.STEREOTYPE_NAME, "Location Model Diagram", LocationModelDiagram.STEREOTYPE_NAME);
    }

}
