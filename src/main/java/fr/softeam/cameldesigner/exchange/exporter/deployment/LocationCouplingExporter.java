package fr.softeam.cameldesigner.exchange.exporter.deployment;

import java.util.ArrayList;
import java.util.List;
import camel.deployment.DeploymentFactory;
import camel.deployment.LocationCouplingType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
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
        if (elt instanceof camel.deployment.LocationCoupling) {
            camel.deployment.LocationCoupling lc = (camel.deployment.LocationCoupling) elt;
            setSoftwareComponents(lc);
            setCouplingType(lc);
            setRelaxed(lc);
        }
    }

    @objid ("c7d65b95-b61b-41a9-a9ce-cf325ad07e26")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentTypeModel) && (elt instanceof camel.deployment.LocationCoupling)) {
            ((camel.deployment.DeploymentTypeModel) context).getLocationCouplings().add((camel.deployment.LocationCoupling) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("93e730af-9cdb-447a-9689-255336a2c9ba")
    private void setRelaxed(camel.deployment.LocationCoupling lc) {
        lc.setRelaxed(this._element.isRelaxed());
    }

    @objid ("132071fb-fd52-4e4c-9df0-e676d9c51a31")
    private void setCouplingType(camel.deployment.LocationCoupling lc) {
        lc.setCouplingType(LocationCouplingType.valueOf(this._element.getCouplingType()));
    }

    @objid ("3b1a553f-d4e6-4555-8813-0f08f8191ee8")
    private void setSoftwareComponents(camel.deployment.LocationCoupling lc) {
        List<camel.deployment.SoftwareComponent> components = new ArrayList<>();
        for (SoftwareComponent component : this._element.getSoftwareComponents()) {
            CDOObject camelComponent = this._process.getElement(component);
            if ((camelComponent != null) &&  (camelComponent instanceof camel.deployment.SoftwareComponent))
                components.add((camel.deployment.SoftwareComponent) camelComponent);
        }
        
        lc.getSoftwareComponents().addAll(components);
    }

}
