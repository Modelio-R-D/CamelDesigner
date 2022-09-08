package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.DeploymentModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("9f7cc7da-8eeb-4bdf-a1a0-0f340c90942e")
public class DeploymentModelImporter<T extends DeploymentModel, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel> extends SubModelImporter<T,V> {
    @objid ("c88d8fe4-3339-4ffd-b23c-2a8998a97f2a")
    public DeploymentModelImporter() {
        super();
    }

    @objid ("95ab07b9-92f7-4d01-a39d-6ad327b7f8c9")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.create();
    }

    @objid ("6e4e5039-9859-4a98-a3f0-ca99cb879c63")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addDeploymentModels(elt);
    }

    @objid ("e68cde80-c479-48ce-8012-24766810919a")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDeploymentModel(this);
    }

}
