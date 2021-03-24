package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.ElementCreationStandardHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CreateRequirementModelDiagram extends ElementCreationStandardHandler {
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // Do not remove this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    @Override
    protected void postConfigureElement(final MObject newElement, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method
        super.postConfigureElement(newElement, module);
        
        // TODO Add additional behavior below
    }

}
