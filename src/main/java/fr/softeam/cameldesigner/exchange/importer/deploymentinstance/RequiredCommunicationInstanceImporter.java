package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.RequiredCommunicationInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class RequiredCommunicationInstanceImporter<T extends RequiredCommunicationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> extends CommunicationPortInstanceImporter<T,V> {

    public RequiredCommunicationInstanceImporter() {
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
        return v.visitRequiredCommunicationInstance(this);
    }


    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

}
