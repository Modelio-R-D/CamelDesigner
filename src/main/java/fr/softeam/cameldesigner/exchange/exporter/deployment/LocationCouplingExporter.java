package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1277d689-944a-4324-9278-89562766c0f7")
public class LocationCouplingExporter<T extends LocationCoupling> extends ComponentRelationExporter<T> {
    @objid ("5ce72264-7c4a-4e92-9d52-361344c94038")
    public LocationCouplingExporter(T elt) {
        super(elt);
    }

    @objid ("30beaaf6-5d76-4d06-bf04-6f74ad6d29c4")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createLocationCoupling();
    }

    @objid ("00a39ff7-53f7-4e66-b2b2-b8d6bb62a9b9")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("c7d65b95-b61b-41a9-a9ce-cf325ad07e26")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
