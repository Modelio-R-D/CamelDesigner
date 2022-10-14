package fr.softeam.cameldesigner.exchange.importer.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.location.CloudLocation;
import camel.location.GeographicalRegion;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("8975e2da-976b-45bb-8952-6975571441bd")
public class CloudLocationImporter<T extends CloudLocation, V extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation> extends LocationImporter<T,V> {
    @objid ("baf69528-f5d7-488c-af73-b2c2095e8651")
    public CloudLocationImporter() {
        super();
    }

    @objid ("b413c353-8917-46b8-ae89-d70e3060a804")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.create();
    }

    @objid ("4c19564c-a4a1-43b2-8c5f-848c303f542f")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof LocationModel)
            ((LocationModel)context).addCloudLocations(elt);
        else if (context instanceof fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation)
            ((fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation)context).addSubLocations(elt);
    }

    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setIsAssignable(elt);
        setGeographicalRegion(elt);
    }

    private void setGeographicalRegion(V elt) {
        GeographicalRegion reg = this._element.getGeographicalRegion();
        if (reg != null) {
            CamelElement modelioReg = this._process.getElement(reg);
            if ((modelioReg != null) && (modelioReg instanceof fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion)) {
                elt.setGeographicalRegion((fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion) modelioReg);
            }
        }
    }

    private void setIsAssignable(V elt) {
        elt.setIsAssignable(this._element.isIsAssignable());
    }

    @objid ("01303ce1-18a0-4145-869b-8bbbc9160712")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCloudLocation(this);
    }

}
