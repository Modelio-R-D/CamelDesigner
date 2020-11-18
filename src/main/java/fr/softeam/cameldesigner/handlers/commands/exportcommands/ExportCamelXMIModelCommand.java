package fr.softeam.cameldesigner.handlers.commands.exportcommands;

import fr.softeam.cameldesigner.elementmodel.exporter.XMIExporterService;

public class ExportCamelXMIModelCommand extends ExportModelCommand {
    public ExportCamelXMIModelCommand() {
        super(new XMIExporterService());
    }

}
