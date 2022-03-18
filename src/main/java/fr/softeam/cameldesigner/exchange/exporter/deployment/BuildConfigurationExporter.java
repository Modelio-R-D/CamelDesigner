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
        if (elt instanceof camel.deployment.BuildConfiguration) {
            camel.deployment.BuildConfiguration bc = (camel.deployment.BuildConfiguration) elt;
            setArtifactId(bc);
            setBuildFramework(bc);
            setSourceCodeURL(bc);
            setInclude(bc);
            setExclude(bc);
        }
    }

    @objid ("7d00c646-95fb-4b15-a452-949c1cb40b30")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.ServerlessConfiguration) && (elt instanceof camel.deployment.BuildConfiguration)) {
            ((camel.deployment.ServerlessConfiguration) context).setBuildConfiguration((camel.deployment.BuildConfiguration) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("14dec351-b810-4539-bdfb-4d2a79374c34")
    private void setExclude(camel.deployment.BuildConfiguration bc) {
        String content = this._element.getExclude();
        if (content != null)
            bc.setExclude(content);
    }

    @objid ("febfaa0b-3a23-4203-b7d8-fa3f364418aa")
    private void setInclude(camel.deployment.BuildConfiguration bc) {
        String content = this._element.getInclude();
        if (content != null)
            bc.setInclude(content);
    }

    @objid ("ed36892e-a130-44b0-899b-38b28c0f8c7c")
    private void setSourceCodeURL(camel.deployment.BuildConfiguration bc) {
        String content = this._element.getSourceCodeURL();
        if (content != null)
            bc.setSourceCodeURL(content);
    }

    @objid ("1aa54531-3352-44c2-9008-525e29c7deb3")
    private void setBuildFramework(camel.deployment.BuildConfiguration bc) {
        String content = this._element.getBuildFramework();
        if (content != null)
            bc.setBuildFramework(content);
    }

    @objid ("6bf6d9e2-21ea-46c7-9ec4-f984f536761b")
    private void setArtifactId(camel.deployment.BuildConfiguration bc) {
        String content = this._element.getArtifactId();
        if (content != null)
            bc.setArtifactId(content);
    }

}
