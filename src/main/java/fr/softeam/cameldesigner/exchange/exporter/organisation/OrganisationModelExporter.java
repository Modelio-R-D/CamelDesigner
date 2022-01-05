package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f291cd5e-b171-44f7-b53c-c257474111da")
public class OrganisationModelExporter<T extends OrganisationModel> extends SubModelExporter<T> {
    @objid ("455536bb-6d1b-4f9a-aba4-8b8f47cd9029")
    public OrganisationModelExporter(T elt) {
        super(elt);
    }

    @objid ("849d8e2d-5cb8-45ea-9a92-59b48dac3182")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createOrganisationModel();
    }

    @objid ("eb06e71f-7dce-4e5b-93c7-c4dd58e230a6")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("19743cd6-be73-4790-85fd-e40a9f3d8af5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
