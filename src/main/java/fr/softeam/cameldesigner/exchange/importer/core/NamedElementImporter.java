package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Feature;
import camel.core.NamedElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

public abstract class NamedElementImporter<T extends NamedElement, V extends Feature, W extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement, Z extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> extends CamelElementImporter<T,V,W,Z> {

    public NamedElementImporter() {
    }

    public NamedElementImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitNamedElement(this);
    }

    @Override
    public void setProperties(W elt) {
        setName(elt);
        setDescription(elt);
    }

    private void setDescription(W elt) {
        String descrip = this._element.getDescription();
        if (descrip != null) {
            elt.setDescription(descrip);
        }
    }

    private void setName(W elt) {
        String name = this._element.getName();
        if (name != null) {
            elt.setName(name);
        }
    }

    @Override
    public void attach(W elt, Z context) {
        // TODO Auto-generated method stub
    }

}
