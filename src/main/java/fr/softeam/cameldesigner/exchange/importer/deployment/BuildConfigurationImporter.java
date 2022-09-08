package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.BuildConfiguration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("aced0231-11eb-4295-a6b4-9ac941e3a5b0")
public class BuildConfigurationImporter<T extends BuildConfiguration, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration> extends FeatureImporter<T,V> {
    @objid ("fafdcea3-8560-4e10-a223-723344c5962f")
    public BuildConfigurationImporter() {
        super();
    }

    @objid ("7bd3cc2e-1d89-43a6-87bb-cbf640911c0d")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitBuildConfiguration(this);
    }

    @objid ("bedac947-2e03-47a3-9df5-e2d4e921ddaf")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.create();
    }

    @objid ("42a3a5a9-6f1e-41af-87fe-2bf056d5351b")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("11e78161-bd3d-4d66-a88d-fb32a5f41d62")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setArtifactId(elt);
        setSourceCodeURL(elt);
        setBuildFramework(elt);
        setInclude(elt);
        setExclude(elt);
    }

    @objid ("84ed59ad-31e9-4166-8978-3512c906c7c3")
    private void setSourceCodeURL(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getSourceCodeURL();
        if (value != null) {
            elt.setSourceCodeURL(value);
        }
    }

    @objid ("2985e299-4896-490f-88d4-fbfbf519234b")
    private void setBuildFramework(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getBuildFramework();
        if (value != null) {
            elt.setBuildFramework(value);
        }
    }

    @objid ("0fc2fff1-1335-4b83-ab76-cb09b2afb74f")
    private void setInclude(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getInclude();
        if (value != null) {
            elt.setInclude(value);
        }
    }

    @objid ("dd497f3a-033a-4280-9f56-d3de7e4a8c42")
    private void setExclude(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getExclude();
        if (value != null) {
            elt.setExclude(value);
        }
    }

    @objid ("e41e51c9-771d-4953-b66e-325fbdcdad83")
    private void setArtifactId(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getArtifactId();
        if (value != null) {
            elt.setArtifactId(value);
        }
    }

}
