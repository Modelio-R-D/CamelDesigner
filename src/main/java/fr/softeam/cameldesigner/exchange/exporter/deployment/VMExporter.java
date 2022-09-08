package fr.softeam.cameldesigner.exchange.exporter.deployment;

import java.util.ArrayList;
import java.util.List;
import camel.deployment.DeploymentFactory;
import camel.deployment.ProvidedCommunication;
import camel.deployment.ProvidedHost;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
        if (elt instanceof camel.deployment.VM) {
            camel.deployment.VM vm = (camel.deployment.VM) elt;
            setProvidedHost(vm);
        }
    }

    @objid ("328bf213-3a29-4a5b-be47-49fe34c469f2")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentTypeModel) && (elt instanceof camel.deployment.VM)) {
            ((camel.deployment.DeploymentTypeModel) context).getVms().add((camel.deployment.VM) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("35738041-924e-4e4f-9d99-54d17ee718e0")
    private void setProvidedHost(camel.deployment.VM sc) {
        List<camel.deployment.ProvidedHost> providedHostSet = new ArrayList<>();
        for (HostingPort hostingPort : this._element.getProvidedHosts()) {
            CDOObject camelHostingPort = this._process.getElement(hostingPort);
            if ((camelHostingPort != null) &&  (camelHostingPort instanceof camel.deployment.ProvidedHost))
                providedHostSet.add((ProvidedHost) camelHostingPort);
        }
        
        sc.getProvidedHosts().addAll(providedHostSet);
    }

}
