package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.ui.WizardExport;

public class ExportModelCommand extends DefaultModuleCommandHandler {

//    private String directoryOutputPath;

    public ExportModelCommand(){
        super();
    }

    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {

        final WizardExport dialog = new WizardExport(Display.getCurrent().getActiveShell(), module);
        dialog.setSelectedElt((org.modelio.metamodel.uml.statik.Package) selectedElements.get(0));
        dialog.open();

    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (((selectedElement instanceof org.modelio.metamodel.uml.statik.Package
                            && ((org.modelio.metamodel.uml.statik.Package)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME))));
        }
        return false;
    }

}
