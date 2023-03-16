package fr.softeam.cameldesigner.exchange.exporter.constraint;

import camel.constraint.ConstraintFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("962c9c38-37ef-4fd3-851f-8ef94e828a07")
public class MetricConstraintExporter<T extends MetricConstraint> extends ConstraintExporter<T> {
    @objid ("779c3093-e85d-4f26-a39e-8c9d36bb58ad")
    public MetricConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("fe261c79-e6e1-49b6-9e8b-fb285aabfaab")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createMetricConstraint();
    }

    @objid ("a72e26ca-c43e-4747-bb54-fcd8b7eb60d8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.constraint.MetricConstraint) {
            camel.constraint.MetricConstraint metConst = (camel.constraint.MetricConstraint) elt;
            setMetricContext(metConst);
        }
    }

    @objid ("89efa030-7cd1-495e-ada9-ea8adce62697")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("9c964c2e-7b2b-4de5-8aa3-fd1134221bef")
    private void setMetricContext(camel.constraint.MetricConstraint metConst) {
        CDOObject metContext =  this._process.getElement(this._element.getMetricContext());
        if ((metContext != null) &&  (metContext instanceof camel.metric.MetricContext))
            metConst.setMetricContext((camel.metric.MetricContext) metContext);
    }

}
