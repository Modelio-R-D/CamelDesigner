package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.CommunicationInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class CommunicationInstanceImporter<T extends CommunicationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance> extends ComponentRelationInstanceImporter<T,V> {

    public CommunicationInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.create();
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCommunicationInstance(this);
    }

}
