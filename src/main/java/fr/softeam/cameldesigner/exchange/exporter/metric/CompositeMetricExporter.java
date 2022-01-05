package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import org.eclipse.emf.cdo.CDOObject;

@objid ("644b5de3-fe97-4c23-9204-7c98bbe1f91d")
public class CompositeMetricExporter<T extends CompositeMetric> extends MetricExporter<T> {
    @objid ("fe268c94-5a66-4877-9964-e3eae3024775")
    public CompositeMetricExporter(T elt) {
        super(elt);
    }

    @objid ("4b4e37e0-7697-4770-a849-e828a597bd00")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createCompositeMetric();
    }

    @objid ("2e339251-740e-475f-bdda-e33a107ab8f1")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("eb1854a1-7540-4fc2-a839-06ffdfabd61f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
