package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
public class CreateScalabilityModelCommand extends CreateCamelSubModelCommand {
    public CreateScalabilityModelCommand() {
        super("Scalability Model", ScalabilityModel.STEREOTYPE_NAME, "Scalability Model Diagram", ScalabilityModelDiagram.STEREOTYPE_NAME);
    }

}
