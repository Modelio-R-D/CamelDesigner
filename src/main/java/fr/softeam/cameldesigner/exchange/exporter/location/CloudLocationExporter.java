package fr.softeam.cameldesigner.exchange.exporter.location;

import camel.location.LocationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d32a2de1-1024-48c5-9a33-0e5d5fadf45b")
public class CloudLocationExporter<T extends CloudLocation> extends NamedElementExporter<T> {
    @objid ("0168f31a-eece-402c-a8c0-fdcb7ab77eb3")
    public CloudLocationExporter(T elt) {
        super(elt);
    }

    @objid ("a402badd-45d2-484c-ba82-dee8a56a1e54")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return LocationFactory.eINSTANCE.createCloudLocation();
    }

    @objid ("6995cae1-f11c-4e89-a898-fb6a62b54b70")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.location.CloudLocation) {
            camel.location.CloudLocation cl = (camel.location.CloudLocation) elt;
            setIsAssignable(cl);
            setGeographicalRegion(cl);
        }
    }

    @objid ("22a179fc-5ee7-4cbf-9fcc-fdbbf0bf1469")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if (elt instanceof camel.location.CloudLocation) {
            if (context instanceof camel.location.LocationModel)  {
                ((camel.location.LocationModel) context).getCloudLocations().add((camel.location.CloudLocation) elt);
            }else if (context instanceof camel.location.CloudLocation){
                ((camel.location.CloudLocation) context).getSubLocations().add((camel.location.CloudLocation) elt);
            }
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("f8454ef4-347f-4cc4-b346-dc81a4a8dc3d")
    private void setGeographicalRegion(camel.location.CloudLocation cl) {
        CDOObject gr =  this._process.getElement(this._element.getGeographicalRegion());
        if ((gr != null) &&  (gr instanceof camel.location.GeographicalRegion))
            cl.setGeographicalRegion((camel.location.GeographicalRegion) gr);
    }

    @objid ("e243c67a-f36d-4f40-9a6f-36bffc3c6cce")
    private void setIsAssignable(camel.location.CloudLocation cl) {
        cl.setIsAssignable(this._element.isIsAssignable());
    }

}
