package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6d3d83a3-7806-462d-8d4c-1d1fd8b8582b")
public class PaaSInstanceExporter<T extends PaaSInstance> extends ComponentInstanceExporter<T> {
    @objid ("715890e1-32fe-49c4-92a8-118589a4bbfc")
    public PaaSInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("15fb92d9-737f-4b11-9f72-8e14a0a2da4b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createPaaSInstance();
    }

    @objid ("a62291dd-0120-42db-8f3b-8915447b577d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("d6bd6e45-dbc2-4c50-a867-428c0b49f03a")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentInstanceModel) && (elt instanceof camel.deployment.PaaSInstance)) {
            ((camel.deployment.DeploymentInstanceModel) context).getPaasInstances().add((camel.deployment.PaaSInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
