package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b294754e-d5e6-414c-b12c-c274a42519ac")
public class CommunicationExporter<T extends Communication> extends ComponentRelationExporter<T> {
    @objid ("c6177227-c581-4883-acb9-a0e728936774")
    public CommunicationExporter(T elt) {
        super(elt);
    }

    @objid ("6d63aa5d-693a-4c31-a163-af099b32a177")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createCommunication();
    }

    @objid ("ebb0b495-723e-4507-bd1d-e1691831a1f8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("4e3e280f-f93f-4860-82d1-fda81c3b931c")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
