package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.deployment.ComponentInstance;
import camel.execution.ExecutionModel;
import camel.metric.MetricObjectBinding;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1f4c6025-a971-4521-a98f-04e3c3f5bcbd")
public class MetricObjectBindingImporter<T extends MetricObjectBinding, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding> extends FeatureImporter<T,V> {
    @objid ("0abf56b3-40f2-49f0-aa44-24f6ab921df1")
    public MetricObjectBindingImporter() {
    }

    @objid ("891bb61c-d5ec-4e8f-ac20-68f1519dc5c7")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricObjectBinding(this);
    }

    @objid ("c3e18343-f0d0-473f-b91e-68a3edddc6ad")
    public MetricObjectBindingImporter(T elt) {
        super(elt);
    }

    @objid ("b63ef91e-d824-4f6e-a636-5e19311bfc43")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.create();
    }

    @objid ("396b710a-0383-4110-bdb8-015aa8137823")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricInstanceModel)
        ((MetricInstanceModel)context).addBindings(elt);
    }

    @objid ("ed575297-2752-49b1-afb3-46c3b90f135e")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setExecutionModel(elt);
        setComponentInstance(elt);
    }

    @objid ("fc22ff22-ddc4-42b9-97b4-631895dcaf64")
    private void setExecutionModel(V elt) {
        // TODO Auto-generated method stub
        ExecutionModel value = this._element.getExecutionModel();
        if (value != null) {
            elt.setExecutionModel((fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel) value);
        }
    }

    @objid ("f64db163-f31e-4dbe-9066-26301f9d61ec")
    private void setComponentInstance(V elt) {
        // TODO Auto-generated method stub
        ComponentInstance value = this._element.getComponentInstance();
        if (value != null) {
            elt.setComponentInstance((fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance) value);
        }
    }

}
