package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.Role;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("619cacfd-e62f-4351-a4e5-88897a8135f0")
public class RoleImporter<T extends Role, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role> extends FeatureImporter<T,V> {
    @objid ("3f1bb712-c4fc-44f0-a831-5fb45b5f5837")
    public RoleImporter() {
    }

    @objid ("0da24eff-31f2-48ec-9909-85c38b130425")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRole(this);
    }

    @objid ("c5fc1165-187e-4d25-97c1-eed50e5f9180")
    public RoleImporter(T elt) {
        super(elt);
    }

    @objid ("7e965adb-9b1c-4547-8e0d-9a7651c317d2")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.create();
    }

    @objid ("0097e077-25cb-4c4b-863f-f9df6d3a2910")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addRoles(elt);
        else 
            super.attach(elt, context);
    }

}
