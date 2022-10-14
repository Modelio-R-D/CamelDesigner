package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.HostingInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class HostingInstanceImporter<T extends HostingInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance> extends ComponentRelationInstanceImporter<T,V> {

    public HostingInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.create();
    }

    @Override
    public void attach(V elt, CamelElement context) {
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHostingInstance(this);
    }


    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }



}
