package fr.softeam.cameldesigner.handlers.commands.importcommands;

import fr.softeam.cameldesigner.elementmodel.importer.ImporterService;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * @author kchaabouni
 */
public class ImportCamelXMIModelCommand extends ImportModelCommand {
    public ImportCamelXMIModelCommand() {
        super(new ImporterService(XMLResource.OPTION_SCHEMA_LOCATION), "*.camel");
    }

}
