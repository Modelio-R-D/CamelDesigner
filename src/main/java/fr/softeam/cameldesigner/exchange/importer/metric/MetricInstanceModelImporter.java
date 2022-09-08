package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.MetricInstanceModel;
import camel.metric.MetricTypeModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("cb7cb090-469a-4e3b-9729-75337c5c5445")
public class MetricInstanceModelImporter<T extends MetricInstanceModel, V extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel> extends MetricModelImporter<T,V> {
    @objid ("d9f0bd75-4f3f-42a3-b3d0-fc48bc3f9e5e")
    public MetricInstanceModelImporter() {
    }

    @objid ("df4bec5a-8357-4836-afe7-70ff0c49f7ab")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricInstanceModell(this);
    }

    @objid ("7469d725-2a57-449d-aafa-7778a203d8c8")
    public MetricInstanceModelImporter(T elt) {
        super(elt);
    }

    @objid ("95430539-3ca3-4148-aec0-615c0b6b2a53")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.create();
    }

    @objid ("c844c368-5db4-42e0-8318-f8dcd253c8d7")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("fba1f17f-ba18-480e-a8a1-bf1d1662d568")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setExpression(elt);
    }

    @objid ("5404b1db-998e-4ac0-ba69-7d43a12c50f1")
    private void setExpression(V elt) {
        // TODO Auto-generated method stub
        MetricTypeModel value = this._element.getType();
        if (value != null) {
            elt.setType((fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel) value);
        }
    }

}
