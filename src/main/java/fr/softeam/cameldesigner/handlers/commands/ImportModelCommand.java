package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.ui.WizardImport;

@objid ("1db725ea-c384-4cd8-bf87-df82b8ff219f")
public class ImportModelCommand extends DefaultModuleCommandHandler {

    @objid ("2403f9f2-9828-431f-a7a5-e0cd68fc713a")
    private String[] filterExtension = new String[] {"*.camel", "*.xmi"};

    @objid ("0e696ebc-36be-4a7b-9ad5-9e5ffde7f748")
    public ImportModelCommand() {
        super();
    }

    @objid ("4e8c4c64-40e0-4f3a-8737-137365c18a1a")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {

        final WizardImport dialog = new WizardImport(Display.getCurrent().getActiveShell());
        dialog.setSelectedElt((org.modelio.metamodel.uml.statik.Package) selectedElements.get(0));
        dialog.open();
    }

    @objid ("2ff8b106-2969-470a-b1e8-1593e23d71dd")
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
