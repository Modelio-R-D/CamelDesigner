package fr.softeam.cameldesigner.exchange.exporter.metric;

import java.util.ArrayList;
import java.util.List;
import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureInstanceExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("aef4c746-61e9-45d4-9055-3b3e0e4a5942")
public class MetricInstanceExporter<T extends MetricInstance> extends FeatureInstanceExporter<T> {
    @objid ("70e6e0ef-387e-45d3-99e2-2a8a6b2955f0")
    public MetricInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("6805acd4-667d-4102-84bd-ec56ee992be1")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricInstance();
    }

    @objid ("8fd021f0-1bb3-49fb-9e32-1c200eb8ab24")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.MetricInstance) {
            camel.metric.MetricInstance mi = (camel.metric.MetricInstance) elt;
            setObjectBinding(mi);
            setMetricContext(mi);
            setComposingMetricInstances(mi);
        }
    }

    @objid ("578679c5-520a-4110-aeb3-9e3284d29ed1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricInstanceModel) && (elt instanceof camel.metric.MetricInstance)) {
            ((camel.metric.MetricInstanceModel) context).getMetricInstances().add((camel.metric.MetricInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("0b436703-7136-4aaa-85cf-6c123858d66e")
    private void setObjectBinding(camel.metric.MetricInstance mi) {
        CDOObject ob = this._process.getElement(this._element.getObjectBinding());
        if ((ob != null) &&  (ob instanceof camel.metric.MetricObjectBinding))
            mi.setObjectBinding((camel.metric.MetricObjectBinding) ob);
    }

    @objid ("125a73a2-277b-417b-9f29-1314e503003a")
    private void setMetricContext(camel.metric.MetricInstance mi) {
        CDOObject mc = this._process.getElement(this._element.getMetricContext());
        if ((mc != null) &&  (mc instanceof camel.metric.MetricContext))
            mi.setMetricContext((camel.metric.MetricContext) mc);
    }

    @objid ("b310f071-0606-4838-ab38-c5d472c7bbba")
    private void setComposingMetricInstances(camel.metric.MetricInstance mi) {
        List<camel.metric.MetricInstance> metricInstances = new ArrayList<>();
        for (MetricInstance cmi : this._element.getComposingMetricInstances()) {
            CDOObject camelMI = this._process.getElement(cmi);
            if ((camelMI != null) &&  (camelMI instanceof camel.metric.MetricInstance))
                metricInstances.add((camel.metric.MetricInstance) camelMI);
        }
        
        mi.getComposingMetricInstances().addAll(metricInstances);
    }

}
