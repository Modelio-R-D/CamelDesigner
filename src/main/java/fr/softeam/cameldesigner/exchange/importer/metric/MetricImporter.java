package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.Metric;
import camel.metric.MetricTemplate;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("787bdf61-408f-4ed0-b683-b343d17a87a9")
public class MetricImporter<T extends Metric, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric> extends FeatureImporter<T,V> {
    @objid ("cc730c99-ba43-4989-bae1-a101b7f8d7dd")
    public MetricImporter() {
    }

    @objid ("6f287ff6-f180-48a0-8de9-1592ffde6441")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetric(this);
    }

    @objid ("be8c6c3d-852c-4ef5-bf54-feb8d3ddc0d5")
    public MetricImporter(T elt) {
        super(elt);
    }

    @objid ("91bc81c6-5d8c-4cb2-86df-e32daae635b0")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric.create();
    }

    @objid ("0694c937-5ce5-4b3b-a036-75362bd43afb")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
            ((MetricTypeModel) context).addMetrics(elt);
    }

    @objid ("0110e4f7-46a2-41d0-a80d-07e9dc3f40e9")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setMetricTemplate(elt);
    }

    @objid ("8a7e8cda-5a1a-4c62-af01-176ab7ce5cd0")
    private void setMetricTemplate(V elt) {
        MetricTemplate value = this._element.getMetricTemplate();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate) {
                elt.setMetricTemplate((fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate) valueElt);
            }
        }
    }

}
