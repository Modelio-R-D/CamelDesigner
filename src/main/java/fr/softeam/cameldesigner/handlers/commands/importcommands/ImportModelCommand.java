package fr.softeam.cameldesigner.handlers.commands.importcommands;

import java.util.List;
import fr.softeam.cameldesigner.elementmodel.importer.ImporterService;
import fr.softeam.cameldesigner.utils.FileSystemManager;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

public abstract class ImportModelCommand extends DefaultModuleCommandHandler {
    private List<String> selectedfilesPaths;

    private String filesExtension;

    private ImporterService importerService;

    public ImportModelCommand(ImporterService importerService, String filesExtension) {
        super();
        
        this.importerService= importerService;
        
        this.filesExtension = filesExtension;
    }

    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        //this.directoryOutputPath = FileSystemManager.getFileDialogPath("Select Directory");
        
        //Class camelUMLModel = (Class) selectedElements.get(0);    
        
        //this.importerService.exportCamelUMLModel(camelUMLModel, this.directoryOutputPath);
        
        
        Package packageOwner = (Package) selectedElements.get(0);    
        
        this.selectedfilesPaths = FileSystemManager.getFileDialogPath("Select Files", this.filesExtension);
        
        try( ITransaction transaction = module.getModuleContext().getModelingSession().createTransaction("Import Camel Model")){
        
            for(String selectedfilePath : this.selectedfilesPaths) {
                this.importerService.importModelFromFile(packageOwner, selectedfilePath);
            }
            transaction.commit ();
        }
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElt = selectedElements.get(0);
            return (
                    (((selectedElt instanceof Package) 
                            && !(selectedElt instanceof Profile)
                            && selectedElt.getStatus().isModifiable())));
        }
        return false;
    }

}
