package fr.softeam.cameldesigner.exchange.exporter.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.metric.MetricFactory;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;

@objid ("21d0ed34-5343-4c8a-ae11-a10d2009c757")
public class MetricTypeModelExporter<T extends MetricTypeModel> extends MetricModelExporter<T> {
    @objid ("a17f078f-c3f5-4614-9d13-bee5bd4715d9")
    public MetricTypeModelExporter(T elt) {
        super(elt);
    }

    @objid ("a287db01-4897-40ea-b946-6452e10b6f2c")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricTypeModel();
    }

    @objid ("8bb47cb5-99b8-4ab5-af9a-e3c88d15d0b0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("4e7a6e90-734d-4fa7-bda2-c1a7deb71fe8")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
