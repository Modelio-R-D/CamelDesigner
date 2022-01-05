package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
    }

    @objid ("184b54d0-074e-43c6-9576-9269b5bcd8c5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
