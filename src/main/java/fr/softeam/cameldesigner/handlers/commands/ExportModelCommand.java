package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.ui.WizardExport;

@objid ("330edc55-1a9c-496d-9ac1-caa6787c7cb7")
public class ExportModelCommand extends DefaultModuleCommandHandler {

    @objid ("7bd24768-2ef2-4f62-ac28-94559e720ca1")
    public ExportModelCommand() {
        super();
    }

    @objid ("7ed9c2a8-870c-424b-8255-faaa8a7788ae")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        final WizardExport dialog = new WizardExport(Display.getCurrent().getActiveShell(), module);
        dialog.setSelectedElt((org.modelio.metamodel.uml.statik.Package) selectedElements.get(0));
        dialog.open();
    }

    @objid ("f02e675e-3fdd-44bf-8e0e-aa095c2ec51c")
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
