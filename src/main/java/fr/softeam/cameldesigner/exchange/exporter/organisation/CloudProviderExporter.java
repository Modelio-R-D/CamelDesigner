package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider;
import org.eclipse.emf.cdo.CDOObject;

@objid ("eb53075f-d954-4ff4-bb9f-18fff27513d8")
public class CloudProviderExporter<T extends CloudProvider> extends OrganisationExporter<T> {
    @objid ("e92ba400-031c-4f60-bbd4-786402f300cf")
    public CloudProviderExporter(T elt) {
        super(elt);
    }

    @objid ("ea6e54ac-5b71-452a-973e-010fe7387489")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createCloudProvider();
    }

    @objid ("fff6ae49-5d80-4ab8-803c-f26d2d3022d7")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.CloudProvider) {
            camel.organisation.CloudProvider cp = (camel.organisation.CloudProvider) elt;
            setIsPublic(cp);
            setIsSaaS(cp);
            setIsPaaS(cp);
            setIsIaaS(cp);
        }
    }

    @objid ("52a18972-f046-43dc-9e43-4b79196a4bb9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("41720d22-aea4-4b30-a20e-eeed7d99c2ae")
    private void setIsPublic(camel.organisation.CloudProvider cp) {
        cp.setPublic(this._element.isPublic());
    }

    @objid ("8da5017b-bf29-4d83-866d-d199a20cc829")
    private void setIsSaaS(camel.organisation.CloudProvider cp) {
        cp.setSaaS(this._element.isSaaS());
    }

    @objid ("67dc275d-7ea1-43df-a8e5-ae28b6b140ef")
    private void setIsPaaS(camel.organisation.CloudProvider cp) {
        cp.setPaaS(this._element.isPaaS());
    }

    @objid ("ab1de079-1900-4c86-bf92-feec54b004f3")
    private void setIsIaaS(camel.organisation.CloudProvider cp) {
        cp.setIaaS(this._element.isIaaS());
    }

}
