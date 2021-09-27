package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.ui.WizardImport;

public class ImportModelCommand extends DefaultModuleCommandHandler {

//    private List<String> selectedfilesPaths;

    private String[] filterExtension = new String[] {"*.camel", "*.xmi"};

    public ImportModelCommand() {
        super();
    }

    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {

//        Package packageOwner = (Package) selectedElements.get(0);
//
//        this.selectedfilesPaths = FileSystemManager.getFileDialogPath("Select Files", this.filterExtension);
//
//        try( ITransaction transaction = module.getModuleContext().getModelingSession().createTransaction("Import Camel Model")){
//
//            for(String selectedfilePath : this.selectedfilesPaths) {
//                this.importerService.importModelFromFile(packageOwner, selectedfilePath);
//            }
//            transaction.commit ();
//        }

        final WizardImport dialog = new WizardImport(Display.getCurrent().getActiveShell());
        dialog.setSelectedElt((org.modelio.metamodel.uml.statik.Package) selectedElements.get(0));
        dialog.open();
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElt = selectedElements.get(0);
            return ((((selectedElt instanceof Package)
                            && !(selectedElt instanceof Profile)
                            && selectedElt.getStatus().isModifiable())));
        }
        return false;
    }

}
