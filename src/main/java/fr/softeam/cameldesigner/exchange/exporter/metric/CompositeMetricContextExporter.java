package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f8510050-62fc-4979-a160-30893fb48115")
public class CompositeMetricContextExporter<T extends CompositeMetricContext> extends MetricContextExporter<T> {
    @objid ("189886c8-8984-4f4a-94f2-6c94bd9d326d")
    public CompositeMetricContextExporter(T elt) {
        super(elt);
    }

    @objid ("b378c945-9cd2-4b54-953d-4a2793c2ff71")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createCompositeMetricContext();
    }

    @objid ("8b34fd8f-8f51-4f86-97a2-c0c7bd7dafd7")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a251a363-4ed3-4e28-92f5-e25a322e2606")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
