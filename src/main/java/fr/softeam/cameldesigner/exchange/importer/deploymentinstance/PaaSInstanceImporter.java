package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.PaaSInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;


public class PaaSInstanceImporter<T extends PaaSInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance> extends ComponentInstanceImporter<T,V> {

    public PaaSInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.create();
    }


    @Override
    public void attach(V elt, CamelElement context) {
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPaaSInstance(this);
    }

}
