package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.RequiredCommunicationInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("52a31e75-5fad-4fc8-921b-34988ebbca0f")
public class RequiredCommunicationInstanceImporter<T extends RequiredCommunicationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> extends CommunicationPortInstanceImporter<T,V> {
    @objid ("03d38841-78b5-4c30-a6a6-ea86ecb6281f")
    public RequiredCommunicationInstanceImporter() {
        super();
    }

    @objid ("3286e968-3e1c-4e69-8889-0d7004f164a1")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance.create();
    }

    @objid ("79ad05b8-a1a6-4402-a9d9-252eac6cf4a4")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("42034fe6-4a49-4894-b6d1-b5ac05b698e2")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequiredCommunicationInstance(this);
    }

    @objid ("dee52084-0bd8-4c24-a816-291e7246448f")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

}
