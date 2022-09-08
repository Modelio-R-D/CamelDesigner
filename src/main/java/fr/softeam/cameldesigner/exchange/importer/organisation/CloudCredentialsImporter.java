package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.CloudCredentials;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("13c98fd3-df94-4875-b008-006b9e7a1c56")
public class CloudCredentialsImporter<T extends CloudCredentials, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials> extends CredentialsImporter<T,V> {
    @objid ("239ca21e-7bf3-4ded-879c-768e7deaaafb")
    public CloudCredentialsImporter() {
    }

    @objid ("11287ce7-cdb5-4a4b-9de9-a5f2d41c4d9b")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCloudCredentials(this);
    }

    @objid ("f51f0a9b-bce3-44e4-9ac5-8db25998aa6a")
    public CloudCredentialsImporter(T elt) {
        super(elt);
    }

    @objid ("a6d8b646-fa94-4984-8714-0d6c802562c3")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.create();
    }

    @objid ("bc387d78-826a-45e6-8b6f-76dad8ded082")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof Organisation)
            ((Organisation)context).addCloudCredentials(elt);
    }

}
