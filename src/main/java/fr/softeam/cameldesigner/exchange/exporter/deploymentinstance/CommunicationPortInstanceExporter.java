package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeaturePortExporter;


public abstract class CommunicationPortInstanceExporter<T extends CommunicationPortInstance> extends FeaturePortExporter<T> {

    public CommunicationPortInstanceExporter(T elt) {
        super(elt);
    }

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createCommunicationInstance();
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
