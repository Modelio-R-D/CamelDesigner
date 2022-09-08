package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.CloudProvider;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8faec3cf-0db4-4665-9ce5-719f60d33125")
public class CloudProviderImporter<T extends CloudProvider, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider> extends OrganisationImporter<T,V> {
    @objid ("6705f539-c85c-454e-9566-c61b3c26ec1f")
    public CloudProviderImporter() {
    }

    @objid ("e798183b-ff0f-411c-84d4-5007936a8a81")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCloudProvider(this);
    }

    @objid ("62c3c8b7-f2fa-4119-a693-4c1c5b7f90ff")
    public CloudProviderImporter(T elt) {
        super(elt);
    }

    @objid ("67543af0-e0bc-4c90-bca7-58f8c5b4f016")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.create();
    }

    @objid ("09eae82e-e9f9-4d4b-b815-c1918a2fece3")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
