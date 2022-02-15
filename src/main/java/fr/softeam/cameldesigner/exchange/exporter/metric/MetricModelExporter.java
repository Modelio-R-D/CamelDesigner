package fr.softeam.cameldesigner.exchange.exporter.metric;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;


public abstract class MetricModelExporter<T extends MetricModel> extends SubModelExporter<T> {

    public MetricModelExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }


    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }


    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.metric.MetricModel)) {
            ((camel.core.CamelModel) context).getMetricModels().add((camel.metric.MetricModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
