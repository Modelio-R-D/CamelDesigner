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
    }

    @objid ("822adfe7-5ba2-44bc-a38c-09225deac7b0")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
