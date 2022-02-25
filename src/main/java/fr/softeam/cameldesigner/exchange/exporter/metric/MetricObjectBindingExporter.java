package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f0963493-13ba-4042-b41f-a5c56439ad00")
public class MetricObjectBindingExporter<T extends MetricObjectBinding> extends FeatureExporter<T> {
    @objid ("1b4baae4-8349-4c66-abfa-801335f92754")
    public MetricObjectBindingExporter(T elt) {
        super(elt);
    }

    @objid ("6098740d-f457-47b4-823e-fb9ab9109933")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricObjectBinding();
    }

    @objid ("d9570d2b-b1b0-4988-b0ae-6a58a119de91")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.MetricObjectBinding) {
            camel.metric.MetricObjectBinding mob = (camel.metric.MetricObjectBinding) elt;
            setExecutionModel(mob);
            setComponentInstance(mob);
        }
    }

    @objid ("5d99b341-8151-4b1c-a2ba-c7a1cc218086")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricInstanceModel) && (elt instanceof camel.metric.MetricObjectBinding)) {
            ((camel.metric.MetricInstanceModel) context).getBindings().add((camel.metric.MetricObjectBinding) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("2ac48207-005c-498b-ab4d-3b95bf1b430f")
    private void setExecutionModel(camel.metric.MetricObjectBinding mob) {
        CDOObject model = this._process.getElement(this._element.getExecutionModel());
        if ((model != null) &&  (model instanceof camel.execution.ExecutionModel))
            mob.setExecutionModel((camel.execution.ExecutionModel) model);
    }

    @objid ("f7da6ae9-41f3-4a34-bbd5-4a1546db4c4f")
    private void setComponentInstance(camel.metric.MetricObjectBinding mob) {
        CDOObject comp = this._process.getElement(this._element.getComponentInstance());
        if ((comp != null) &&  (comp instanceof camel.deployment.ComponentInstance))
            mob.setComponentInstance((camel.deployment.ComponentInstance) comp);
    }

}
