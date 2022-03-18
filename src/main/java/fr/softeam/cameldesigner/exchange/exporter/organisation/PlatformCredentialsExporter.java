package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d3fe5538-7a3d-4d11-8b51-a0a77631dfcc")
public class PlatformCredentialsExporter<T extends PlatformCredentials> extends CredentialsExporter<T> {
    @objid ("a26058f0-3c52-416a-b44a-ad4882a3f834")
    public PlatformCredentialsExporter(T elt) {
        super(elt);
    }

    @objid ("aa31b605-21ec-4782-bc44-82531eadf3cb")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createPlatformCredentials();
    }

    @objid ("30b20607-6860-429a-a211-227f34b4aa7c")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.PlatformCredentials) {
            setPassword((camel.organisation.PlatformCredentials) elt);
        }
    }

    @objid ("117e246c-8c12-476c-afd6-102044d11944")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.organisation.User) && (elt instanceof camel.organisation.PlatformCredentials)) {
            ((camel.organisation.User) context).setPlatformCredentials((camel.organisation.PlatformCredentials) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("abcb9fc1-0899-480f-a1ea-3b9194f22f20")
    private void setPassword(camel.organisation.PlatformCredentials elt) {
        String content = this._element.getPassword();
        if (content != null)
            elt.setPassword(content);
    }

}
