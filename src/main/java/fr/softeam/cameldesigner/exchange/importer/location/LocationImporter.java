package fr.softeam.cameldesigner.exchange.importer.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.location.Location;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;

@objid ("d17f1f8a-50fd-408d-8700-48345c2101ad")
public class LocationImporter<T extends Location, V extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location> extends FeatureImporter<T,V> {
    @objid ("e7a256a6-1a03-4a48-87a5-9bae49b5b0a6")
    public LocationImporter() {
        super();
    }

    @objid ("dc666b02-8df2-4d6b-ab5e-b4a88c5e4ca9")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location.create();
    }

    @objid ("ca011f90-dba7-424f-a203-09736389a59c")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setId(elt);
    }

    private void setId(V elt) {
        String id = this._element.getId();
        if (id != null) {
            elt.setId(id);
        }
    }

    @objid ("1bbed77b-d7fd-4d75-9bfe-b0c61103aee3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitLocation(this);
    }

}
