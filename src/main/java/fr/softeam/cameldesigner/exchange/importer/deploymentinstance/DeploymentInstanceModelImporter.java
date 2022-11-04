package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.DeploymentInstanceModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.deployment.DeploymentModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a1a9c888-99d3-4fe4-b928-30c508bace51")
public class DeploymentInstanceModelImporter<T extends DeploymentInstanceModel, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel> extends DeploymentModelImporter<T,V> {
    @objid ("5b7eeebf-d981-47dc-9a44-a39b4de6c777")
    public DeploymentInstanceModelImporter() {
        super();
    }

    @objid ("3b7cc326-9865-4b5c-9703-4c9b27dc6deb")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.create();
    }

    @objid ("cb1bc457-e87c-4563-85cd-a767c3a72ceb")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDeploymentInstanceModel(this);
    }

    @objid ("00c1f51a-b664-4831-bbe8-112a3a1f5157")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

}
