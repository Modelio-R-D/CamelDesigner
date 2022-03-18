package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("32722bb2-dc17-43ff-b46e-1e67cbfc42d1")
public class RoleExporter<T extends Role> extends FeatureExporter<T> {
    @objid ("80e45f95-eb8e-4c9a-9e46-332662522da0")
    public RoleExporter(T elt) {
        super(elt);
    }

    @objid ("82827ece-55e7-4da3-8a09-bc3f19ab0f4a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createRole();
    }

    @objid ("8c315410-29e5-4adb-b6a5-ad01f6638517")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("8c70e7bb-e379-4bcf-b131-827f59fe1c8e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.OrganisationModel) && (elt instanceof camel.organisation.Role)) {
            ((camel.organisation.OrganisationModel) context).getRoles().add((camel.organisation.Role) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
