package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Feature;
import camel.core.NamedElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelVisitor;

public abstract class NamedElementImporter<T extends NamedElement, V extends Feature, W extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement, Z extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> extends CamelElementImporter<T,V,W,Z> {

    public NamedElementImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelVisitor v) {
      return v.visitNamedElement(this);
    }

    @Override
    public void setProperties(W elt) {
      elt.setName(this._element.getName());
      elt.setDescription(this._element.getDescription());
    }

    @Override
    public void attach(W elt, Z context) {
        // TODO Auto-generated method stub
    }

}
