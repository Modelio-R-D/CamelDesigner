package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d8f9c7d3-424f-432b-94fd-79b57038b1d7")
public class ServiceLevelObjectiveExporter<T extends ServiceLevelObjective> extends HardRequirementExporter<T> {
    @objid ("3ca211b6-b129-44a7-a6d0-c8664bb5be67")
    public ServiceLevelObjectiveExporter(T elt) {
        super(elt);
    }

    @objid ("968d663e-4482-4e93-bc1c-4d7feb00810c")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createServiceLevelObjective();
    }

    @objid ("7b16347a-7e99-41f5-83c5-7c701319bb78")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.requirement.ServiceLevelObjective) {
            camel.requirement.ServiceLevelObjective slo = (camel.requirement.ServiceLevelObjective) elt;
            setConstraint(slo);
            setViolationEvent(slo);
        }
    }

    @objid ("f9245c87-48ac-4cda-83d6-37157225f3fb")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("3eb191a1-559b-444b-8463-b5bfb2d7bec3")
    private void setViolationEvent(camel.requirement.ServiceLevelObjective slo) {
        CDOObject event = this._process.getElement(this._element.getViolationEvent());
        if ((event != null) &&  (event instanceof camel.scalability.Event))
            slo.setViolationEvent((camel.scalability.Event) event);
    }

    @objid ("9d33f69f-66a5-4bc4-bec1-4523455ef75d")
    private void setConstraint(camel.requirement.ServiceLevelObjective slo) {
        CDOObject constraint = this._process.getElement(this._element.getConstraint());
        if ((constraint != null) &&  (constraint instanceof camel.constraint.Constraint))
            slo.setConstraint((camel.constraint.Constraint) constraint);
    }

}
