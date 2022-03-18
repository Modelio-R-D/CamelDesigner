package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1f337657-cc2b-4fb6-963c-612828b692e8")
public class ClusterConfigurationExporter<T extends ClusterConfiguration> extends ConfigurationExporter<T> {
    @objid ("525e26a9-2658-420b-8b8d-9c7cf69d64d2")
    public ClusterConfigurationExporter(T elt) {
        super(elt);
    }

    @objid ("cc696aa8-8bcc-4ea7-b4f6-cb7b3a49d711")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createClusterConfiguration();
    }

    @objid ("b084bec7-e0e2-448a-aa3c-cb84428d05fc")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.ClusterConfiguration) {
            camel.deployment.ClusterConfiguration cc = (camel.deployment.ClusterConfiguration) elt;
            setDownloadURL(cc);
        }
    }

    @objid ("b6a1e496-9381-4d8e-99f4-47763be8cb68")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("46f49088-28fa-41b3-8a0d-d62cafdd4168")
    private void setDownloadURL(camel.deployment.ClusterConfiguration cc) {
        String content = this._element.getDownloadURL();
        if (content != null)
            cc.setDownloadURL(content);
    }

}
