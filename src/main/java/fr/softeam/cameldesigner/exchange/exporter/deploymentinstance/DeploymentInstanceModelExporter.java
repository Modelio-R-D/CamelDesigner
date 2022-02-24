package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.exchange.exporter.deployment.DeploymentModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a2b53af1-fe82-4d3e-93b8-cbedc7476258")
public class DeploymentInstanceModelExporter<T extends DeploymentInstanceModel> extends DeploymentModelExporter<T> {
    @objid ("546565e1-3f7a-4153-b3b0-fe8d7a3b4106")
    public DeploymentInstanceModelExporter(T elt) {
        super(elt);
    }

    @objid ("5142cc26-7b9d-4b75-8140-2d5426722ff9")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createDeploymentInstanceModel();
    }

    @objid ("2962c949-160d-4c8c-86db-83dfeb3ab738")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.DeploymentInstanceModel) {
            camel.deployment.DeploymentInstanceModel dim = (camel.deployment.DeploymentInstanceModel) elt;
            setType(dim);
        }
    }

    @objid ("9bac41ec-5ae2-49b2-8236-3b18daed9b86")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("47316418-a89a-4e64-a3e2-afe196586b28")
    private void setType(camel.deployment.DeploymentInstanceModel dim) {
        CDOObject di =  this._process.getElement(this._element.getType());
        if ((di != null) &&  (di instanceof camel.deployment.DeploymentTypeModel))
            dim.setType((camel.deployment.DeploymentTypeModel) di);
    }

}
