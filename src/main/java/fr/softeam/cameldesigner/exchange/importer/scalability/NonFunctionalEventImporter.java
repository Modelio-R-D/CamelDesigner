package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.constraint.MetricConstraint;
import camel.core.Attribute;
import camel.deployment.Component;
import camel.scalability.NonFunctionalEvent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("206dba15-c424-448e-bf2b-8acafdf8299f")
public class NonFunctionalEventImporter<T extends NonFunctionalEvent, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent> extends SingleEventImporter<T,V> {
    @objid ("5f8cfb03-4382-4897-97d5-ba86ecef9e54")
    public NonFunctionalEventImporter() {
    }

    @objid ("525f7e6b-264f-474f-a9f1-ab53dfe3fafa")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitNonFunctionalEvent(this);
    }

    @objid ("e2293f49-bca6-4068-889d-0e9439620f98")
    public NonFunctionalEventImporter(T elt) {
        super(elt);
    }

    @objid ("bca7bf39-93f7-47be-8117-40ae3ee6af18")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.create();
    }

    @objid ("cfe1bc54-6a09-4c56-a3e1-87ffdc71701d")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("c716d8f2-2018-4fa5-b794-dffd99ecfd6c")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setMetricConstraint(elt);
        setIsViolation(elt);
    }

    @objid ("5d2e0882-d5f7-463f-8a7e-76f701a3a07d")
    private void setMetricConstraint(V elt) {
        MetricConstraint value = this._element.getMetricConstraint();
        if (value != null) {
            elt.setMetricConstraint( (fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint) value);
        }
    }

    @objid ("83531196-cad5-4546-808c-aac9aeb6ad04")
    private void setIsViolation(V elt) {
        Boolean value = this._element.isIsViolation();
        if (value != null) {
            elt.setIsViolation (value);
        }
    }

}
