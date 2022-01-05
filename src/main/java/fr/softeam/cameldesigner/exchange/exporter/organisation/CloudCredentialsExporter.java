package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3f8983dd-b1ab-4100-b6e0-15a02d402dcf")
public class CloudCredentialsExporter<T extends CloudCredentials> extends CredentialsExporter<T> {
    @objid ("caa05d11-bcb6-4503-b6ff-f503fb25f6e2")
    public CloudCredentialsExporter(T elt) {
        super(elt);
    }

    @objid ("44e66db7-d2c9-4bf3-bf69-5df6b59f6dc7")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createCloudCredentials();
    }

    @objid ("95e5267a-405f-40f4-a2b6-4235b16d0b76")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("60d145ca-9b41-4279-ae6d-bf1093e3942d")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
