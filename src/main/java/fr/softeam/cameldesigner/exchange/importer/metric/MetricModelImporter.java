package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.MetricModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;

@objid ("cedaffb8-a28c-4b26-aef6-bfbb0573d595")
public class MetricModelImporter<T extends MetricModel, V extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel> extends SubModelImporter<T,V> {
    @objid ("932668bb-8fe5-4dd3-a3bd-3a80802d7e9f")
    public MetricModelImporter() {
    }

    @objid ("396b2cd0-3690-4ec3-a00d-53cfb1c88a35")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricModel(this);
    }

    @objid ("032fdf84-14c0-423b-92b9-42b02ac803e4")
    public MetricModelImporter(T elt) {
        super(elt);
    }

    @objid ("3a5abb94-0525-478f-a8b2-4c810dd2de2d")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addMetricModels(elt);
    }

}
