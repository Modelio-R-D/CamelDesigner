package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f632127d-c391-4b47-bd07-24f7fa60f4df")
public class ContainerInstanceExporter<T extends ContainerInstance> extends ComponentInstanceExporter<T> {
    @objid ("0ff65bfc-5bd1-48d2-ae01-dc163de78d74")
    public ContainerInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("c9f98fda-b4b0-489c-a79b-01a6fdc11c5f")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createContainerInstance();
    }

    @objid ("8945c640-bc92-4074-beef-861e67e8beab")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("bc901f58-d739-46ad-9d3d-1ed2213ca3ef")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentInstanceModel) && (elt instanceof camel.deployment.ContainerInstance)) {
            ((camel.deployment.DeploymentInstanceModel) context).getContainerInstances().add((camel.deployment.ContainerInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
