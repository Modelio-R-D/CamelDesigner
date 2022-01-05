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
    }

    @objid ("52a18972-f046-43dc-9e43-4b79196a4bb9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
