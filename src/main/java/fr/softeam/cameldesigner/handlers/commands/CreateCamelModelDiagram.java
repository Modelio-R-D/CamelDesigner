package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.ElementCreationStandardHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("fe97c0c4-f5c2-4d0f-a091-6aa0134de816")
public class CreateCamelModelDiagram extends ElementCreationStandardHandler {
    @objid ("f6309d96-74ea-41df-9fe3-33dfe227fe9e")
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

    @objid ("250651f6-75cb-4e73-9fb9-13dc5fdb3741")
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
