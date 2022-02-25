package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("184b1094-51bf-41ce-8b9a-4e3caff1ad92")
public class AttributeContextExporter<T extends AttributeContext> extends FeatureExporter<T> {
    @objid ("415ff2d3-cef6-4288-848f-aa222f781af6")
    public AttributeContextExporter(T elt) {
        super(elt);
    }

    @objid ("d470cefa-4854-47ee-ab5e-4f464fb0fb07")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createAttributeContext();
    }

    @objid ("23651588-3e41-4430-ae71-98e41757a37d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.AttributeContext) {
            camel.metric.AttributeContext context = (camel.metric.AttributeContext) elt;
            setAttribute(context);
            setObjectContext(context);
        }
    }

    @objid ("822adfe7-5ba2-44bc-a38c-09225deac7b0")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.AttributeContext)) {
            ((camel.metric.MetricTypeModel) context).getAttributeContexts().add((camel.metric.AttributeContext) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("a2d294b0-2b3f-4695-ab57-e21619d20577")
    private void setAttribute(camel.metric.AttributeContext context) {
        CDOObject att = this._process.getElement(this._element.getAttribute());
        if ((att != null) &&  (att instanceof camel.core.Attribute))
            context.setAttribute((camel.core.Attribute) att);
    }

    @objid ("231cf793-8b85-4134-93ab-2f12b4191b63")
    private void setObjectContext(camel.metric.AttributeContext context) {
        CDOObject objContext = this._process.getElement(this._element.getObjectContext());
        if ((objContext != null) &&  (objContext instanceof camel.metric.ObjectContext))
            context.setObjectContext((camel.metric.ObjectContext) objContext);
    }

}
