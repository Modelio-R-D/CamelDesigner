package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.MetricTypeModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ddac174d-8c25-40f5-a6cb-3bfafff3d5f6")
public class MetricTypeModelImporter<T extends MetricTypeModel, V extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel> extends MetricModelImporter<T,V> {
    @objid ("df9c2f0e-8aee-4062-9969-5ddcef6dbd99")
    public MetricTypeModelImporter() {
    }

    @objid ("248cdccd-94c0-4f2d-8036-69918f55396c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricTypeModel(this);
    }

    @objid ("c8aa14c6-ae6b-4d3f-8748-0ff1047839c3")
    public MetricTypeModelImporter(T elt) {
        super(elt);
    }

    @objid ("76e01dff-31d5-4bcd-877b-47da7f371251")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.create();
    }

    @objid ("013d7f4f-3c18-42ee-b76c-9191db3e57a5")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
