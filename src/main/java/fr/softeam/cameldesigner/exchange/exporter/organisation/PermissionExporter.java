package fr.softeam.cameldesigner.exchange.exporter.organisation;

import java.sql.Date;
import camel.organisation.OrganisationFactory;
import camel.organisation.PermissionActionType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("aafc3ace-e7b7-429c-aa55-c7f4dfb17fb1")
public class PermissionExporter<T extends Permission> extends FeatureExporter<T> {
    @objid ("28d34e1a-e625-4db7-9d5a-aad4cce22e16")
    public PermissionExporter(T elt) {
        super(elt);
    }

    @objid ("ba28c919-0e65-401b-a547-122a0870ac2a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createPermission();
    }

    @objid ("b0ee96f0-d33d-434f-90b3-b282af2532c5")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.Permission) {
            camel.organisation.Permission perm = (camel.organisation.Permission) elt;
            setRole(perm);
            setStartTime(perm);
            setEndTime(perm);
            setResourceFilter(perm);
            setAction(perm);
        }
    }

    @objid ("d8f0dbe3-ddae-4e7f-8a22-e36f687d6294")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.OrganisationModel) && (elt instanceof camel.organisation.Permission)) {
            ((camel.organisation.OrganisationModel) context).getPermissions().add((camel.organisation.Permission) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("9450e1a4-08ef-4fa0-a8a2-48460eff843c")
    private void setRole(camel.organisation.Permission perm) {
        CDOObject role = this._process.getElement(this._element.getRole());
        if ((role != null) &&  (role instanceof camel.organisation.Role))
            perm.setRole((camel.organisation.Role) role);
    }

    @objid ("2a275f97-fe28-441a-b4f7-31c253e88d4c")
    private void setStartTime(camel.organisation.Permission perm) {
        String content = this._element.getStartTime();
        if (content != null)
            perm.setStartTime(Date.valueOf(content));
    }

    @objid ("e53f5bed-94bd-4435-a0fe-f8e5f937eea8")
    private void setEndTime(camel.organisation.Permission perm) {
        String content = this._element.getEndTime();
        if (content != null)
            perm.setEndTime(Date.valueOf(content));
    }

    @objid ("f55754e6-a456-4424-9d2b-8d3fce9369c1")
    private void setResourceFilter(camel.organisation.Permission perm) {
        CDOObject resFilter = this._process.getElement(this._element.getResourceFilter());
        if ((resFilter != null) &&  (resFilter instanceof camel.organisation.ResourceFilter))
            perm.setResourceFilter((camel.organisation.ResourceFilter) resFilter);
    }

    @objid ("d8acba84-b6d5-47df-b0bf-e874793445e0")
    private void setAction(camel.organisation.Permission perm) {
        String content = this._element.getAction();
        if (content != null)
            perm.setAction(PermissionActionType.valueOf(content));
    }

}
