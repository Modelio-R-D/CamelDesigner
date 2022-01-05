package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c1ae7157-a517-48ba-ad33-f9ce799e7f0b")
public class LocationRequirementExporter<T extends LocationRequirement> extends HardRequirementExporter<T> {
    @objid ("05126b94-8465-4576-ab52-03fd49517b02")
    public LocationRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("842dc62f-75a9-42d7-813a-b7b60b7cfec8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createLocationRequirement();
    }

    @objid ("d2081757-fb78-463f-8016-4ac66ad1807e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("c5401454-6ebd-43f4-9739-c9b6cab1382f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
