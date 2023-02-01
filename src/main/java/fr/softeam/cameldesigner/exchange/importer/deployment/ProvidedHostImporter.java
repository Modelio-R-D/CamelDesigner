package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.ProvidedHost;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
<<<<<<< HEAD
import org.modelio.metamodel.uml.statik.PortOrientation;
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5

@objid ("5221827d-0a23-49e8-bb2e-da41b27f0d60")
public class ProvidedHostImporter<T extends ProvidedHost, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> extends HostingPortImporter<T,V> {
    @objid ("ea6e0950-5642-4979-83ae-3ac1521a5727")
    public ProvidedHostImporter() {
        super();
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

    @objid ("12a090cc-8bc9-4371-afb9-bf2a7b0af91e")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setDirection(elt);
    }

    @objid ("2daa2418-24cf-4c0d-b300-375bc5312c6a")
    private void setDirection(V elt) {
        elt.getElement().setDirection(PortOrientation.OUT);
    }

}
