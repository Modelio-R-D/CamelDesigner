package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3d38674a-e649-4a36-b071-cdcbfc03b1b3")
public class ContainerConfigurationExporter<T extends ContainerConfiguration> extends ConfigurationExporter<T> {
    @objid ("2d08b41c-1e9e-4275-a825-05113cdf3a56")
    public ContainerConfigurationExporter(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("ef363d2f-c7be-4b59-8e60-939defc7a4b5")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createContainerConfiguration();
    }

    @objid ("d876dd45-e4fe-43ba-9207-30c9db24ad93")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.ContainerConfiguration) {
            camel.deployment.ContainerConfiguration cc = (camel.deployment.ContainerConfiguration) elt;
            setImageId(cc);
            setStartCommand(cc);
            setUpdateCommand(cc);
            setEnvironment(cc);
        }
    }

    @objid ("02acf098-10db-489f-9e3d-89f3f0fd29bf")
    private void setEnvironment(camel.deployment.ContainerConfiguration cc) {
        Feature content = this._element.getEnvironment();
        if (content != null)
            cc.setEnvironment((camel.core.Feature) content);
    }

    @objid ("ebd5264d-b388-439b-98da-89b57b740d84")
    private void setUpdateCommand(camel.deployment.ContainerConfiguration cc) {
        String content = this._element.getUpdateCommandNote();
        if (content != null)
            cc.setUpdateCommand(content);
    }

    @objid ("7ecace02-9c12-4a79-afe9-d0f9e91276e8")
    private void setStartCommand(camel.deployment.ContainerConfiguration cc) {
        String content = this._element.getStartCommandNote();
        if (content != null)
            cc.setStartCommand(content);
    }

    @objid ("4c73826a-8e1e-446c-9f4f-dc7fd36f0bf2")
    private void setImageId(camel.deployment.ContainerConfiguration cc) {
        String content = this._element.getImageId();
        if (content != null)
            cc.setImageId(content);
    }

    @objid ("cb20b3ad-974d-4fb4-8fb4-ff93cdce19cf")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
