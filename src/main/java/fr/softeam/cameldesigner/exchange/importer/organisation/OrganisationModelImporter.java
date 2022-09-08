package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.OrganisationModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("100ecf71-5c65-4998-aaff-48b03ef5e3ed")
public class OrganisationModelImporter<T extends OrganisationModel, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel> extends SubModelImporter<T,V> {
    @objid ("b063e217-cde6-4992-a125-24ffc93cc511")
    public OrganisationModelImporter() {
    }

    @objid ("1782be40-17af-4f96-ac95-1cced4139c1b")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitOrganisationModel(this);
    }

    @objid ("b04568e6-0399-4cf9-9f44-e580f9474b8d")
    public OrganisationModelImporter(T elt) {
        super(elt);
    }

    @objid ("8f3d7c59-7438-4f54-b259-a15a5183aadc")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addOrganisationModels(elt);
    }

    @objid ("485f531e-4780-4a46-b2ef-a5878545c6aa")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.create();
    }

}
