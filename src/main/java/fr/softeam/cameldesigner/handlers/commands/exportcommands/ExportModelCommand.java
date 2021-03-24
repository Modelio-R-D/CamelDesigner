package fr.softeam.cameldesigner.handlers.commands.exportcommands;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.elementmodel.exporter.AbstractExporterService;
import fr.softeam.cameldesigner.utils.FileSystemManager;

public abstract class ExportModelCommand extends DefaultModuleCommandHandler {

    private String directoryOutputPath;

    private AbstractExporterService exporterService;

    public ExportModelCommand(AbstractExporterService exporterService) {
        super();
        this.exporterService = exporterService;
    }

    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        this.directoryOutputPath = FileSystemManager.getDialogDirectoryPath("Select Directory");
        if(this.directoryOutputPath != null) {
            Package camelUMLModel = (Package) selectedElements.get(0);

            this.exporterService.exportCamelUMLModelToFile(camelUMLModel, this.directoryOutputPath);

        }
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (
                    ((selectedElement instanceof org.modelio.metamodel.uml.statik.Package
                            && ((org.modelio.metamodel.uml.statik.Package)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME)
                            )));
        }
        return false;
    }

}
