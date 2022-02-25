package fr.softeam.cameldesigner.exchange.exporter.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f1365d89-482d-4492-b9ba-e2ff41e67c2f")
public abstract class EventInstanceExporter<T extends EventInstance> extends FeatureExporter<T> {
    @objid ("47a2f018-4730-4e6c-ba4e-6c1b4d0e2204")
    public EventInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("932708e1-e5b5-4762-9cff-16053f58e83d")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("8cc56124-8cef-4e1a-aee4-f07bed29231a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("6051b8cc-33c8-4c3f-b097-b041e61c3d6a")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.execution.Cause) && (elt instanceof camel.scalability.EventInstance)) {
            ((camel.execution.Cause) context).getEventInstances().add((camel.scalability.EventInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
