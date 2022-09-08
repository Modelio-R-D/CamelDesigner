package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.Event;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;

@objid ("3f825002-87de-418c-8a32-a351f98e7894")
public abstract class EventImporter<T extends Event, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event> extends FeatureImporter<T,V> {
    @objid ("751e4758-ccd3-41fa-bc97-895945d8e289")
    public EventImporter() {
    }

    @objid ("5db3b929-8177-4d57-8a1a-63576eb05148")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitEvent(this);
    }

    @objid ("ec6576ab-7334-4eef-8938-a8104d8a1b52")
    public EventImporter(T elt) {
        super(elt);
    }

    @objid ("95b8ef70-e7be-483e-9354-c8c58fcc27d9")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
