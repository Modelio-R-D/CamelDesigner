package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.ElementCreationStandardHandler;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2f8491c0-0b4e-4cc4-b6fd-474443dc4e2a")
public class IfThenConstraintCommand extends ElementCreationStandardHandler {
    @objid ("18da76c8-4554-40cd-8697-6a445fece667")
    private CamelConstraint _if = null;

    @objid ("cba6e166-d43c-4abe-8c8b-d2a3e6fcf880")
    private CamelConstraint _then = null;

    @objid ("46e5ca8b-cf46-43aa-9524-0aaf7d673cbe")
    private CamelConstraint _else = null;

    @objid ("e264e86d-78aa-49bf-a604-229dcaaa1525")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // Do not remove this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        
        if (selectedElements.size() > 2) {
        
            this._if = CamelConstraint.instantiate((Constraint)selectedElements.get(0));
            this._then = CamelConstraint.instantiate((Constraint)selectedElements.get(1));
        
            if (selectedElements.size() == 3) {
                this._else = CamelConstraint.instantiate((Constraint)selectedElements.get(2));
            }
        
            return true;
        }
        return  false;
    }

    @objid ("5cc501ad-2934-4253-ad9e-23501cb08005")
    @Override
    protected void postConfigureElement(final MObject newElement, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.
        
        // Call the super method
        super.postConfigureElement(newElement, module);
        
        Constraint constraint = (Constraint) newElement;
        
        constraint.getConstrainedElement().add(this._if.getElement());
        constraint.getConstrainedElement().add(this._then.getElement());
        
        if (this._else != null) {
            constraint.getConstrainedElement().add(this._else.getElement());
        }
    }

}
