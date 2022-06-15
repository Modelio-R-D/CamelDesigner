package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.CamelModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("dcd1a52b-ee35-4783-a5bb-62915c75b301")
public class CamelModelImporter<T extends CamelModel, V extends CamelModel, W extends Feature, Z extends Feature> extends SubModelImporter<T,V,W,Z> {
    @objid ("7610ca38-80b1-41bb-be7d-db9c52aa40e6")
    public CamelModelImporter() {
    }

    @objid ("eec41fec-45bb-4547-87fe-b69558d92749")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCamelModel(this);
    }

    @objid ("1bd1e6e7-684b-459a-bf7e-b6fcb394f81d")
    public CamelModelImporter(T elt) {
        super(elt);
    }

}
