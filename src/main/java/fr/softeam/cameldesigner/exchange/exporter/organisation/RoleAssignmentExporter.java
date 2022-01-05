package fr.softeam.cameldesigner.exchange.exporter.organisation;

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
    }

    @objid ("a0dcf6c6-c83b-4a6a-9d6b-3afa1e982ef5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
