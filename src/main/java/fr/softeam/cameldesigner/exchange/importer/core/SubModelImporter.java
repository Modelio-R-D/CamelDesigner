package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.CamelModel;
import camel.core.Model;
import fr.softeam.cameldesigner.exchange.importer.ICamelVisitor;

public abstract class SubModelImporter<T extends Model, V extends CamelModel, W extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature, Z extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> extends FeatureImporter<T,V,W,Z> {

    public SubModelImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelVisitor v) {
      return v.visitModel(this);
    }

}
