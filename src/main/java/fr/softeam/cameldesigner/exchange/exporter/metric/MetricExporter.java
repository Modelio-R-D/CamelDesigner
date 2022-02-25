package fr.softeam.cameldesigner.exchange.exporter.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c461fa12-8677-49a1-b477-4e0ab772cd42")
public abstract class MetricExporter<T extends Metric> extends FeatureExporter<T> {
    @objid ("9572bd89-7ce9-4225-a538-8a4c0861e02c")
    public MetricExporter(T elt) {
        super(elt);
    }

    @objid ("0afa80fd-c2be-4ef4-bcce-eedafa66a782")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("0a833fac-1a04-4933-9445-efbbe04a235a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.Metric) {
            camel.metric.Metric metric = (camel.metric.Metric) elt;
            setMetricTemplate(metric);
        }
    }

    @objid ("d8cb3b4c-17d2-41c6-9bfd-303700c2ef6f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.Metric)) {
            ((camel.metric.MetricTypeModel) context).getMetrics().add((camel.metric.Metric) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("d79cf6fa-feb1-456d-87f8-ed436e877c83")
    private void setMetricTemplate(camel.metric.Metric metric) {
        CDOObject mt = this._process.getElement(this._element.getMetricTemplate());
        if ((mt != null) &&  (mt instanceof camel.metric.MetricTemplate))
            metric.setMetricTemplate((camel.metric.MetricTemplate) mt);
    }

}
