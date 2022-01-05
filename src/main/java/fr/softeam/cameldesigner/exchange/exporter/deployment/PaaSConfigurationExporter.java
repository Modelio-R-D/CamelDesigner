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
    }

    @objid ("350bddfe-16b0-4d19-b986-0ccd4dd40f12")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
