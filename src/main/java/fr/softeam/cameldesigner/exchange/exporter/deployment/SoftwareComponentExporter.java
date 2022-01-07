package fr.softeam.cameldesigner.exchange.exporter.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import org.eclipse.emf.cdo.CDOObject;

@objid ("601fa0b7-9bab-4d86-9d21-78c962ea7c6a")
public class SoftwareComponentExporter<T extends SoftwareComponent> extends CamelComponentExporter<T> {
    @objid ("02b91033-9b01-467b-828c-d1a77363151f")
    public SoftwareComponentExporter(T elt) {
        super(elt);
    }

    @objid ("5a7b2340-f229-4f15-816a-a80b3234e3fb")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return camel.deployment.DeploymentFactory.eINSTANCE.createSoftwareComponent();
    }

    @objid ("33d62df0-4a1f-4a84-b98b-948346fb2cb8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
