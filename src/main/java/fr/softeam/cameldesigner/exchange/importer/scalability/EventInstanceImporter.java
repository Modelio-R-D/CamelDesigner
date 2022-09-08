package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.EventInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;

@objid ("3b16121b-9ebe-43bc-b870-ce46d0dd55e9")
public abstract class EventInstanceImporter<T extends EventInstance, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance> extends FeatureImporter<T,V> {
    @objid ("d0f2db40-a2c0-44f6-831f-aed3e75182e8")
    public EventInstanceImporter() {
    }

    @objid ("80390642-eeda-43a2-82b3-d7de74b69a84")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitEventInstance(this);
    }

    @objid ("8000e3f1-d66f-4ca7-9831-74b979611f31")
    public EventInstanceImporter(T elt) {
        super(elt);
    }

    @objid ("42542f44-15f7-46a5-9dc3-e0827913f4f5")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
