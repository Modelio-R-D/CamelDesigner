package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a0374993-05ec-41cd-b650-cf154c70c463")
public class PaaSRequirementExporter<T extends PaaSRequirement> extends HardRequirementExporter<T> {
    @objid ("938896eb-19f4-4f8c-857d-b77fea4e4ad1")
    public PaaSRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("c78f436c-bce1-46b4-857f-2a58d8116faf")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createPaaSRequirement();
    }

    @objid ("bf26954c-42f9-4bf4-abb1-fc28d2c01553")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("930c2136-d135-420e-bf62-6f834d82197b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
