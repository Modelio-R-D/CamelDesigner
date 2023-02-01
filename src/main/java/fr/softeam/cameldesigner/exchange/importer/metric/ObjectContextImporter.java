package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.data.Data;
import camel.deployment.Component;
import camel.metric.ObjectContext;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("68f0b0b6-1465-43f8-b017-e549fb90a70d")
public class ObjectContextImporter<T extends ObjectContext, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext> extends FeatureImporter<T,V> {
    @objid ("bd7f4ca5-c091-442c-9960-721fc38842f6")
    public ObjectContextImporter() {
    }

    @objid ("bee6e44a-ad3a-4c27-a82d-e901e34d1249")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitObjectContext(this);
    }

    @objid ("7c91ad3c-9b83-4d31-aff9-8991478a8431")
    public ObjectContextImporter(T elt) {
        super(elt);
    }

    @objid ("7bdd7d48-a294-4815-bf59-ef2e264d3345")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.create();
    }

    @objid ("775d00d9-ecf1-4556-bf82-b14a710f8d2e")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel)context).addObjectContexts(elt);
    }

    @objid ("bf33f30f-b159-4903-a9e1-03299ad2a222")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setComponent(elt);
        setData(elt);
    }

    @objid ("851169c7-8bb3-495f-b583-8e56fa32810d")
    private void setComponent(V elt) {
        // TODO Auto-generated method stub
        Component value = this._element.getComponent();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof CamelComponent) {
                elt.setComponent((CamelComponent) valueElt);
        
            }
        }
    }

    @objid ("6ac43895-1eb4-4912-83a5-d1010a38a662")
    private void setData(V elt) {
        // TODO Auto-generated method stub
        Data value = this._element.getData();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.datamodel.standard.class_.Data) {
                elt.setData((fr.softeam.cameldesigner.api.datamodel.standard.class_.Data) valueElt);
        
            }
          }
    }

}
