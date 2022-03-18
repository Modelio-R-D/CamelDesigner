package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a34e5329-5d54-47bd-a8f2-ac6655cd2963")
public class ScriptConfigurationExporter<T extends ScriptConfiguration> extends ConfigurationExporter<T> {
    @objid ("72b81cb7-08bd-4a3c-8c12-7afeab41fd2e")
    public ScriptConfigurationExporter(T elt) {
        super(elt);
    }

    @objid ("1e5a2c96-776b-42f9-8cbf-b22d3155c011")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createScriptConfiguration();
    }

    @objid ("9006f4bf-bfa3-48e5-bf7d-d94445e6603b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        
        //Script Configuration properties
        if (elt instanceof camel.deployment.ScriptConfiguration) {
            camel.deployment.ScriptConfiguration config  = (camel.deployment.ScriptConfiguration) elt;
            setUploadCommand(config);
            setInstallCommand(config);
            setStartCommand(config);
            setStopCommand(config);
            setDownloadCommand(config);
            setConfigureCommand(config);
            setUpdateCommand(config);
            setDevopsTool(config);
            setOs(config);
            setImageId(config);
        }
    }

    @objid ("dc2eb43f-d890-45ed-a516-3f0999f74186")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("022a99c4-080e-420d-a196-083d4562c342")
    private void setImageId(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getImageId();
        if (content != null)
            config.setImageId(content);
    }

    @objid ("bda98405-3035-4a35-9c0a-6685a9f8e0e2")
    private void setOs(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getOs();
        if (content != null)
            config.setOs(content);
    }

    @objid ("aea15d75-0598-42ea-8606-6e05f90b8a25")
    private void setDevopsTool(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getDevopsTool();
        if (content != null)
            config.setDevopsTool(content);
    }

    @objid ("5510210a-a7e3-49c1-83d1-36397375e6db")
    private void setUpdateCommand(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getUpdateCommandNote();
        if (content != null)
            config.setUpdateCommand(content);
    }

    @objid ("9ed6b435-dc6e-492c-aec8-b334dded42eb")
    private void setConfigureCommand(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getConfigureCommandNote();
        if (!(content.equals("")))
            config.setConfigureCommand(content);
    }

    @objid ("fd750d55-166b-4401-b805-ac77556ef6de")
    private void setDownloadCommand(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getDownloadCommandNote();
        if (!(content.equals("")))
            config.setDownloadCommand(content);
    }

    @objid ("77886cd8-c609-437c-a8a6-fdabf47e0c6e")
    private void setStopCommand(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getStopCommandNote();
        if (!(content.equals("")))
            config.setStopCommand(content);
    }

    @objid ("04080cf6-7c7a-42bb-a485-68db27cc4f5f")
    private void setStartCommand(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getStartCommandNote();
        if (!(content.equals("")))
            config.setStartCommand(content);
    }

    @objid ("11726689-83b9-4c70-b14c-211fe55816be")
    private void setInstallCommand(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getInstallCommandNote();
        if (!(content.equals("")))
            config.setInstallCommand(content);
    }

    @objid ("63438a5e-4c03-4b35-a8b0-71b8a4bdf75f")
    private void setUploadCommand(camel.deployment.ScriptConfiguration config) {
        String content = this._element.getUploadCommandNote();
        if (content != null)
            config.setUploadCommand(content);
    }

}
