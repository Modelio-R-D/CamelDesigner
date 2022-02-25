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
        }
    }

    @objid ("2d945b9f-271c-4955-815e-e4a44110501b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("e9363f2b-bdf4-4d45-826e-5f1ac3281872")
    private void setComponentMetrics(camel.metric.MetricVariable cMetric) {
        List<camel.metric.Metric> metrics = new ArrayList<>();
        for (Metric metric : this._element.getComponentMetrics()) {
            CDOObject camelMetric = this._process.getElement(metric);
            if ((camelMetric != null) &&  (camelMetric instanceof camel.metric.Metric))
                metrics.add((camel.metric.Metric) camelMetric);
        }
        
        cMetric.getComponentMetrics().addAll(metrics);
    }

    @objid ("bd673c8f-dd2f-4c12-9508-283076ba1152")
    private void setFormula(camel.metric.MetricVariable cMetric) {
        cMetric.setFormula(this._element.getFormula());
    }

    @objid ("9e72bbf2-322a-4c0e-8898-1e1ffa93a556")
    private void setOnNodeCandidates(camel.metric.MetricVariable cMetric) {
        cMetric.setOnNodeCandidates(this._element.isOnNodeCandidates());
    }

    @objid ("1995d60d-bd4b-4af4-a8c9-e3f96d8887f8")
    private void setComponent(camel.metric.MetricVariable cMetric) {
        CDOObject comp = this._process.getElement(this._element.getComponent());
        if ((comp != null) &&  (comp instanceof camel.deployment.Component))
            cMetric.setComponent((camel.deployment.Component) comp);
    }

    @objid ("d4c5d243-6a51-456c-a5bc-ac78f3050f0c")
    private void setCurrentConfiguration(camel.metric.MetricVariable cMetric) {
        cMetric.setCurrentConfiguration(this._element.isCurrentConfiguration());
    }

}
