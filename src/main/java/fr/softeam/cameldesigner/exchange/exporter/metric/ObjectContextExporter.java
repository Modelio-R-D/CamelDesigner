package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

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

    @objid ("19a6e2d9-57d9-4ae2-9118-ab822d3c732e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.ObjectContext)) {
            ((camel.metric.MetricTypeModel) context).getObjectContexts().add((camel.metric.ObjectContext) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("9be9d282-d8ae-469a-826a-4a34c399d146")
    private void setData(camel.metric.ObjectContext oc) {
        CDOObject data = this._process.getElement(this._element.getData());
        if ((data != null) && (data instanceof camel.data.Data))
            oc.setData((camel.data.Data) data);
    }

    @objid ("d3409c38-4e99-44cd-92f6-aeccc229650b")
    private void setComponent(camel.metric.ObjectContext oc) {
        CDOObject comp = this._process.getElement(this._element.getComponent());
        if ((comp != null) &&  (comp instanceof camel.deployment.Component))
            oc.setComponent((camel.deployment.Component) comp);
    }

}
