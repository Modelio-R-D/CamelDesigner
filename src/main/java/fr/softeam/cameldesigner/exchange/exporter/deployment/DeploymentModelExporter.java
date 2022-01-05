package fr.softeam.cameldesigner.exchange.exporter.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("64d84cfc-482e-4a05-907e-65e87c3f5e47")
public abstract class DeploymentModelExporter<T extends DeploymentModel> extends SubModelExporter<T> {
    @objid ("365f59de-caa4-429a-b4c4-ceda5ef62954")
    public DeploymentModelExporter(T elt) {
        super(elt);
    }

    @objid ("6648da20-fc82-4e0b-baed-fa1ab564eec0")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("1029907d-b1de-4f32-9e11-3b46ba404ef9")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("10fbfee2-72b7-4593-b58a-7c02e8c30c7e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.deployment.DeploymentModel)) {
            ((camel.core.CamelModel) context).getDeploymentModels().add((camel.deployment.DeploymentModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
