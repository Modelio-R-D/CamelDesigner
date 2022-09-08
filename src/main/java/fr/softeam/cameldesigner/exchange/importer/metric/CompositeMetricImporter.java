package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.CompositeMetric;
import camel.metric.Metric;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("e5dec646-8615-41e5-9b92-9008317d9bb8")
public class CompositeMetricImporter<T extends CompositeMetric, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric> extends MetricImporter<T,V> {
    @objid ("18658a4d-592f-46af-a905-d0a002ea492e")
    public CompositeMetricImporter() {
    }

    @objid ("8aca5a84-b2a7-4fbb-bd39-d4ecd22a5330")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCompositeMetric(this);
    }

    @objid ("c235ed74-1b75-4736-906f-7d90716a8b82")
    public CompositeMetricImporter(T elt) {
        super(elt);
    }

    @objid ("f398ee6f-6e9c-46c7-a174-efb4cebfcfa8")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.create();
    }

    @objid ("abfa7e96-a41f-4ebe-a32c-effe552faa42")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("f9557266-ab75-4bdc-a8ba-46f23f5fbfa8")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setFormula(elt);
        setComponentMetrics(elt);
    }

    @objid ("62e73243-b2b3-48ee-af96-0c8d4a6fb23d")
    private void setFormula(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getFormula();
        if (value != null) {
            elt.setFormula(value);
        }
    }

    @objid ("c652b45e-fb2f-41d8-914e-116db2dfbf06")
    private void setComponentMetrics(V elt) {
        // TODO Auto-generated method stub
        EList<Metric> values = this._element.getComponentMetrics();
        if (values != null) {
            for( Metric component: values)
            elt.addComponentMetrics((fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric) component);
        }
    }

}
