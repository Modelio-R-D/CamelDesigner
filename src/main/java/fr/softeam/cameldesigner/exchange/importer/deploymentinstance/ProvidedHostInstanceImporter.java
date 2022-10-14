package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.ProvidedHostInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class ProvidedHostInstanceImporter<T extends ProvidedHostInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> extends HostingPortInstanceImporter<T,V> {

    public ProvidedHostInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
    }


    @Override
    public void attach(V elt, CamelElement context) {
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitProvidedHostInstance(this);
    }

}
