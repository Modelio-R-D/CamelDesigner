package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5804a43c-fd50-42f3-975f-a00160baf7d7")
public class VMExporter<T extends VM> extends CamelComponentExporter<T> {
    @objid ("638e2896-b453-4c5f-a7cf-f9901cdf2d68")
    public VMExporter(T elt) {
        super(elt);
    }

    @objid ("7feea7d0-c310-43dd-87b9-89756f37c339")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createVM();
    }

    @objid ("784b1fcd-36b8-42fd-84ad-4dee29822bfa")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
