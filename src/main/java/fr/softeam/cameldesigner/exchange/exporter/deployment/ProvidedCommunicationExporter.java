package fr.softeam.cameldesigner.exchange.exporter.deployment;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;

public class ProvidedCommunicationExporter<T extends CommunicationPort> extends CommunicationPortExporter<T> {

    public ProvidedCommunicationExporter(T elt) {
        super(elt);
    }

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createProvidedCommunication();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @Override
    public void attach(CDOObject elt, CDOObject context) {
      super.attach(elt, context);
    }
}
