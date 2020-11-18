package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

public class CreateDataModelCommand extends CreateCamelSubModelCommand {
    public CreateDataModelCommand() {
        super("Data Model", DataTypeModel.STEREOTYPE_NAME, "Data Model Diagram", DataModelDiagram.STEREOTYPE_NAME);
    }

}
