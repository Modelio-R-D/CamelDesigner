package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("aafc3ace-e7b7-429c-aa55-c7f4dfb17fb1")
public class PermissionExporter<T extends Permission> extends FeatureExporter<T> {
    @objid ("28d34e1a-e625-4db7-9d5a-aad4cce22e16")
    public PermissionExporter(T elt) {
        super(elt);
    }

    @objid ("ba28c919-0e65-401b-a547-122a0870ac2a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createPermission();
    }

    @objid ("b0ee96f0-d33d-434f-90b3-b282af2532c5")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("d8f0dbe3-ddae-4e7f-8a22-e36f687d6294")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
