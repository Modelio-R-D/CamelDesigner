package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureArtifactExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("df64eebe-4e01-4ab7-b7ce-31c38f61a271")
public class BuildConfigurationExporter<T extends BuildConfiguration> extends FeatureArtifactExporter<T> {
    @objid ("13a9dd45-4b6f-4b03-86f5-4c8cd92bf409")
    public BuildConfigurationExporter(T elt) {
        super(elt);
    }

    @objid ("4e661a62-be1a-4aeb-8858-90376db26624")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createBuildConfiguration();
    }

    @objid ("41f7df95-143e-49e7-9920-97792d280400")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("7d00c646-95fb-4b15-a452-949c1cb40b30")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
