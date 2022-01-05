package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e567b9fb-f8c5-4935-9fd8-ddb117a05e27")
public class ServerlessConfigurationExporter<T extends ServerlessConfiguration> extends ConfigurationExporter<T> {
    @objid ("d03ce40f-baf0-4398-9182-df9eb4ce7334")
    public ServerlessConfigurationExporter(T elt) {
        super(elt);
    }

    @objid ("5f29484e-b8e0-4f2e-8b64-fbeb20ec60da")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createBuildConfiguration();
    }

    @objid ("d4bcf97d-c4e4-4e0f-ad11-8143302e8c48")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("fdbcb009-c8fc-4f08-b4a8-26f1f712f3a0")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
