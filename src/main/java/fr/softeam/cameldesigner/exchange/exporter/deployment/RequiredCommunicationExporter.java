package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import camel.deployment.RequiredCommunication;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a908ff38-6651-4a4c-a3a6-bb74ec9dd888")
public class RequiredCommunicationExporter<T extends CommunicationPort> extends CommunicationPortExporter<T> {
    @objid ("4b136689-bb28-4ec9-b80c-81e1cb484dfd")
    public RequiredCommunicationExporter(T elt) {
        super(elt);
    }

    @objid ("b88c3b2e-6e5e-4fb3-8657-4c548e48f66a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createRequiredCommunication();
    }

    @objid ("f713f73f-ac5d-4229-adb4-4c7cd38f91f2")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.RequiredCommunication) {
            camel.deployment.RequiredCommunication rc = (camel.deployment.RequiredCommunication) elt;
            setIsMandatory(rc);
            
        }
    }

    @objid ("88cb71fd-4c3f-4274-aaaf-c6bc0c3f83a7")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.SoftwareComponent) && (elt instanceof camel.deployment.RequiredCommunication)) {
            ((camel.deployment.SoftwareComponent) context).getRequiredCommunications().add((camel.deployment.RequiredCommunication) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("757796c5-55e4-4f6e-99fc-034c3ef2b62d")
    private void setIsMandatory(RequiredCommunication rc) {
        rc.setIsMandatory(this._element.isIsMandatory());
    }

}
