package fr.softeam.cameldesigner.handlers.commands.exportcommands;

import fr.softeam.cameldesigner.elementmodel.exporter.CamelExporterService;

public class ExportCamelModelCommand extends ExportModelCommand {
    public ExportCamelModelCommand() {
        super(new CamelExporterService());
    }

}
