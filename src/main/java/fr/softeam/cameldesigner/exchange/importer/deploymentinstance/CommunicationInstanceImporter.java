package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.CommunicationInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6692f635-a3ca-421d-9bbf-a6e64486b02e")
public class CommunicationInstanceImporter<T extends CommunicationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance> extends ComponentRelationInstanceImporter<T,V> {
    @objid ("6fc90b04-35eb-41aa-a96e-7979a833f302")
    public CommunicationInstanceImporter() {
        super();
    }

    @objid ("dafd1233-82f0-4ae5-acab-376051473943")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.create();
    }

    @objid ("9b63174c-8021-46b7-b1cf-4961cb6015a1")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCommunicationInstance(this);
    }

}
