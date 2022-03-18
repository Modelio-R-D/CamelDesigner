package fr.softeam.cameldesigner.exchange.exporter.location;

import camel.location.LocationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("91da7625-e226-40f5-bbbc-c7d213a91edd")
public class GeographicalRegionExporter<T extends GeographicalRegion> extends NamedElementExporter<T> {
    @objid ("8ef5071a-7fd8-4806-81f7-aa6d46f9c55b")
    public GeographicalRegionExporter(T elt) {
        super(elt);
    }

    @objid ("61268fed-99f4-4e4f-974f-339ee332b723")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return LocationFactory.eINSTANCE.createGeographicalRegion();
    }

    @objid ("999a2cfa-4d26-48b7-ae60-d12b1976ba5a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.location.GeographicalRegion) {
            setAlternativeNames((camel.location.GeographicalRegion) elt);
        }
    }

    @objid ("5dd9b184-d434-4765-b920-eaf123b01632")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ( (elt instanceof camel.location.GeographicalRegion) && (context instanceof camel.location.LocationModel))  {
            ((camel.location.LocationModel) context).getRegions().add((camel.location.GeographicalRegion) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("c25c5884-11b9-46b0-8fd4-a200e3135ceb")
    private void setAlternativeNames(camel.location.GeographicalRegion elt) {
        elt.getAlternativeNames().addAll(this._element.getAlternativeNames());
    }

}
