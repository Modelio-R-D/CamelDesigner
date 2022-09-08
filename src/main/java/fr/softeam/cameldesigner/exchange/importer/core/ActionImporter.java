package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Action;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("d4ff47ed-db3b-45f0-891e-e93d986d2fdc")
public class ActionImporter<T extends Action, V extends fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action> extends FeatureImporter<T,V> {
    @objid ("222d0629-d4b2-4156-aafa-4d59ac475963")
    public ActionImporter() {
    }

    @objid ("42644707-3444-44a1-888f-c9216e32e24e")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitAction(this);
    }

    @objid ("16a2440c-4eb6-41f2-9963-de27b3893eac")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("583f9bdf-79dc-4870-bb89-d19c33a83c6a")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("d24afd5f-9bd7-4e87-9e16-e8e513ce0bd6")
    public ActionImporter(T elt) {
        super(elt);
    }

}
