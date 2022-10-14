package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.HostingPortInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;


public class HostingPortInstanceImporter<T extends HostingPortInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> extends FeatureImporter<T,V> {

    public HostingPortInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance.create();
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHostingPortInstance(this);
    }

}
