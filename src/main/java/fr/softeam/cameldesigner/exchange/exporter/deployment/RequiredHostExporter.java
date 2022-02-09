package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bebccc7c-092c-4c23-a21e-2d63c568aaa2")
public class RequiredHostExporter<T extends HostingPort> extends HostingPortExporter<T> {
    @objid ("36fab325-adf0-4ab7-ad76-cf86040ff56c")
    public RequiredHostExporter(T elt) {
        super(elt);
    }

    @objid ("814e51b5-d55e-4d1f-8578-8a30559865a5")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createRequiredHost();
    }

    @objid ("d5019d75-ee27-46fa-883b-73b14c12672d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("07c12753-2e90-4af6-8022-06665b394769")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
