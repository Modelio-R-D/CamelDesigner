package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.ResourceFilter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c78b2476-eaf2-4ef3-abbd-0499010c399f")
public class ResourceFilterImporter<T extends ResourceFilter, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter> extends FeatureImporter<T,V> {
    @objid ("b022de68-acb7-48b0-ac45-fa8f446aac87")
    public ResourceFilterImporter() {
    }

    @objid ("7a698326-3632-4a0f-89bb-38d50ffd08b9")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitResourceFilter(this);
    }

    @objid ("fd2aedf7-df59-416b-be6a-68fd448cc016")
    public ResourceFilterImporter(T elt) {
        super(elt);
    }

    @objid ("0ccb058d-85e1-4537-9266-d79aafa7d0bb")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter.create();
    }

    @objid ("59a6c1e9-aaee-4243-bef6-5045f17ff2d0")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addResourceFilters(elt);
        else
            super.attach(elt, context);
    }

}
