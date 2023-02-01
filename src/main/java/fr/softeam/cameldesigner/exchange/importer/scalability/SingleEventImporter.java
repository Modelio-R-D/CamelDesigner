package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.SingleEvent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("94ab341f-a2ae-4f71-bba3-5a2f8d271875")
public abstract class SingleEventImporter<T extends SingleEvent, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent> extends EventImporter<T,V> {
    @objid ("f2b90b27-9f38-422b-aac8-27745ade15a2")
    public SingleEventImporter() {
    }

    @objid ("17a2ffc1-d7f3-4ef5-8453-a8ce86ca370b")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSingleEvent(this);
    }

    @objid ("0bf120af-a1e5-442f-871e-48644816280d")
    public SingleEventImporter(T elt) {
        super(elt);
    }

    @objid ("ee028481-2342-4b1d-805f-0536901a5798")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof ScalabilityModel)
            ((ScalabilityModel)context).addEvents(elt);
    }

}
