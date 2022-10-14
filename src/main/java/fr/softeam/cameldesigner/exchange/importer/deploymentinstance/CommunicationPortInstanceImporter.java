package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.CommunicationPortInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;


public class CommunicationPortInstanceImporter<T extends CommunicationPortInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> extends FeatureImporter<T,V> {

    public CommunicationPortInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCommunicationPortInstance(this);
    }


    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }



    @Override
    public void attach(V elt, CamelElement context) {

    }

}
