package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.ProvidedHostInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("44872b8d-f86a-42f0-8e7e-556e9ae935f4")
public class ProvidedHostInstanceImporter<T extends ProvidedHostInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> extends HostingPortInstanceImporter<T,V> {
    @objid ("e787b970-61e0-4fc3-ab5b-8ea93075ed85")
    public ProvidedHostInstanceImporter() {
        super();
    }

    @objid ("e4d00a53-7a5a-4ef3-875c-509de94ba0a8")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
    }

    @objid ("8dd75269-5a93-497c-86cb-ef883078a25d")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("ba1a59e4-70fa-41fc-a97c-c46a67717a15")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitProvidedHostInstance(this);
    }

}
