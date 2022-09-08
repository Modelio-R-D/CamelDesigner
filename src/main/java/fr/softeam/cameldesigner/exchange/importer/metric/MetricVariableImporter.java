package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.deployment.Component;
import camel.metric.MetricVariable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("64696521-1232-4be9-8a1d-f727a4f4e9a2")
public class MetricVariableImporter<T extends MetricVariable, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable> extends MetricImporter<T,V> {
    @objid ("0d056719-771e-4d15-8341-aaee1cbc77e7")
    public MetricVariableImporter() {
    }

    @objid ("41a1adf2-c2f6-4c63-9910-d7551d5b9e93")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricVariable(this);
    }

    @objid ("409c2d83-1fe0-4a66-8296-764c7a4af8af")
    public MetricVariableImporter(T elt) {
        super(elt);
    }

    @objid ("d331d808-01c9-4cbd-812a-27532433618a")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.create();
    }

    @objid ("89eab71c-9f31-45dd-bb20-7ccc7e1f7674")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel)context).addMetrics(elt);
    }

    @objid ("4e6308fd-be01-4808-b163-2a6d13f93c8a")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setCurrentConfiguration(elt);
        setComponent(elt);
        setOnNodeCandidates(elt);
        setFormula(elt);
        setComponentMetrics(elt);
    }

    @objid ("15f004c1-b685-48d2-8cd8-200036841c8b")
    private void setCurrentConfiguration(V elt) {
        // TODO Auto-generated method stub
        Boolean value = this._element.isCurrentConfiguration();
        if (value != null) {
            elt.setCurrentConfiguration(value);
        }
    }

    @objid ("e05a12a2-8973-4e56-83a0-4e81cc05bf94")
    private void setComponent(V elt) {
        // TODO Auto-generated method stub
        Component value = this._element.getComponent();
        if (value != null) {
            elt.setComponent((CamelComponent) value);
        }
    }

    @objid ("6a166f0f-2998-4ea8-a3df-2848f663a9a7")
    private void setOnNodeCandidates(V elt) {
        // TODO Auto-generated method stub
        Boolean value = this._element.isOnNodeCandidates();
        if (value != null) {
            elt.setOnNodeCandidates(value);
        }
    }

    @objid ("c01be08c-8f42-48fe-bfcd-c97dd384dcdc")
    private void setFormula(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getFormula();
        if (value != null) {
            elt.setFormula(value);
        }
    }

    @objid ("6e15027b-cbcd-4acf-a3d0-431457ddf13e")
    private void setComponentMetrics(V elt) {
        // TODO Auto-generated method stub
        EList<camel.metric.Metric> values = this._element.getComponentMetrics();
        if (values != null) {
            for( camel.metric.Metric component: values)
            elt.addComponentMetrics((Metric) component);
        }
    }

}
