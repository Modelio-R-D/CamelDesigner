package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import org.eclipse.emf.cdo.CDOObject;

@objid ("af89367e-2792-4043-b7e3-8f0c2ac99589")
public class MetricInstanceModelExporter<T extends MetricInstanceModel> extends MetricModelExporter<T> {
    @objid ("92bc1484-7bd6-4f99-a7e3-6e595918cde2")
    public MetricInstanceModelExporter(T elt) {
        super(elt);
    }

    @objid ("1bed9a62-91fd-467e-a2f7-aee527a497f9")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricInstanceModel();
    }

    @objid ("f0cc154d-b572-4e2d-afcc-d03901dd0e89")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.MetricInstanceModel) {
            setType( (camel.metric.MetricInstanceModel) elt);
        }
    }

    @objid ("81431a6c-9ccd-4ef2-8798-08a74258cc3f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("80c2584f-7ccd-403e-8818-cd72d3d02ea7")
    private void setType(camel.metric.MetricInstanceModel elt) {
        CDOObject type = this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.metric.MetricTypeModel))
            elt.setType((camel.metric.MetricTypeModel) type);
    }

}
