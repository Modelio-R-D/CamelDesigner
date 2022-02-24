package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import org.eclipse.emf.cdo.CDOObject;

@objid ("52c1b237-6273-46a3-b990-7b3e595bf223")
public class DeploymentTypeModelExporter<T extends DeploymentTypeModel> extends DeploymentModelExporter<T> {
    @objid ("5735bb6f-7823-4843-bdff-935ca1571253")
    public DeploymentTypeModelExporter(T elt) {
        super(elt);
    }

    @objid ("9ced7c2f-14f7-4eb5-8891-227aac89b462")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createDeploymentTypeModel();
    }

    @objid ("8d2a9a1e-3d83-47ac-879f-d3ad6557921a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.DeploymentTypeModel) {
            camel.deployment.DeploymentTypeModel dtm = (camel.deployment.DeploymentTypeModel) elt;
            setGlobalRequirementSet(dtm);
        }
    }

    @objid ("1e21f2c3-275c-4263-a78d-fb36aa8eafa7")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("853f95a5-a7ac-4670-9277-f3ebc21dfe53")
    private void setGlobalRequirementSet(camel.deployment.DeploymentTypeModel dtm) {
        CDOObject grs =  this._process.getElement(this._element.getGlobalRequirementSet());
        if ((grs != null) &&  (grs instanceof camel.deployment.RequirementSet))
            dtm.setGlobalRequirementSet((camel.deployment.RequirementSet) grs);
    }

}
