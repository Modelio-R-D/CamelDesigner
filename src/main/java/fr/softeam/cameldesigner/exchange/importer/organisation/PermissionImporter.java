package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.Permission;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c32b6c45-a18b-4578-af5f-331f922aefbe")
public class PermissionImporter<T extends Permission, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission> extends FeatureImporter<T,V> {
    @objid ("373d79c6-6bf1-43bd-a8fd-f6835811aefd")
    public PermissionImporter() {
    }

    @objid ("b2364876-85ae-4069-b136-a41c8289373a")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPermission(this);
    }

    @objid ("782ff92c-d4fc-4700-9be4-43a42f1992e5")
    public PermissionImporter(T elt) {
        super(elt);
    }

    @objid ("f3430ddd-a9a1-4c54-a8e1-e91971b1d6f5")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.create();
    }

    @objid ("d500aa4a-9e66-4bc5-893e-8337bb14d098")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addPermissions(elt);
    }

}
