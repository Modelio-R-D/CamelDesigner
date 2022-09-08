package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.EventPattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("b5446c05-81f0-49c9-9c5a-3df26ead2348")
public abstract class EventPatternImporter<T extends EventPattern, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern> extends EventImporter<T,V> {
    @objid ("b4bc803a-8231-4493-8395-6dc4555afbdd")
    public EventPatternImporter() {
    }

    @objid ("1fc1db6e-b877-4bfa-9be1-1bf90ec16cd2")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitEventPattern(this);
    }

    @objid ("ad5c26ff-adbc-4875-940a-a7aa436c8a03")
    public EventPatternImporter(T elt) {
        super(elt);
    }

    @objid ("394af9d6-9ca7-438a-84d0-030bb7fa18d8")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
