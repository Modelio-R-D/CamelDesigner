package fr.softeam.cameldesigner.handlers.commands;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.ElementCreationStandardHandler;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b7332641-32c9-4556-a6c1-ce61ec280a7c")
public class LogicalConstraintCommand extends ElementCreationStandardHandler {
    @objid ("71e479f9-2784-4f76-a7e6-c838b2e4cbd4")
    private List<Constraint> _constraints = new ArrayList<>();

    @objid ("f3005d22-3630-445c-90a0-ed5aae615082")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // Do not remove this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        
        for (MObject selectedElt : selectedElements) {
            if (selectedElt instanceof Constraint) {
                this._constraints.add((Constraint) selectedElt);
            }
        }
        return true;
    }

    @objid ("d97cd55e-4bac-4ecf-8690-172c4f699c66")
    @Override
    protected void postConfigureElement(final MObject newElement, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method
        super.postConfigureElement(newElement, module);
        
        ((Constraint) newElement).getConstrainedElement().addAll(this._constraints);
    }

}
