package fr.softeam.cameldesigner.exchange.exporter.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f3792894-67f4-417a-a77d-69bfc699a9ee")
public abstract class MetricContextExporter<T extends MetricContext> extends FeatureExporter<T> {
    @objid ("00bf32b1-48e2-4ce4-a23d-2b2f97979849")
    public MetricContextExporter(T elt) {
        super(elt);
    }

    @objid ("d72e2aa0-ccbd-4bd2-a2ec-42133e944408")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("334e0fca-f208-4dec-8c25-cf67889ae2b1")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("66d769fb-3f0d-4fc1-b8e5-63ce4d7918bf")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.MetricContext)) {
            ((camel.metric.MetricTypeModel) context).getMetricContexts().add((camel.metric.MetricContext) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
