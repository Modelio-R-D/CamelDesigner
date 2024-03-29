package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("deeee339-4aec-41d5-9d50-f4bd0b0f8d27")
public class ServiceResourceFilterExporter<T extends ServiceResourceFilter> extends ResourceFilterExporter<T> {
    @objid ("112ab82c-1b21-4cb7-a93c-b62475c20954")
    public ServiceResourceFilterExporter(T elt) {
        super(elt);
    }

    @objid ("0908cb06-c4e9-49bb-9778-9ba363458303")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createServiceResourceFilter();
    }

    @objid ("650c5bce-eaea-4c4c-84ed-086110180396")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.ServiceResourceFilter) {
            camel.organisation.ServiceResourceFilter srf = (camel.organisation.ServiceResourceFilter) elt;
            setServiceURL(srf);
            setEveryService(srf);
        }
    }

    @objid ("7a55a2e8-6350-40b8-89d8-db1539b4b3f7")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("adc5e7d3-9f25-4122-97a1-68f6e38fee9c")
    private void setServiceURL(camel.organisation.ServiceResourceFilter servFilter) {
        String content = this._element.getServiceURL();
        if (content != null)
            servFilter.setServiceURL(content);
    }

    @objid ("b64a705b-f18b-45a2-a1ec-c71308ad4b52")
    private void setEveryService(camel.organisation.ServiceResourceFilter servFilter) {
        servFilter.setEveryService(this._element.isEveryService());
    }

}
