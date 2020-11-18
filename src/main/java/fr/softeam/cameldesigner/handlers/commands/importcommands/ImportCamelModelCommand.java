package fr.softeam.cameldesigner.handlers.commands.importcommands;

import fr.softeam.cameldesigner.elementmodel.importer.ImporterService;
import org.eclipse.xtext.resource.XtextResource;

public class ImportCamelModelCommand extends ImportModelCommand {
    public ImportCamelModelCommand() {
        super(new ImporterService(XtextResource.OPTION_RESOLVE_ALL), "*.camel");
    }

}
