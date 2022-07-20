package fr.softeam.cameldesigner.exchange.importer.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.IImporter;
import fr.softeam.cameldesigner.exchange.importer.ImportProcess;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a380bcee-5614-4bbb-ae51-4fce0eb8f1fe")
public abstract class CamelElementImporter<T extends CDOObject, V extends CamelElement> implements IImporter<T,V> {
    @objid ("72ac129b-865a-47ac-9440-b567172e96f0")
    protected T _element;

    @objid ("edd0298b-16e3-46e0-bcf3-8dd1863948ed")
    protected ImportProcess _process;

    @objid ("fbe059da-0243-4e51-874b-1f0412e62979")
    public CamelElementImporter() {
    }

    @objid ("93478a3c-2728-4b98-9f08-e7cd1e1f160d")
    public T getElement() {
        return this._element;
    }

    @objid ("2c5f32c3-07a3-46e4-934d-da8a21604749")
    public void setProcess(ImportProcess process) {
        this._process = process;
    }

    @objid ("521f0910-b058-4202-8256-2c442bff20d9")
    public abstract Object accept(ICamelImporterVisitor v);

    @objid ("a2d8bacc-c359-4ec0-8d85-bae706a6edd6")
    @Override
    public abstract CamelElement createCamelElt(CDOObject owner);

    @objid ("80d2f453-7ccc-4c8d-bd48-9d8362a8f29f")
    @Override
    public abstract void setProperties(V elt);

    @objid ("90b03904-5f6e-4eb7-a22c-f79a49b88847")
    @Override
    public abstract void attach(V elt, CamelElement context);

    @objid ("9a437226-becf-4f01-b153-a319f1fc2956")
    public CamelElementImporter(T elt) {
        this._element = elt;
    }

    @objid ("e7d6b617-d856-4b6f-8348-3a9668df9cb8")
    public void setElement(T element) {
        this._element = element;
    }

}
