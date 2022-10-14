package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.ContainerInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class ContainerInstanceImporter<T extends ContainerInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance> extends ComponentInstanceImporter<T,V> {

    public ContainerInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.create();
    }


    @Override
    public void attach(V elt, CamelElement context) {
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitContainerInstance(this);
    }

}
