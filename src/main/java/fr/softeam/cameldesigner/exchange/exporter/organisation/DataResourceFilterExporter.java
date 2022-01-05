package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("98d0f82a-f17f-4616-a18c-ab0d96347e08")
public class DataResourceFilterExporter<T extends DataResourceFilter> extends ResourceFilterExporter<T> {
    @objid ("ab955ee1-7c35-4cfe-a848-8843e9a9d0c0")
    public DataResourceFilterExporter(T elt) {
        super(elt);
    }

    @objid ("835ad362-ec6a-448b-bc3b-ae432a2b6d2b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createDataResourceFilter();
    }

    @objid ("45c2c81b-5ecb-4042-aea9-adb4f169151a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("4076af49-c897-4611-92e7-b47a9c6d2166")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
