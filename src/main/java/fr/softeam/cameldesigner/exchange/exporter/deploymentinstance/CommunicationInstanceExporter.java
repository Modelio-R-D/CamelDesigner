package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("cb01baff-da5c-4668-85ec-bfe230e5afda")
public class CommunicationInstanceExporter<T extends CommunicationInstance> extends ComponentRelationInstanceExporter<T> {
    @objid ("6351120e-94f0-4331-b7f0-765b23be4a31")
    public CommunicationInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("4481136a-7d76-4b0a-8314-0738caaa0b75")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createCommunicationInstance();
    }

    @objid ("aa4f566b-d9e0-4454-a944-1ca8297bfc0c")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("05da811d-6afd-404d-9f87-7727cdfdcef3")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentInstanceModel) && (elt instanceof camel.deployment.CommunicationInstance)) {
            ((camel.deployment.DeploymentInstanceModel) context).getCommunicationInstances().add((camel.deployment.CommunicationInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
