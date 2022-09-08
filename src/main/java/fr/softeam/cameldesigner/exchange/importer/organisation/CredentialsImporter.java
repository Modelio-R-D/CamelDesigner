package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.Credentials;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("0c554256-eeac-49e2-af13-3f8d3e7cf1e1")
public class CredentialsImporter<T extends Credentials, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials> extends FeatureImporter<T,V> {
    @objid ("2514e7aa-813e-46f0-bdef-deeacf7c7eb7")
    public CredentialsImporter() {
    }

    @objid ("cd87b867-b48e-4dc1-b155-2c5003ecf6aa")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCredentials(this);
    }

    @objid ("e12c0f32-b9cc-48d7-925f-31956ce8b21e")
    public CredentialsImporter(T elt) {
        super(elt);
    }

    @objid ("ba40e1a4-aa5e-4bb3-9f8d-40cf779a3490")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials.create();
    }

    @objid ("fa2f4510-f6eb-42eb-b460-e3f2e7674617")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
