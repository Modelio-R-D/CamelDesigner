package fr.softeam.cameldesigner.exchange.exporter.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("16d964a1-c313-43b2-b665-b8675a270368")
public abstract class EventExporter<T extends Event> extends FeatureClassExporter<T> {
    @objid ("973e4de0-b553-4260-ba8d-ec033db9cc5f")
    public EventExporter(T elt) {
        super(elt);
    }

    @objid ("6a42b348-9713-4bd9-aade-fc13ea8ae8d1")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("1105bd48-680c-4b27-96e7-93252c83cd86")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("b0e30717-4d7c-4f09-b035-5cde74225651")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
