package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bd6fe12d-860c-49b5-b1e4-b968e1af4e81")
public class ModelResourceFilterExporter<T extends ModelResourceFilter> extends ResourceFilterExporter<T> {
    @objid ("ffd7c11d-f996-49ce-bb56-714923c4ebd2")
    public ModelResourceFilterExporter(T elt) {
        super(elt);
    }

    @objid ("e18bf8a9-664b-4254-9159-00f70decfabf")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createModelResourceFilter();
    }

    @objid ("b112da9c-f5fa-4529-8b4a-e847226e199c")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("73d54bd2-217f-48ee-9f37-0e1c96552970")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
