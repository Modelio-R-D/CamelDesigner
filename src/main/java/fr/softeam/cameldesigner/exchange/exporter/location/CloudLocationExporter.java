package fr.softeam.cameldesigner.exchange.exporter.location;

import camel.location.LocationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d32a2de1-1024-48c5-9a33-0e5d5fadf45b")
public class CloudLocationExporter<T extends Location> extends NamedElementExporter<T> {
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
    }

    @objid ("22a179fc-5ee7-4cbf-9fcc-fdbbf0bf1469")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
