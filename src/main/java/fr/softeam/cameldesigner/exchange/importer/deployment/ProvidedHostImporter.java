package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.ProvidedHost;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5221827d-0a23-49e8-bb2e-da41b27f0d60")
public class ProvidedHostImporter<T extends ProvidedHost, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> extends HostingPortImporter<T,V> {
    @objid ("ea6e0950-5642-4979-83ae-3ac1521a5727")
    public ProvidedHostImporter() {
        super();
        // TODO Auto-generated constructor stub
    }

    @objid ("bad5a679-9ffe-415c-9e1b-5533c84dd559")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
    }

    @objid ("df645d00-35f3-42b7-881b-e4c85e4912e9")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof SoftwareComponent)
          ((SoftwareComponent)context).addProvidedHosts(elt);
        else if (context instanceof Container)
            ((Container)context).addProvidedHosts(elt);
        else if (context instanceof VM)
            ((VM)context).addProvidedHosts(elt);
        else
            super.attach(elt, context);
    }

    @objid ("8a6850d2-22da-4212-aa62-b02f95c56f9e")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitProvidedHost(this);
    }

}
