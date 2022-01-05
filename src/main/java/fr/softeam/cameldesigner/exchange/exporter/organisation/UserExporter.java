package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d8b47108-f9c8-4b81-b7db-bf88a531ccd5")
public class UserExporter<T extends User> extends EntityExporter<T> {
    @objid ("976b195c-06ee-4379-85c3-798fda02481e")
    public UserExporter(T elt) {
        super(elt);
    }

    @objid ("a2e4a89a-bb9a-44e8-b0ca-6c9feb75aeac")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createUser();
    }

    @objid ("1416d602-e7ca-47ab-91ea-0b013d83130e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("86a87eed-3e9b-4d73-a5d3-e0bbdebac755")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
