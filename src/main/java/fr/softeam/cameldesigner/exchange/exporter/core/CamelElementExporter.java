package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.exporter.GenerateProcess;
import fr.softeam.cameldesigner.exchange.exporter.IExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("eb76bb5c-f9d7-4794-b13a-7b5a1a99bc10")
public abstract class CamelElementExporter<T extends CamelElement> implements IExporter {
    @objid ("81e4da51-4369-4406-8a0e-5a074116fd13")
    protected T _element;

    @objid ("3e53984a-4201-46ca-b1c6-385730174762")
    protected GenerateProcess _process;

    @objid ("f287a4d9-300f-4b2a-9842-c3588cb762c6")
    public CamelElementExporter(T elt) {
        this._element = elt;
    }

    @objid ("10543201-48dd-45ab-a3f2-a80115ca16bb")
    public void setProcess(GenerateProcess process) {
        this._process = process;
    }

    @objid ("29badf84-d857-489f-a71b-5130219940ef")
    @Override
    public CDOObject createCamelElt(CDOObject owner) {
        return null;
    }

    @objid ("7db9b968-a460-4e00-8562-83504d6f1448")
    @Override
    public void setProperties(CDOObject elt) {
    }

    @objid ("294dffaf-a90b-42d8-929f-73417af310d9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
    }

}
