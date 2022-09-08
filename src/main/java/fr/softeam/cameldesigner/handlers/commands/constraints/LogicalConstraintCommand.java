package fr.softeam.cameldesigner.handlers.commands.constraints;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b7332641-32c9-4556-a6c1-ce61ec280a7c")
public class LogicalConstraintCommand extends DefaultModuleCommandHandler {
    @objid ("71e479f9-2784-4f76-a7e6-c838b2e4cbd4")
    private List<Constraint> _constraints = null;

    @objid ("f3005d22-3630-445c-90a0-ed5aae615082")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // Do not remove this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        
        if (selectedElements.size() > 1) {
            this._constraints = new ArrayList<>();
        
            for (MObject selectedElt : selectedElements) {
                if (selectedElt instanceof Constraint) {
                    this._constraints.add((Constraint) selectedElt);
                }
            }
        
            return true;
        }
        return false;
    }

    @objid ("23923752-b873-4de4-837e-69a1458bb855")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Deployment Instance Model")){
        
            LogicalConstraint constraint = LogicalConstraint.create();
            for (Constraint owner : this._constraints) {
                constraint.getElement().getConstrainedElement().add(owner);
            }
        
            transaction.commit();
        }
    }

}
