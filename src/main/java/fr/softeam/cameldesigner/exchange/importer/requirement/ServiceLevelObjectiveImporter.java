package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.constraint.Constraint;
import camel.requirement.ServiceLevelObjective;
import camel.scalability.Event;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("967177c2-81e9-404d-8052-397de6fc827a")
public class ServiceLevelObjectiveImporter<T extends ServiceLevelObjective, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective> extends HardRequirementImporter<T,V> {
    @objid ("654a96b4-4238-4382-895f-453367d4685b")
    public ServiceLevelObjectiveImporter() {
    }

    @objid ("3229331a-6dbd-4011-9157-55d39fabccd3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitServiceLevelObjective(this);
    }

    @objid ("1ede365e-2b94-49f8-8e6d-d45a3f62501c")
    public ServiceLevelObjectiveImporter(T elt) {
        super(elt);
    }

    @objid ("517ea0f2-e960-421e-b8c8-13c66e3e9405")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.create();
    }

    @objid ("00045de5-c051-4efb-956f-db06f18bc3a9")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setConstraint(elt);
        setViolationEvent(elt);
    }

    @objid ("ed02ab96-166a-4621-bcb6-d3217212ceba")
    private void setConstraint(V elt) {
        // TODO Auto-generated method stub
        Constraint value = this._element.getConstraint();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof CamelConstraint) {
                elt.setConstraint((CamelConstraint) valueElt);
        
            }
        }
    }

    @objid ("4c0becaf-4663-47fd-8071-bce8a750a66a")
    private void setViolationEvent(V elt) {
        // TODO Auto-generated method stub
        Event value = this._element.getViolationEvent();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event) {
                elt.setViolationEvent((fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event) valueElt);
        
            }
        }
    }

    @objid ("887d8458-7f68-4cfd-affa-5f83a907f3d5")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

}
