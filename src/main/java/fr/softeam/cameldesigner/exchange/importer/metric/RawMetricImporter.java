package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.RawMetric;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1c0ab182-4f06-434e-9c8a-babfd16851b7")
public class RawMetricImporter<T extends RawMetric, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric> extends MetricImporter<T,V> {
    @objid ("548b9d4d-dc6e-496e-bd25-4d997b5af5fa")
    public RawMetricImporter() {
    }

    @objid ("9902ad82-a392-4af3-ab87-36776271a06c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRawMetric(this);
    }

    @objid ("14874809-6ee9-4c5e-be33-bfdfb6b2fd57")
    public RawMetricImporter(T elt) {
        super(elt);
    }

    @objid ("2aae1c80-d0cb-413d-82ea-0b9d369cef8c")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.create();
    }

    @objid ("a3ede75f-b5f1-4789-a3c0-164a5fe28c4f")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
