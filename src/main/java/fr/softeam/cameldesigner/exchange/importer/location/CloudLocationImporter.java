package fr.softeam.cameldesigner.exchange.importer.location;

import camel.location.CloudLocation;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

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
    }

    @objid ("01303ce1-18a0-4145-869b-8bbbc9160712")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCloudLocation(this);
    }

}
