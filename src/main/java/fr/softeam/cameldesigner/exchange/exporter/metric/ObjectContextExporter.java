package fr.softeam.cameldesigner.exchange.exporter.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.metric.MetricFactory;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

@objid ("2c326d08-0764-4f77-a4e1-29a0b12640c1")
public class ObjectContextExporter<T extends ObjectContext> extends FeatureExporter<T> {
    @objid ("e20697aa-b79b-425c-b788-4cd4d24d8564")
    public ObjectContextExporter(T elt) {
        super(elt);
    }

    @objid ("a9aef6ff-21e6-4fb5-ad59-93a776aa6812")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createObjectContext();
    }

    @objid ("b9adb648-dba7-4f3b-919e-85823218d41d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.ObjectContext) {
            camel.metric.ObjectContext oc = (camel.metric.ObjectContext) elt;
            setComponent(oc);
            setData(oc);
        }
    }

    private void setData(camel.metric.ObjectContext oc) {
        // TODO Auto-generated method stub

    }

    private void setComponent(camel.metric.ObjectContext oc) {
        CDOObject comp = this._process.getElement(this._element.getComponent());
        if (comp instanceof camel.deployment.Component)
            oc.setComponent((camel.deployment.Component) comp);

    }

    @objid ("19a6e2d9-57d9-4ae2-9118-ab822d3c732e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.ObjectContext)) {
            ((camel.metric.MetricTypeModel) context).getObjectContexts().add((camel.metric.ObjectContext) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
