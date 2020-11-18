package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
public class CreateMetadataModelCommand extends CreateCamelSubModelCommand {
    public CreateMetadataModelCommand() {
        super("Metadata Model", MetaDataModel.STEREOTYPE_NAME, "Metadata Model Diagram", MetadataModelDiagram.STEREOTYPE_NAME);
    }

}
