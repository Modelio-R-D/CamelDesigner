package fr.softeam.cameldesigner.exchange.exporter.organisation;

import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("08a82255-6ba4-44b8-a0e6-202edf39b154")
public class EntityExporter<T extends Entity> extends FeatureExporter<T> {
    @objid ("45284385-cb21-4822-8b6e-5d220b58b6cf")
    public EntityExporter(T elt) {
        super(elt);
    }

    @objid ("a3b1c2d8-8221-4261-8ec7-e6240d422614")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createEntity();
    }

    @objid ("a119d2a6-9855-4c13-b526-873aaa69afa0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("73dfe845-87b5-42c9-b132-4e6ae60f720f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
