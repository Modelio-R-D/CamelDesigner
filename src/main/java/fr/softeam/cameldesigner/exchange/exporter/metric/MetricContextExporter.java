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
        if (elt instanceof camel.metric.MetricContext) {
            camel.metric.MetricContext context = (camel.metric.MetricContext) elt;
            setMetric(context);
            setSchedule(context);
            setObjectContext(context);
        }
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

    @objid ("53484584-1d4e-4339-bf27-379a27a5e672")
    private void setObjectContext(camel.metric.MetricContext context) {
        CDOObject objContext = this._process.getElement(this._element.getObjectContext());
        if ((objContext != null) &&  (objContext instanceof camel.metric.ObjectContext))
            context.setObjectContext((camel.metric.ObjectContext) objContext);
    }

    @objid ("706d35bf-e13b-4c4c-9d9a-904e38974ba6")
    private void setSchedule(camel.metric.MetricContext context) {
        CDOObject schedule = this._process.getElement(this._element.getSchedule());
        if ((schedule != null) &&  (schedule instanceof camel.metric.Schedule))
            context.setSchedule((camel.metric.Schedule) schedule);
    }

    @objid ("86a87fa4-8ed5-47a3-9058-ca21fa3ce8e6")
    private void setMetric(camel.metric.MetricContext context) {
        CDOObject metric = this._process.getElement(this._element.getMetric());
        if ((metric != null) &&  (metric instanceof camel.metric.Metric))
            context.setMetric((camel.metric.Metric) metric);
    }

}
