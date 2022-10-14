package fr.softeam.cameldesigner.exchange.importer.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.location.GeographicalRegion;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("c54f1432-d418-40b0-8add-0dabc029717f")
public class GeographicalRegionImporter<T extends GeographicalRegion, V extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion> extends LocationImporter<T,V> {
    @objid ("46b7eaf7-255c-40cb-b3f1-8880ae40a2f1")
    public GeographicalRegionImporter() {
        super();
    }

    @objid ("cefbea74-3c79-4a17-ad2a-4f3b4701fe7e")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.create();
    }

    @objid ("133c1eed-422c-4547-a383-97e3b8b3eb4c")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof LocationModel)
            ((LocationModel)context).addRegions(elt);
    }

    @objid ("202bf0a1-b9a4-4304-9ef3-c6c9ad70d7fb")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitGeographicalRegion(this);
    }

    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setParentRegions(elt);
        setAlternativeNames(elt);
    }

    private void setAlternativeNames(V elt) {
        for (String name : this._element.getAlternativeNames()) {
            elt.addAlternativeName(name);
        }
    }

    private void setParentRegions(V elt) {
      for (GeographicalRegion region : this._element.getParentRegions()) {
         CamelElement modelioRegion = this._process.getElement(region);
         if ((modelioRegion != null) && (modelioRegion instanceof fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion)) {
             elt.addParentRegions((fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion) modelioRegion);
         }
      }
    }

}
