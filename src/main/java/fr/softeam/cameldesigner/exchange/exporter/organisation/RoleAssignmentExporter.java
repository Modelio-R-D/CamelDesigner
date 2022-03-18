package fr.softeam.cameldesigner.exchange.exporter.organisation;

import java.sql.Date;
import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b9a70bdf-6b1a-44a8-818f-639de5686421")
public class RoleAssignmentExporter<T extends RoleAssignment> extends FeatureExporter<T> {
    @objid ("9959cc16-3de8-4752-b435-9f98aa34f4d3")
    public RoleAssignmentExporter(T elt) {
        super(elt);
    }

    @objid ("833189db-cada-49f7-8aae-7856b3d46144")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createRoleAssignment();
    }

    @objid ("643d2439-aca9-44e6-a3fe-27032034eed8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.RoleAssignment) {
            camel.organisation.RoleAssignment roleAssign = (camel.organisation.RoleAssignment) elt;
            setRole(roleAssign);
            setUser(roleAssign);
            setUserGroup(roleAssign);
            setStartTime(roleAssign);
            setEndTime(roleAssign);
            setAssignmentTime(roleAssign);
        }
    }

    @objid ("a0dcf6c6-c83b-4a6a-9d6b-3afa1e982ef5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.OrganisationModel) && (elt instanceof camel.organisation.RoleAssignment)) {
            ((camel.organisation.OrganisationModel) context).getRoleAssigments().add((camel.organisation.RoleAssignment) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("8cfb7066-5ced-47a3-9216-a356a6e8c058")
    private void setRole(camel.organisation.RoleAssignment roleAssign) {
        CDOObject role = this._process.getElement(this._element.getRole());
        if ((role != null) &&  (role instanceof camel.organisation.Role))
            roleAssign.setRole((camel.organisation.Role) role);
    }

    @objid ("c5f47970-0667-45e5-90b2-3c75b845f9a5")
    private void setUser(camel.organisation.RoleAssignment roleAssign) {
        CDOObject user = this._process.getElement(this._element.getUser());
        if ((user != null) &&  (user instanceof camel.organisation.User))
            roleAssign.setUser((camel.organisation.User) user);
    }

    @objid ("b5b94f09-29b9-4cb6-ab28-80edb05bb7c2")
    private void setUserGroup(camel.organisation.RoleAssignment roleAssign) {
        CDOObject userGroup = this._process.getElement(this._element.getUserGroup());
        if ((userGroup != null) &&  (userGroup instanceof camel.organisation.UserGroup))
            roleAssign.setUserGroup((camel.organisation.UserGroup) userGroup);
    }

    @objid ("bea22b7f-56e1-40e0-a92e-ca16e44344d1")
    private void setStartTime(camel.organisation.RoleAssignment roleAssign) {
        String content = this._element.getStartTime();
        if (content != null)
            roleAssign.setStartTime(Date.valueOf(content));
    }

    @objid ("bdc1d294-fc1d-406e-98c4-c15cb931a2fa")
    private void setEndTime(camel.organisation.RoleAssignment roleAssign) {
        String content = this._element.getEndTime();
        if (content != null)
            roleAssign.setEndTime(Date.valueOf(content));
    }

    @objid ("7b84e728-eae4-4ce4-bdc5-c7eb78cc73af")
    private void setAssignmentTime(camel.organisation.RoleAssignment roleAssign) {
        String content = this._element.getAssignmentTime();
        if (content != null)
            roleAssign.setAssignmentTime(Date.valueOf(content));
    }

}
