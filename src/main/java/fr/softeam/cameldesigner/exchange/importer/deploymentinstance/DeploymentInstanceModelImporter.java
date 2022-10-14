package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.deployment.DeploymentModelImporter;


public class DeploymentInstanceModelImporter<T extends DeploymentInstanceModel, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel> extends DeploymentModelImporter<T,V> {

    public DeploymentInstanceModelImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.create();
    }

    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDeploymentInstanceModel(this);
    }


    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

}
