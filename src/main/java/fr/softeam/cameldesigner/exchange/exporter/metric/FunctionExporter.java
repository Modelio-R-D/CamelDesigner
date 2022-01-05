package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("66fc860e-2a2c-4ce8-ab1c-1c9f29d04986")
public class FunctionExporter<T extends Function> extends FeatureExporter<T> {
    @objid ("571ebf2e-8349-44ba-a094-9942d154ae90")
    public FunctionExporter(T elt) {
        super(elt);
    }

    @objid ("0da5e67f-fa18-4b1e-9d28-760da1aea1b4")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createFunction();
    }

    @objid ("a90b1aeb-d92a-47e8-8a3d-6e70b04ddc89")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("bd966468-f336-44da-88a4-78b5e0a52240")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
