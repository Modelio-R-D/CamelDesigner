package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import org.eclipse.emf.cdo.CDOObject;

@objid ("894c619a-a818-43c2-9f6a-4f8eb1475f2e")
public class ProvidedCommunicationExporter<T extends CommunicationPort> extends CommunicationPortExporter<T> {
    @objid ("9fec6ca3-8666-440f-b08a-865f4ead9a82")
    public ProvidedCommunicationExporter(T elt) {
        super(elt);
    }

    @objid ("4cd07474-1b95-459a-bacc-32195f4cdf9e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createProvidedCommunication();
    }

    @objid ("312b0a73-3d82-4e65-99a4-af0c0255c4ee")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("5591d4f0-7e19-474c-9f4e-d2f8e2e742d9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.Component) && (elt instanceof camel.deployment.ProvidedCommunication)) {
            ((camel.deployment.Component) context).getProvidedCommunications().add((camel.deployment.ProvidedCommunication) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
