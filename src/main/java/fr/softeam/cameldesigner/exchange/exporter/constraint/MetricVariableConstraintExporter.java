package fr.softeam.cameldesigner.exchange.exporter.constraint;

import camel.constraint.ConstraintFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3c8e9b36-4b2e-4fa1-b17b-de78729f4420")
public class MetricVariableConstraintExporter<T extends MetricVariableConstraint> extends UnaryConstraintExporter<T> {
    @objid ("9750bf0d-ab00-4f67-97c4-b34205815ac2")
    public MetricVariableConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("5833dcbf-8f5d-4c0d-be7a-4084049837d6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createMetricVariableConstraint();
    }

    @objid ("01224946-73d7-4fc2-a9e6-b7d920e4c498")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("1272e2d4-fadc-4f11-8ee1-a94fce2d5e58")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
