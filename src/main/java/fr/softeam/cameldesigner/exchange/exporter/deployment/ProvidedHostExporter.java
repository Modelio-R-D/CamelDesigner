package fr.softeam.cameldesigner.exchange.exporter.deployment;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;

public class ProvidedHostExporter<T extends HostingPort> extends HostingPortExporter<T> {

    public ProvidedHostExporter(T elt) {
        super(elt);
    }

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createProvidedHost();
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
