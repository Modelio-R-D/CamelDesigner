package fr.softeam.cameldesigner.exchange.exporter.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("22a3587d-25f3-4ba5-b309-fc82b83f9d1b")
public abstract class EventPatternExporter<T extends EventPattern> extends FeatureClassExporter<T> {
    @objid ("d17cecb9-180a-4c50-a5b9-b1774963f8fb")
    public EventPatternExporter(T elt) {
        super(elt);
    }

    @objid ("32a0b68b-47b0-43e1-b2e6-65aea9be10b7")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("cfa31a2a-4f23-468d-a78d-4058e63c3098")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("4b164f03-375f-4e1c-931d-ca894ab9fa95")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
