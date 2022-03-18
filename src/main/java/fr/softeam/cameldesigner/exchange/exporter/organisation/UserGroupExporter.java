package fr.softeam.cameldesigner.exchange.exporter.organisation;

import java.util.ArrayList;
import java.util.List;
import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("cc079c88-204e-4842-9b80-309e413c1bf6")
public class UserGroupExporter<T extends UserGroup> extends FeatureExporter<T> {
    @objid ("f494de00-910b-439f-ab63-e264d1ae1441")
    public UserGroupExporter(T elt) {
        super(elt);
    }

    @objid ("a95afe01-f187-45f7-84f1-7088afe851b4")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createUserGroup();
    }

    @objid ("f85199b5-e14a-4da4-a6a8-eef99cb3918e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.UserGroup) {
            setUsers( (camel.organisation.UserGroup) elt);
        }
    }

    @objid ("1902181f-c240-4b4a-acc5-2b1a3bf7fa55")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.OrganisationModel) && (elt instanceof camel.organisation.UserGroup)) {
            ((camel.organisation.OrganisationModel) context).getUserGroups().add((camel.organisation.UserGroup) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("711ae589-1e49-4edb-b8db-69fe50773792")
    private void setUsers(camel.organisation.UserGroup userGroup) {
        List<camel.organisation.User> users = new ArrayList<>();
        for (User user : this._element.getUsers()) {
            CDOObject camelUser = this._process.getElement(user);
            if ((camelUser != null) &&  (camelUser instanceof camel.organisation.User))
                users.add((camel.organisation.User) camelUser);
        }
        
        userGroup.getUsers().addAll(users);
    }

}
