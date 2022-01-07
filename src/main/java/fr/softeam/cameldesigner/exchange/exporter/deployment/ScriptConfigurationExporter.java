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
    }

    @objid ("dc2eb43f-d890-45ed-a516-3f0999f74186")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
