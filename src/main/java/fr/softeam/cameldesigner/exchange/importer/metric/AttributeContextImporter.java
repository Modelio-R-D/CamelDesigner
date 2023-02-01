package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.core.Attribute;
import camel.metric.AttributeContext;
import camel.metric.ObjectContext;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("19d234c9-bf01-4dd4-b578-684fc6f3912b")
public class AttributeContextImporter<T extends AttributeContext, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext> extends FeatureImporter<T,V> {
    @objid ("4fa8e47e-9780-4658-8633-43f131007eec")
    public AttributeContextImporter() {
    }

    @objid ("ce42de6b-0eb3-4e82-8873-8ab50a19004c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitAttributeContext(this);
    }

    @objid ("db8d24f9-b5e9-4636-a084-15c08f3646cb")
    public AttributeContextImporter(T elt) {
        super(elt);
    }

    @objid ("c8d79c58-3208-4a5e-a1a7-9ab61051912b")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.create();
    }

    @objid ("d25cd489-f6b9-4fd8-a4df-d7dda870b964")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel) context).addAttributContexts(elt);
    }

    @objid ("e93cb59e-0166-4b97-af0e-9334d76d70c5")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setAttribute(elt);
        setObjectContext(elt);
    }

    @objid ("f2151f92-39a0-428b-b688-018fced17e52")
    private void setAttribute(V elt) {
        // TODO Auto-generated method stub
        Attribute value = this._element.getAttribute();
        if (value != null) {
            elt.setAttribute((CamelAttribute) value);
        }
    }

    @objid ("3360a540-8817-41e3-8fdc-18d39dee53af")
    private void setObjectContext(V elt) {
        // TODO Auto-generated method stub
        ObjectContext value = this._element.getObjectContext();
        if (value != null) {
            elt.setObjectContext((fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext) value);
        }
    }

}
