package fr.softeam.cameldesigner.exchange.exporter.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5be1ac7f-27c0-4875-a9e2-28770c6d88a0")
public abstract class RequirementExporter<T extends Requirement> extends FeatureExporter<T> {
    @objid ("078d2e5c-e51b-4c1b-a67f-2e0aed8b9b00")
    public RequirementExporter(T elt) {
        super(elt);
    }

    @objid ("0199a1da-de10-453f-a5fb-a47283d8cc99")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("2a847179-7449-4d41-b399-1a78f5b7ec2d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("01f72a30-3f3e-46f9-9312-0754ed47501f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.requirement.RequirementModel) && (elt instanceof camel.requirement.Requirement)) {
            ((camel.requirement.RequirementModel) context).getRequirements().add((camel.requirement.Requirement) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
