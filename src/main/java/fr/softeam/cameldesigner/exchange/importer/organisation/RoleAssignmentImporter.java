package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.RoleAssignment;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("82b0ec5d-6eb2-412b-ba06-1911a121fe37")
public class RoleAssignmentImporter<T extends RoleAssignment, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment> extends FeatureImporter<T,V> {
    @objid ("3384ef56-ee02-4c9b-8a8d-a6cb4211a905")
    public RoleAssignmentImporter() {
    }

    @objid ("cb9689c8-19e6-40a1-acff-093ba2f3987c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRoleAssignment(this);
    }

    @objid ("c2189a02-4002-4233-82c9-6cb6eebeacee")
    public RoleAssignmentImporter(T elt) {
        super(elt);
    }

    @objid ("44fb61a6-fa8d-4a07-9d9c-1528a6788bc4")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.create();
    }

    @objid ("1d0b2a12-6e6c-4f92-a8b3-e03f4060be18")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addRolesAssignements(elt);
        else 
            super.attach(elt, context);
    }

}
