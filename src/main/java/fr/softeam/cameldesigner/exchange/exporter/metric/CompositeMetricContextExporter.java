package fr.softeam.cameldesigner.exchange.exporter.metric;

import java.util.ArrayList;
import java.util.List;
import camel.metric.GroupingType;
import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
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
        if (elt instanceof camel.metric.CompositeMetricContext) {
            camel.metric.CompositeMetricContext cmc = (camel.metric.CompositeMetricContext) elt;
            setGroupingType(cmc);
            setWindow(cmc);
            setComposingMetricContexts(cmc);
        
        }
    }

    @objid ("a251a363-4ed3-4e28-92f5-e25a322e2606")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("cfa188a0-159c-41a3-900e-9cf3538f0c82")
    private void setComposingMetricContexts(camel.metric.CompositeMetricContext cmc) {
        List<camel.metric.CompositeMetricContext> cmcs = new ArrayList<>();
        for (MetricContext mContext : this._element.getComposingMetricContexts()) {
            CDOObject camelMetric = this._process.getElement(mContext);
            if ((camelMetric != null) &&  (camelMetric instanceof camel.metric.CompositeMetricContext))
                cmcs.add((camel.metric.CompositeMetricContext) camelMetric);
        }
        
        cmc.getComposingMetricContexts().addAll(cmcs);
    }

    @objid ("3492c9ec-fe0d-4eb3-8c50-a156b96fb7e1")
    private void setWindow(camel.metric.CompositeMetricContext cmc) {
        CDOObject window = this._process.getElement(this._element.getWindow());
        if ((window != null) &&  (window instanceof camel.metric.Window))
            cmc.setWindow((camel.metric.Window) window);
    }

    @objid ("38091145-cf28-4e5b-a758-2fc30baaac63")
    private void setGroupingType(camel.metric.CompositeMetricContext cmc) {
        cmc.setGroupingType(GroupingType.get(this._element.getGroupingType()));
    }

}
