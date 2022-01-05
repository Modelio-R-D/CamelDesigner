package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f2a96523-4647-4885-9fc8-d785e127a377")
public abstract class SubModelExporter<T extends SubModel> extends NamedElementExporter<T> {
    @objid ("14dbc30a-7f47-4f74-8a5c-6fc2f9155ebd")
    public SubModelExporter(T elt) {
        super(elt);
    }

    @objid ("5d9d5223-3b45-40e5-b51c-4f398f6adc87")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("4763f86f-2b77-41e3-b933-33aac7771118")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("00d52171-37df-4f9a-b56d-fb50da946c99")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
