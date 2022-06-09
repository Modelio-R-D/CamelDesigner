package fr.softeam.cameldesigner.exchange.importer.core;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelVisitor;
import fr.softeam.cameldesigner.exchange.importer.IImporter;
import fr.softeam.cameldesigner.exchange.importer.ImportProcess;

public abstract class CamelElementImporter<T extends CDOObject, V extends CDOObject, W extends CamelElement, Z extends CamelElement> implements IImporter<V,W,Z> {

    protected T _element;

    protected ImportProcess _process;


    public CamelElementImporter(T elt) {
        this._element = elt;
    }

    public T getElement() {
        return this._element;
    }


    public void setProcess(ImportProcess process) {
        this._process = process;
    }



    public abstract Object accept(ICamelVisitor v);

    @Override
    public abstract CamelElement createCamelElt(V owner) ;


    @Override
    public abstract void setProperties(W elt);

    @Override
    public abstract void attach(W elt, Z context);

}
