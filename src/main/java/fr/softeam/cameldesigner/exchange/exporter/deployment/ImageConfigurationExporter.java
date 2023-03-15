package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration;
import org.eclipse.emf.cdo.CDOObject;

@objid ("45331f17-2f5d-4dd1-9a0a-999e86209b2a")
public class ImageConfigurationExporter<T extends ImageConfiguration> extends ConfigurationExporter<T> {
    @objid ("fde010f0-dc4f-4ab4-a950-0b9876a0339d")
    public ImageConfigurationExporter(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("45a1d262-7af7-4e7a-ab4f-d4a40ef35f8e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createImageConfiguration();
    }

    @objid ("06ee07a3-dee9-406b-b1e5-5b9161ce1e13")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.ImageConfiguration) {
            camel.deployment.ImageConfiguration cc = (camel.deployment.ImageConfiguration) elt;
            setImageId(cc);
        
        }
    }

    @objid ("772aef00-8fa3-4d5e-bf05-b2f75338c894")
    private void setImageId(camel.deployment.ImageConfiguration cc) {
        String content = this._element.getImageId();
        if (content != null)
            cc.setImageId(content);
    }

}
