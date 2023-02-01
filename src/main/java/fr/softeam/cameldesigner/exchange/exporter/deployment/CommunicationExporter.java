package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import camel.deployment.ProvidedCommunication;
import camel.deployment.RequiredCommunication;
import camel.requirement.ImageRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
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
        if (elt instanceof camel.deployment.Communication ) {
            camel.deployment.Communication cm = (camel.deployment.Communication) elt;
            setRequiredCommunication(cm);
            setProvidedCommununication(cm);
        }
    }

    @objid ("4e3e280f-f93f-4860-82d1-fda81c3b931c")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentTypeModel) && (elt instanceof camel.deployment.Communication)) {
            ((camel.deployment.DeploymentTypeModel) context).getCommunications().add((camel.deployment.Communication) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("e37414f5-51b1-47b7-956d-07625283330c")
    private void setProvidedCommununication(camel.deployment.Communication elt) {
        CDOObject value = this._process.getElement(this._element.getProvidedCommunication());
        if ((value != null) &&  (value instanceof ProvidedCommunication))
            elt.setProvidedCommunication( (ProvidedCommunication) value);
    }

    @objid ("62789627-d5d2-42f8-830f-752cb1b0b85f")
    private void setRequiredCommunication(camel.deployment.Communication elt) {
        CDOObject value = this._process.getElement(this._element.getRequiredCommunication());
        if ((value != null) &&  (value instanceof RequiredCommunication))
            elt.setRequiredCommunication( (RequiredCommunication) value);
    }

}
