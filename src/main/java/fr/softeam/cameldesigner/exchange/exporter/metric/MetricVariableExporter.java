package fr.softeam.cameldesigner.exchange.exporter.metric;

import java.util.ArrayList;
import java.util.List;
import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ed90d4e1-4a65-4145-8320-f0e7341a02e5")
public class MetricVariableExporter<T extends MetricVariable> extends MetricExporter<T> {
    @objid ("397b3951-d942-448d-b1f2-52869877a671")
    public MetricVariableExporter(T elt) {
        super(elt);
    }

    @objid ("4b8a5f42-0b1b-44d0-afa6-4e807bcfaad2")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricVariable();
    }

    @objid ("6e89d0e3-074a-4ffc-81a3-7e7a9d9e244a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.MetricVariable) {
            camel.metric.MetricVariable cMetric = (camel.metric.MetricVariable) elt;
            setCurrentConfiguration(cMetric);
            setComponent(cMetric);
            setOnNodeCandidates(cMetric);
            setFormula(cMetric);
            setComponentMetrics(cMetric);
            setMetricContext(cMetric);
        }
    }

    @objid ("2d945b9f-271c-4955-815e-e4a44110501b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("20425670-2107-4423-820d-f2372e317724")
    private void setComponentMetrics(camel.metric.MetricVariable cMetric) {
        List<camel.metric.Metric> metrics = new ArrayList<>();
        for (Metric metric : this._element.getComponentMetrics()) {
            CDOObject camelMetric = this._process.getElement(metric);
            if ((camelMetric != null) &&  (camelMetric instanceof camel.metric.Metric))
                metrics.add((camel.metric.Metric) camelMetric);
        }
        
        cMetric.getComponentMetrics().addAll(metrics);
    }

    @objid ("998a3456-2b3a-42ae-ab8e-d3fa7a54cd28")
    private void setFormula(camel.metric.MetricVariable cMetric) {
        String content = this._element.getFormula();
        if (content != null)
            cMetric.setFormula(content);
    }

    @objid ("f5312ced-87aa-473d-bfd2-6930f1542fcc")
    private void setOnNodeCandidates(camel.metric.MetricVariable cMetric) {
        cMetric.setOnNodeCandidates(this._element.isOnNodeCandidates());
    }

    @objid ("5ccc9fa4-c6d9-4dfc-bccd-03a9eb44532c")
    private void setComponent(camel.metric.MetricVariable cMetric) {
        CDOObject comp = this._process.getElement(this._element.getComponent());
        if ((comp != null) &&  (comp instanceof camel.deployment.Component))
            cMetric.setComponent((camel.deployment.Component) comp);
    }

    @objid ("4947ca44-8c6b-4bef-a221-d40516c83a5e")
    private void setCurrentConfiguration(camel.metric.MetricVariable cMetric) {
        cMetric.setCurrentConfiguration(this._element.isCurrentConfiguration());
    }

    @objid ("1662481d-581c-4fce-8933-c4fb12d7f9dc")
    private void setMetricContext(camel.metric.MetricVariable cMetric) {
        CDOObject mc = this._process.getElement(this._element.getMetricContext());
        if ((mc != null) &&  (mc instanceof camel.metric.MetricContext))
            cMetric.setMetricContext((camel.metric.MetricContext) mc);
    }

}
