package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.HostingPortInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e1aeca33-62c2-48cb-8480-d1a3d1a639ea")
public class HostingPortInstanceImporter<T extends HostingPortInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> extends FeatureImporter<T,V> {
    @objid ("6e35da4f-1bc4-4915-a8aa-9e54c3f690e1")
    public HostingPortInstanceImporter() {
        super();
    }

    @objid ("80496b5e-e237-4555-97ec-109746d2427e")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance.create();
    }

    @objid ("2ba18404-050e-4b23-97d5-fb00be1ff030")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHostingPortInstance(this);
    }

}
