package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("16e64050-a9d6-48b2-ac79-9951ca6334cf")
public class HorizontalScaleRequirementExporter<T extends HorizontalScaleRequirement> extends ScaleRequirementExporter<T> {
    @objid ("2164f73e-05b4-4c31-b716-07263f2fcd0b")
    public HorizontalScaleRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("4cce263c-d796-4094-a14d-2420e5ec8197")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createHorizontalScaleRequirement();
    }

    @objid ("9049f1f3-f9eb-45f0-a3a1-0bd90682046b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.requirement.HorizontalScaleRequirement) {
            camel.requirement.HorizontalScaleRequirement hsr  = (camel.requirement.HorizontalScaleRequirement) elt;
            setMinInstances(hsr);
            setMaxInstances(hsr);
        }
    }

    @objid ("225164dd-db64-4a8d-8ebe-016787bcc248")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("64d083e1-20f9-4987-bd61-4ead4c655b79")
    private void setMaxInstances(camel.requirement.HorizontalScaleRequirement hsr) {
        String content = this._element.getMaxInstances();
        if (content != null)
            hsr.setMaxInstances(Integer.valueOf(content));
    }

    @objid ("04967042-2a3c-477c-8ef8-a47ca644b04f")
    private void setMinInstances(camel.requirement.HorizontalScaleRequirement hsr) {
        String content = this._element.getMinInstances();
        if (content != null)
            hsr.setMinInstances(Integer.valueOf(content));
    }

}
