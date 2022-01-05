package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("27c06495-3a4d-4829-b90d-0d4a7d6160db")
public class MetricTemplateExporter<T extends MetricTemplate> extends FeatureExporter<T> {
    @objid ("e10d1017-89ff-4634-8d36-11371c105739")
    public MetricTemplateExporter(T elt) {
        super(elt);
    }

    @objid ("6880a81c-52bb-4630-a109-fd850692d04a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricTemplate();
    }

    @objid ("b25df162-52b7-465c-9ff8-f434d26bfdbb")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("24386cca-7605-47d7-be3a-1ba5c96d1fed")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
