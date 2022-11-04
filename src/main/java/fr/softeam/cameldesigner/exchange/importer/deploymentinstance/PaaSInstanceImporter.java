package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.PaaSInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("07f6d4c1-2193-48ba-aa05-34e0bf2933ab")
public class PaaSInstanceImporter<T extends PaaSInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance> extends ComponentInstanceImporter<T,V> {
    @objid ("75d5ce75-78e1-4bd2-9af6-f9816ab9bc8f")
    public PaaSInstanceImporter() {
        super();
    }

    @objid ("f5775ccf-38d0-4efa-8734-6dde255e76c6")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.create();
    }

    @objid ("329a393d-54a9-41df-be17-939554d8680f")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("53e5cc50-a263-4005-a780-a747405b7860")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPaaSInstance(this);
    }

}
