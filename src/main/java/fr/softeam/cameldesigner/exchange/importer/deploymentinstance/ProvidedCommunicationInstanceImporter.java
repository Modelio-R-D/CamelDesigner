package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.ProvidedCommunicationInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class ProvidedCommunicationInstanceImporter<T extends ProvidedCommunicationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> extends CommunicationPortInstanceImporter<T,V> {

    public ProvidedCommunicationInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance.create();
    }


    @Override
    public void attach(V elt, CamelElement context) {

    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitProvidedCommunicationInstance(this);
    }


    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }


}
