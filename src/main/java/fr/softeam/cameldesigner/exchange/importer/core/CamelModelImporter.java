package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

public class CamelModelImporter<T extends CamelModel, V extends CamelModel, W extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature, Z extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> extends SubModelImporter<T,V,W,Z> {


    public CamelModelImporter() {
    }

    public CamelModelImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelImporterVisitor v) {
      return v.visitCamelModel(this);
    }

}
