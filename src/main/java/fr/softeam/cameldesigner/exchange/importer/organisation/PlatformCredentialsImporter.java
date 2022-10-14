package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.PlatformCredentials;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("9646e977-6420-4d58-84d2-79106b83cdfe")
public class PlatformCredentialsImporter<T extends PlatformCredentials, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials> extends CredentialsImporter<T,V> {
    @objid ("1765fa8f-81f6-4241-aefc-17cd0f345c4a")
    public PlatformCredentialsImporter() {
    }

    @objid ("f1daadd7-c8c1-43fe-9fa0-5b9cc16bf657")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPlatformCredentials(this);
    }

    @objid ("7a7f1cca-2779-4fba-b666-24425fe70f80")
    public PlatformCredentialsImporter(T elt) {
        super(elt);
    }

    @objid ("e35f169a-0af3-4fff-8a8b-6e8c1c7c11da")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.create();
    }

    @objid ("bc14e31e-ffb0-47b0-8088-815588738f2d")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof User)
            ((User)context).setPlatformCredentials(elt);
        else
            super.attach(elt, context);
    }

    @objid ("cd913f8e-ba8e-46de-ae58-9b39ae307a3c")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setPassword(elt);
    }

    @objid ("df7cb5d3-bb3b-485f-b336-602de6a1d398")
    private void setPassword(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getPassword();
        if (value != null) {
            elt.setPassword(value);        
            }
    }

}
