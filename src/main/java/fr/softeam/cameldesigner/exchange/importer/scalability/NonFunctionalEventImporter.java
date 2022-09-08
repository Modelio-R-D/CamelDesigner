package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.NonFunctionalEvent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("206dba15-c424-448e-bf2b-8acafdf8299f")
public class NonFunctionalEventImporter<T extends NonFunctionalEvent, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent> extends SingleEventImporter<T,V> {
    @objid ("5f8cfb03-4382-4897-97d5-ba86ecef9e54")
    public NonFunctionalEventImporter() {
    }

    @objid ("525f7e6b-264f-474f-a9f1-ab53dfe3fafa")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitNonFunctionalEvent(this);
    }

    @objid ("e2293f49-bca6-4068-889d-0e9439620f98")
    public NonFunctionalEventImporter(T elt) {
        super(elt);
    }

    @objid ("bca7bf39-93f7-47be-8117-40ae3ee6af18")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.create();
    }

    @objid ("cfe1bc54-6a09-4c56-a3e1-87ffdc71701d")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
