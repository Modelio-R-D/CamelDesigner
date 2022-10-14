package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.Organisation;
import camel.organisation.User;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("b908a8b5-9acc-43e3-a219-df78186b4474")
public class OrganisationImporter<T extends Organisation, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation> extends EntityImporter<T,V> {
    @objid ("79d6cf98-0b66-47e9-909a-94d4d3b45f42")
    public OrganisationImporter() {
    }

    @objid ("2e913fca-b806-48dc-93fc-3fd47d77e738")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitOrganisation(this);
    }

    @objid ("46400e33-ee57-4b83-9cf5-43b23fcd4503")
    public OrganisationImporter(T elt) {
        super(elt);
    }

    @objid ("a171e138-0a0e-4071-8518-65bdc211c0e5")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.create();
    }

    @objid ("d31b1f91-6b89-4f3f-8c8b-04fae170a7e0")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).setOrganisation(elt);
        else
            super.attach(elt, context);
    }

    @objid ("35988931-26ff-417d-a499-0ea1570ff207")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setWww(elt);
        setPostalAddress(elt);
        setEmail(elt);
    }

    @objid ("4e6015be-e8ad-4152-98ad-162826a350f9")
    private void setPostalAddress(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getPostalAddress();
        if (value != null) {
            elt.setPostalAddress(value); 
            }
    }

    @objid ("c197a131-f1a7-45af-a10f-3cd7c8dc66f2")
    private void setWww(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getWww();
        if (value != null) {
            elt.setWww(value); 
            }
    }

    @objid ("c0e14678-85ff-4ffc-bc8a-94a67cb1021c")
    private void setEmail(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getEmail();
        if (value != null) {
            elt.setEmail(value); 
            }
    }

}
