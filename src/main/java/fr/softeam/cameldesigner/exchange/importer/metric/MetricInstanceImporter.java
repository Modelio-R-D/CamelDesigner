package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.MetricInstance;
import camel.metric.MetricObjectBinding;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("231a5520-5aa8-4e3b-ae77-fd65a434786b")
public class MetricInstanceImporter<T extends MetricInstance, V extends fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance> extends FeatureImporter<T,V> {
    @objid ("9de927c7-6b4f-4709-9853-7b4469494bde")
    public MetricInstanceImporter() {
    }

    @objid ("568d8e20-6f5f-48e5-8f83-128079b90097")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricInstance(this);
    }

    @objid ("67cbda2d-c05d-4192-a887-73b4d5be102f")
    public MetricInstanceImporter(T elt) {
        super(elt);
    }

    @objid ("6c4f1bce-0078-4a5d-9081-182b14d10d17")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.create();
    }

    @objid ("2dda442c-38cf-4441-8d2d-ba0024ce1898")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricInstanceModel)
        ((MetricInstanceModel)context).addMetricInstances(elt);
    }

    @objid ("837ca87c-8c6a-46f0-b880-b0b6b2bef9e2")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setObjectBinding(elt);
        setMetricContext(elt);
        setComposingMetricInstances(elt);
    }

    @objid ("c8fb3f2b-0285-4752-abb9-51eed10df8c7")
    private void setObjectBinding(V elt) {
        // TODO Auto-generated method stub
        MetricObjectBinding value = this._element.getObjectBinding();
        if (value != null) {
            elt.setObjectBinding((fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding) value);
        }
    }

    @objid ("fced527a-00d5-4224-aaea-34504205a009")
    private void setMetricContext(V elt) {
        // TODO Auto-generated method stub
        camel.metric.MetricContext value = this._element.getMetricContext();
        if (value != null) {
            elt.setMetricContext((MetricContext) value);
        }
    }

    @objid ("e4d07a37-3d1c-4d90-b080-fe4eca84716f")
    private void setComposingMetricInstances(V elt) {
        // TODO Auto-generated method stub
        EList<MetricInstance> value = this._element.getComposingMetricInstances();
        if (value != null) {
            for (MetricInstance v : value)
            elt.addComposingMetricInstances((fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance) v);
        }
    }

}
