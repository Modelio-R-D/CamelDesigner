package fr.softeam.cameldesigner.exchange.exporter.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;

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
        if (elt instanceof camel.deployment.ScriptConfiguration) {
            setUploadCommand((camel.deployment.ScriptConfiguration) elt);
            setInstallCommand((camel.deployment.ScriptConfiguration) elt);
            setStartCommand((camel.deployment.ScriptConfiguration) elt);
            setStopCommand((camel.deployment.ScriptConfiguration) elt);
            setDownloadCommand((camel.deployment.ScriptConfiguration) elt);
            setConfigureCommand((camel.deployment.ScriptConfiguration) elt);
            setUpdateCommand((camel.deployment.ScriptConfiguration) elt);
            setDevopsTool((camel.deployment.ScriptConfiguration) elt);
            setOs((camel.deployment.ScriptConfiguration) elt);
            setImageId((camel.deployment.ScriptConfiguration) elt);

        }
    }

    @objid ("dc2eb43f-d890-45ed-a516-3f0999f74186")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    private void setUploadCommand(camel.deployment.ScriptConfiguration elt) {
        elt.setUploadCommand(this._element.getUploadCommandNote());
    }

    private void setInstallCommand(camel.deployment.ScriptConfiguration elt) {
        elt.setInstallCommand(this._element.getInstallCommandNote());
    }

    private void setStartCommand(camel.deployment.ScriptConfiguration elt) {
        elt.setStartCommand(this._element.getStartCommandNote());
    }

    private void setStopCommand(camel.deployment.ScriptConfiguration elt) {
        elt.setUploadCommand(this._element.getStopCommandNote());
    }

    private void setDownloadCommand(camel.deployment.ScriptConfiguration elt) {
        elt.setDownloadCommand(this._element.getDownloadCommandNote());
    }

    private void setConfigureCommand(camel.deployment.ScriptConfiguration elt) {
        elt.setConfigureCommand(this._element.getConfigureCommandNote());
    }

    private void setUpdateCommand(camel.deployment.ScriptConfiguration elt) {
        elt.setUpdateCommand(this._element.getUpdateCommandNote());
    }

    private void setDevopsTool(camel.deployment.ScriptConfiguration elt) {
        elt.setDevopsTool(this._element.getDevopsTool());
    }

    private void setOs(camel.deployment.ScriptConfiguration elt) {
        elt.setOs(this._element.getOs());
    }

    private void setImageId(camel.deployment.ScriptConfiguration elt) {
        elt.setImageId(this._element.getImageId());
    }


}
