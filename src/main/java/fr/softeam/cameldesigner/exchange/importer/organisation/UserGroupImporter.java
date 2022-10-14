package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.User;
import camel.organisation.UserGroup;
import camel.requirement.RequirementModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("51e5bafc-51af-4879-b59d-65109a78ab40")
public class UserGroupImporter<T extends UserGroup, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup> extends FeatureImporter<T,V> {
    @objid ("f843b812-c324-426a-a7fc-4016f6bd19bf")
    public UserGroupImporter() {
    }

    @objid ("3ad60723-4232-478d-81a2-4b9f49fcb242")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUserGroup(this);
    }

    @objid ("710902f3-dd1b-45aa-b5d9-3692ee4f8386")
    public UserGroupImporter(T elt) {
        super(elt);
    }

    @objid ("688e010a-f176-42c6-83eb-b5fc46bd3c53")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.create();
    }

    @objid ("d89058f5-5965-4729-99e8-23838ec94cbf")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addUserGroups(elt);
        else 
            super.attach(elt, context);
    }

    @objid ("dd6fcbde-1bd7-4a7e-9b22-8089534c4b69")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setUsers(elt);
    }

    @objid ("b0b7c370-55c8-40d1-a20a-ac6c5615782b")
    private void setUsers(V elt) {
        // TODO Auto-generated method stub
        EList<User> value = this._element.getUsers();
        if (value != null) {
            CamelElement valueElt = this._process.getElement((CDOObject) value);
            if (valueElt instanceof User) {
                elt.addUsers( (fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User) valueElt);
        
            }
        }
    }

}
