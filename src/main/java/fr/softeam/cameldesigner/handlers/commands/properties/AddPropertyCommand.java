package fr.softeam.cameldesigner.handlers.commands.properties;

import java.util.List;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.dialogs.AddPropertyDialog;
import fr.softeam.cameldesigner.impl.CamelDesignerPeerModule;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

public class AddPropertyCommand extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        AddPropertyDialog addCustomTagDialog = new AddPropertyDialog((ModelElement)selectedElements.get(0));
        addCustomTagDialog.open();
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            return selectedElements.get(0) instanceof Class
                    && ((Class) selectedElements.get(0))
                    .isStereotyped(CamelDesignerPeerModule.MODULE_NAME, CamelElement.STEREOTYPE_NAME);
        }
        return false;
    }

}
