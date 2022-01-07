package fr.softeam.cameldesigner.exchange.exporter.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5d24f16f-4ba4-443b-adf6-433e7f3de276")
public abstract class ConfigurationExporter<T extends Configuration> extends FeatureExporter<T> {
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
    }

    @objid ("1637e301-a68d-4987-a5e6-e3c47ffaea35")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
