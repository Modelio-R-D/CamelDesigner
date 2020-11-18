package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
public class CreateOrganisationModelCommand extends CreateCamelSubModelCommand {
    public CreateOrganisationModelCommand() {
        super("Organisation Model", OrganisationModel.STEREOTYPE_NAME, "Organisation Model Diagram", OrganisationModelDiagram.STEREOTYPE_NAME);
    }

}
