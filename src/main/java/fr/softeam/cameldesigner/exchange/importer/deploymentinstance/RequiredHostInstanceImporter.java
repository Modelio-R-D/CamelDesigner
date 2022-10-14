package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.RequiredHostInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class RequiredHostInstanceImporter<T extends RequiredHostInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> extends HostingPortInstanceImporter<T,V> {

    public RequiredHostInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance.create();
    }


    @Override
    public void attach(V elt, CamelElement context) {
    }


    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequiredHostInstance(this);
    }

}
