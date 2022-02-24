package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2df2d980-b591-4cd2-bd99-b3a3a6619b78")
public class PaaSExporter<T extends PaaS> extends CamelComponentExporter<T> {
    @objid ("22ab5393-23ee-45a0-909c-701a1d1cc100")
    public PaaSExporter(T elt) {
        super(elt);
    }

    @objid ("f407836c-35b0-4c11-9e1c-76020d44de46")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createPaaS();
    }

    @objid ("3b6c7fc4-ac53-4958-8278-4ca8c6b8a23e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("c6e9229e-f909-488e-b8c4-ed9eba6b63bd")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentTypeModel) && (elt instanceof camel.deployment.PaaS)) {
            ((camel.deployment.DeploymentTypeModel) context).getPaases().add((camel.deployment.PaaS) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
