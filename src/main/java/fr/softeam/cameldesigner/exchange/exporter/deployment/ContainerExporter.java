package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import org.eclipse.emf.cdo.CDOObject;

@objid ("cc709bac-ba67-4e9d-b147-181636c756a4")
public class ContainerExporter<T extends Container> extends CamelComponentExporter<T> {
    @objid ("9d0c5400-2378-4164-a615-04ea666c4157")
    public ContainerExporter(T elt) {
        super(elt);
    }

    @objid ("37fb85cc-107b-48eb-8e38-860182c37bd2")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createContainer();
    }

    @objid ("f39069c0-3dee-4e46-90d3-5ffe00e935fc")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("947b1d9a-9fea-45ee-8870-c3c9168932d9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentTypeModel) && (elt instanceof camel.deployment.Container)) {
            ((camel.deployment.DeploymentTypeModel) context).getContainers().add((camel.deployment.Container) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
