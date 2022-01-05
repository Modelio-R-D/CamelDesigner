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
    }

    @objid ("5d99b341-8151-4b1c-a2ba-c7a1cc218086")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
