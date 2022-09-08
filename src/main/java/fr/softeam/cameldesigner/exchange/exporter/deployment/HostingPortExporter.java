package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.statik.PortOrientation;

@objid ("e2e409b4-2bfa-485b-a6c6-727bb1a9505d")
public abstract class HostingPortExporter<T extends HostingPort> extends FeatureExporter<T> {
    @objid ("d26ca4ce-2de0-4f30-a990-d1f9d5fb7527")
    public HostingPortExporter(T elt) {
        super(elt);
    }

    @objid ("5e2d5a6f-e740-4cae-928c-f02f2e3d5c1c")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("9c1ac379-1eb1-4a30-acca-746d64be561b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("0dc7f4b2-82a3-4b93-baac-c34b4d01b8fb")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
