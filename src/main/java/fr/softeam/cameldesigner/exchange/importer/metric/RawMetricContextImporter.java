package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.GroupingType;
import camel.metric.RawMetricContext;
import camel.metric.Sensor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c03ab132-4671-4386-bff1-c1980b07520c")
public class RawMetricContextImporter<T extends RawMetricContext, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext> extends MetricContextImporter<T,V> {
    @objid ("34976379-48ea-43a8-a923-05a6a8327d4a")
    public RawMetricContextImporter() {
    }

    @objid ("d6c2ad4b-ee85-4ceb-aea8-eba70823871f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRawMetricContext(this);
    }

    @objid ("1d8c899f-87e0-4c43-b96e-bc833e14abb6")
    public RawMetricContextImporter(T elt) {
        super(elt);
    }

    @objid ("fbda8a2e-d4c0-4c87-aff1-40b5e039c4a5")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.create();
    }

    @objid ("29376d24-437c-4145-b0f9-b00466737d5e")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("6a018a7e-36d6-4f33-ad49-984857ddd1e5")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setSensor(elt);
    }

    @objid ("c7b865b4-826c-4276-be17-3ed8ac3223fc")
    private void setSensor(V elt) {
        // TODO Auto-generated method stub
        Sensor value = this._element.getSensor();
        if (value != null) {
            elt.setSensor((fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor) value);
        }
    }

}
