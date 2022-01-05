package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("fea0ec12-2e76-49a4-b094-74ff7cbf8331")
public class SoftwareComponentResourceFilterExporter<T extends SoftwareComponentResourceFilter> extends ResourceFilterExporter<T> {
    @objid ("d4737229-a7c6-43f1-a7f5-2c05a0f3d78b")
    public SoftwareComponentResourceFilterExporter(T elt) {
        super(elt);
    }

    @objid ("3bb91668-8cfd-49c0-814a-33488eb4532e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createSoftwareComponentResourceFilter();
    }

    @objid ("8f385d7e-a6f2-4947-ab99-b3a1e525f621")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("0874e6dd-b7f9-4538-81f2-66b1ff304c3f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
