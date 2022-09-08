package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.User;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6be0a4fe-4098-448a-882c-e358bbbefcdb")
public class UserImporter<T extends User, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> extends EntityImporter<T,V> {
    @objid ("8e7a9b4c-2e82-4431-ac86-3e6f7d304f38")
    public UserImporter() {
    }

    @objid ("9d3321c9-a205-45bd-a96d-aa267eb25511")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUser(this);
    }

    @objid ("63bba0dd-3ae2-4831-afa4-f8fe5562808e")
    public UserImporter(T elt) {
        super(elt);
    }

    @objid ("4b756714-b836-4a40-a32f-9c5f8735bc62")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.create();
    }

    @objid ("b9f2794a-832c-4d76-a291-6bfc4482429b")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addUsers(elt);
        else 
            super.attach(elt, context);
    }

}
