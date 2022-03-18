package fr.softeam.cameldesigner.exchange.exporter.organisation;

import java.util.ArrayList;
import java.util.List;
import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import org.eclipse.emf.cdo.CDOObject;

@objid ("78fe13c3-1290-4f2d-9e16-ea7dc4d35a57")
public class OrganisationExporter<T extends Organisation> extends EntityExporter<T> {
    @objid ("37c2dd96-53d2-42b3-af6b-4290ba2d7f1a")
    public OrganisationExporter(T elt) {
        super(elt);
    }

    @objid ("38ee6127-8189-4189-83ee-51b3ff65f1eb")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createOrganisation();
    }

    @objid ("cce43c26-fe4a-4030-a0c7-a3cbc1a4d295")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.Organisation) {
            camel.organisation.Organisation org = (camel.organisation.Organisation) elt;
            setWWW(org);
            setPostalAddress(org);
            setEmail(org);
            setCloudCredentials(org);
        }
    }

    @objid ("184b54d0-074e-43c6-9576-9269b5bcd8c5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.OrganisationModel) && (elt instanceof camel.organisation.Organisation)) {
            ((camel.organisation.OrganisationModel) context).setOrganisation((camel.organisation.Organisation) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("6cf7badd-c8af-4c7d-b449-c87ae11d3c00")
    private void setWWW(camel.organisation.Organisation org) {
        String content = this._element.getWww();
        if (content != null)
            org.setWww(content);
    }

    @objid ("074e1854-1546-4958-9849-408f2d5af9b9")
    private void setPostalAddress(camel.organisation.Organisation org) {
        String content = this._element.getPostalAddress();
        if (content != null)
            org.setPostalAddress(content);
    }

    @objid ("1e76b1b7-06a9-4157-a77f-521305f5ef8a")
    private void setEmail(camel.organisation.Organisation org) {
        String content = this._element.getEmail();
        if (content != null)
            org.setEmail(content);
    }

    @objid ("f28fe90a-1084-4f5d-bbb8-1654788ba6ab")
    private void setCloudCredentials(camel.organisation.Organisation org) {
        List<camel.organisation.CloudCredentials> cloudCredentials = new ArrayList<>();
        for (CloudCredentials cc : this._element.getCloudCredentials()) {
            CDOObject camelCC = this._process.getElement(cc);
            if ((camelCC != null) &&  (camelCC instanceof camel.organisation.CloudCredentials))
                cloudCredentials.add((camel.organisation.CloudCredentials) camelCC);
        }
        
        org.getCloudCredentials().addAll(cloudCredentials);
    }

}
