package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.EventPattern;
import camel.scalability.Timer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
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
        if (context instanceof ScalabilityModel)
            ((ScalabilityModel)context).addPatterns(elt);
    }

    @objid ("2903d67c-be5a-451d-be8b-31a263ba86d1")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setTimer(elt);
    }

    @objid ("67981c29-f9e8-4fe8-947d-1042ec730572")
    private void setTimer(V elt) {
        Timer value = this._element.getTimer();
        if (value != null) {
            elt.setTimer((fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer) value);
        }
    }

}
