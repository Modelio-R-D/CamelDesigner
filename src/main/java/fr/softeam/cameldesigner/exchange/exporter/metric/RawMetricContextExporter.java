package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d5118cbe-bc56-4646-b0f5-6b2d9e8b5481")
public class RawMetricContextExporter<T extends RawMetricContext> extends MetricContextExporter<T> {
    @objid ("1be21d0b-1431-44cc-b8f8-2a81ecd69604")
    public RawMetricContextExporter(T elt) {
        super(elt);
    }

    @objid ("23ec693d-81cf-450c-a01f-64c62409f247")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createRawMetricContext();
    }

    @objid ("e14b8b55-8e39-49e9-ac36-84bc5723731e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.RawMetricContext) {
            setSensor((camel.metric.RawMetricContext) elt);
        }
    }

    @objid ("245a0f68-e66e-42ad-9f93-f99c6344acac")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("4a1662ae-1157-4331-9c50-45a5f706816e")
    private void setSensor(camel.metric.RawMetricContext context) {
        CDOObject sensor = this._process.getElement(this._element.getSensor());
        if ((sensor != null) &&  (sensor instanceof camel.metric.Sensor))
            context.setSensor((camel.metric.Sensor) sensor);
    }

}
