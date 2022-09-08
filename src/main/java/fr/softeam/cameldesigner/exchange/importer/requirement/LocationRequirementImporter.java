package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.location.Location;
import camel.requirement.LocationRequirement;
import camel.security.SecurityControl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("e909f54d-2779-4d10-b695-a99c337983a9")
public class LocationRequirementImporter<T extends LocationRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement> extends HardRequirementImporter<T,V> {
    @objid ("b0571419-5ef1-4b01-bd11-1902c59e06d3")
    public LocationRequirementImporter() {
    }

    @objid ("aa0846c2-48fe-4189-b25e-523c3e7fd9f9")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitLocationRequirement(this);
    }

    @objid ("fbb65de5-fbae-474f-b0ed-47195afa6372")
    public LocationRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("1df8f700-cf5d-41cb-8c74-3615e05f571a")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.create();
    }

    @objid ("820c5c19-a661-4109-aa13-198639ee5479")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

    @objid ("260594bc-2923-4da7-99fd-92cb0edf7299")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setLocations(elt);
        setAllRequired(elt);
    }

    @objid ("c776a875-1851-4f78-9ab2-6339cb56a1ed")
    private void setLocations(V elt) {
        // TODO Auto-generated method stub
        EList<Location> value = this._element.getLocations();
        if (value != null) {
            for (Location location: value)
            elt.addLocations((fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location) location);
        }
    }

    @objid ("2aa50a60-32ed-4216-848d-02d39787c817")
    private void setAllRequired(V elt) {
        // TODO Auto-generated method stub
        Boolean value = this._element.isAllRequired();
        if (value != null) {
            elt.setAllRequired(value);
        }
    }

}
