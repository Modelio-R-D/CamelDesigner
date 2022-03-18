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
        if (elt instanceof camel.organisation.CloudCredentials) {
            camel.organisation.CloudCredentials cc = (camel.organisation.CloudCredentials) elt;
            setCloudProviderName(cc);
            setSecurityGroup(cc);
            setPublicSSHKey(cc);
            setPrivateSSHKey(cc);
            setUsername(cc);
            setPassword(cc);
        }
    }

    @objid ("60d145ca-9b41-4279-ae6d-bf1093e3942d")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("709943e0-9d43-44f1-aef5-9982e34e9f97")
    private void setCloudProviderName(camel.organisation.CloudCredentials cc) {
        String content = this._element.getCloudProviderName();
        if (content != null)
            cc.setCloudProviderName(content);
    }

    @objid ("12ce392e-1394-4deb-9bbe-8531ceebed40")
    private void setSecurityGroup(camel.organisation.CloudCredentials cc) {
        String content = this._element.getSecurityGroup();
        if (content != null)
            cc.setSecurityGroup(content);
    }

    @objid ("366951b9-ed23-494b-9fcd-a92d6a66ee8d")
    private void setPublicSSHKey(camel.organisation.CloudCredentials cc) {
        String content = this._element.getPublicSSHKey();
        if (content != null)
            cc.setPublicSSHKey(content);
    }

    @objid ("42293159-c64b-4912-bcbf-593524178e10")
    private void setPrivateSSHKey(camel.organisation.CloudCredentials cc) {
        String content = this._element.getPrivateSSHKey();
        if (content != null)
            cc.setPrivateSSHKey(content);
    }

    @objid ("19b277f9-24c3-4f64-a1d9-e1e3a86b183b")
    private void setUsername(camel.organisation.CloudCredentials cc) {
        String content = this._element.getUsername();
        if (content != null)
            cc.setUsername(content);
    }

    @objid ("8f9baa82-8d2b-4cbe-b790-b3d335b8eb63")
    private void setPassword(camel.organisation.CloudCredentials cc) {
        String content = this._element.getPassword();
        if (content != null)
            cc.setPassword(content);
    }

}
