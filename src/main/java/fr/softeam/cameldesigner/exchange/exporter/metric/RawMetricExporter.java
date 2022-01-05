package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4d1511fa-b3d3-4aa8-9721-7eb6b05c3179")
public class RawMetricExporter<T extends RawMetric> extends MetricExporter<T> {
    @objid ("5027fae3-8019-48d7-89fe-712ab849b540")
    public RawMetricExporter(T elt) {
        super(elt);
    }

    @objid ("8545b21e-0c07-4b8e-b79b-96be12616f7d")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createRawMetric();
    }

    @objid ("510db37f-57ed-4166-8975-7965b1b9d36a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3dc406d5-ef34-462a-8072-578ecebe7b0a")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
