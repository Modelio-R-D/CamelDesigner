package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("977e9f62-e130-4ab6-85b9-9b43bab34614")
public class VerticalScaleRequirementExporter<T extends VerticalScaleRequirement> extends ScaleRequirementExporter<T> {
    @objid ("d869aab2-8dff-4798-b374-dc27c5d19cbd")
    public VerticalScaleRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("8b2c329d-e27f-4dd6-b034-716b2e109b2b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createVerticalScaleRequirement();
    }

    @objid ("44b43e59-52a9-4f5d-bbe1-6e4a3c8f569a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("e0ec3aac-074e-4930-89fe-598f23bca453")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
