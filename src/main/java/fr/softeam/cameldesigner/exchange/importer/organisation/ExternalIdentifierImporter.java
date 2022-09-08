package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.ExternalIdentifier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1f004be9-6667-4ea9-9784-ab431bc27cb0")
public class ExternalIdentifierImporter<T extends ExternalIdentifier, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier> extends FeatureImporter<T,V> {
    @objid ("70345b4e-e49e-46aa-b410-2d5a59a9e7ed")
    public ExternalIdentifierImporter() {
    }

    @objid ("8fb64ee3-df5b-4125-b14a-040caa10653d")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitExternalIdentifier(this);
    }

    @objid ("c2e08b4f-140e-49ce-a911-5c0a1b9f9b12")
    public ExternalIdentifierImporter(T elt) {
        super(elt);
    }

    @objid ("b7da65e5-ab25-4275-8f71-78eaaa756b75")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.create();
    }

    @objid ("fb16190f-d151-4b0b-b096-c7176ae1e057")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addExternalIdentifiers(elt);
        else if (context instanceof User)
            ((User)context).addExternalIdentifiers(elt);
    }

}
