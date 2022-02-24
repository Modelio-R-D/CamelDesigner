package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4f16f060-c059-46c4-94af-7b6026c6f817")
public class PaaSConfigurationExporter<T extends PaaSConfiguration> extends ConfigurationExporter<T> {
    @objid ("af4241c9-e357-4083-ab67-56bff63fc7f2")
    public PaaSConfigurationExporter(T elt) {
        super(elt);
    }

    @objid ("0f6237d8-5950-434c-8d37-b1e10fd57a2a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createPaaSConfiguration();
    }

    @objid ("c15cf0fa-2286-48cc-b349-ecdc2959a22f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.PaaSConfiguration) {
            camel.deployment.PaaSConfiguration pc = (camel.deployment.PaaSConfiguration) elt;
            setAPI(pc);
            setVersion(pc);
            setEndPoint(pc);
            setDownloadURL(pc);
        }
    }

    @objid ("350bddfe-16b0-4d19-b986-0ccd4dd40f12")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("03576ab9-a115-4aa0-912a-a1e747c6cbad")
    private void setDownloadURL(camel.deployment.PaaSConfiguration pc) {
        pc.setDownloadURL(this._element.getDownloadURL());
    }

    @objid ("ab07611e-1953-4a77-b832-29e800fc8c41")
    private void setEndPoint(camel.deployment.PaaSConfiguration pc) {
        pc.setEndpoint(this._element.getEndpoint());
    }

    @objid ("34b0ef79-7267-4b33-8765-6ad5b880b224")
    private void setVersion(camel.deployment.PaaSConfiguration pc) {
        pc.setVersion(this._element.getVersion());
    }

    @objid ("b010c723-bd3c-4935-b781-5d4192f6cae3")
    private void setAPI(camel.deployment.PaaSConfiguration pc) {
        pc.setApi(this._element.getApi());
    }

}
