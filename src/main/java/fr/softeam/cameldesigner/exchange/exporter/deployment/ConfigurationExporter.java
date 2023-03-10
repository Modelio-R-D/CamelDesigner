package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.RequirementSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureArtifactExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5d24f16f-4ba4-443b-adf6-433e7f3de276")
public abstract class ConfigurationExporter<T extends Configuration> extends FeatureArtifactExporter<T> {
    @objid ("20eaa1fa-d08d-4f42-ae32-677d0dc0bb6a")
    public ConfigurationExporter(T elt) {
        super(elt);
    }

    @objid ("c2e51281-b48f-4c2c-9400-bdb08d8a345f")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("25a2b0f4-08c2-41b6-ab36-485f85a9d407")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.Configuration) {
            camel.deployment.Configuration config  = (camel.deployment.Configuration) elt;
            
            setRequirements(config);
        }
    }

    @objid ("1637e301-a68d-4987-a5e6-e3c47ffaea35")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.Component) && (elt instanceof camel.deployment.Configuration)) {
            ((camel.deployment.Component) context).getConfigurations().add((camel.deployment.Configuration) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("088252eb-0f99-4b7a-8fff-746baf940be7")
    private void setRequirements(camel.deployment.Configuration config) {
        CDOObject requirements =  this._process.getElement(this._element.getRequirements());
                 if ((requirements != null) &&  (requirements instanceof camel.deployment.RequirementSet))
           config.setRequirements((RequirementSet) requirements);
    }

}
