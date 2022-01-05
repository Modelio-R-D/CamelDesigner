package fr.softeam.cameldesigner.exchange.exporter.metric;

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
    }

    @objid ("578679c5-520a-4110-aeb3-9e3284d29ed1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
