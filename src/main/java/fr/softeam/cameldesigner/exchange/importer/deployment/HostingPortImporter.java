package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.HostingPort;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("67accd7a-dcfc-44ab-979c-f1670868cc7b")
public class HostingPortImporter<T extends HostingPort, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> extends FeatureImporter<T,V> {
    @objid ("f66011b7-1ff6-46aa-baaa-1998b08b72ff")
    public HostingPortImporter() {
        super();
    }

    @objid ("553bc3c1-2d1a-4f0d-a50d-78897c545f64")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
    }

    @objid ("c2043ad6-126e-4efc-b1ff-f432fc9ad5b1")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHostingPort(this);
    }

}
