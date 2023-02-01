package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.RequiredHostInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("eb9b317a-3dab-4fe5-9db4-fbd132786ed1")
public class RequiredHostInstanceImporter<T extends RequiredHostInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> extends HostingPortInstanceImporter<T,V> {
    @objid ("2a7215f5-294c-46fa-8df4-dce0120448f2")
    public RequiredHostInstanceImporter() {
        super();
    }

    @objid ("fffec35f-fddd-4e62-a9e3-6c94f119a18c")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance.create();
    }

    @objid ("331fc6e6-8150-4e18-a8c4-dfee6dcf9b19")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("fd07608b-9150-467c-9589-193596a5b2e7")
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequiredHostInstance(this);
    }

}
