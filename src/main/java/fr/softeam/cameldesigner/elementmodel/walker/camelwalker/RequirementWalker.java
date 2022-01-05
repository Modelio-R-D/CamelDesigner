package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.requirement.Requirement;
import camel.requirement.RequirementModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("00146efe-b0e4-4deb-9b85-772e862b2147")
public class RequirementWalker extends AbstractCamelWalker {
    @objid ("8f9e0dd3-b94b-4268-9f75-ae629215b4b2")
    public RequirementWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("16f6217c-8591-464b-a104-67627b7c883b")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        if(processedElement instanceof RequirementModel) {
        
            RequirementModel requirementModel = (RequirementModel) processedElement;
            for (Requirement requirement : requirementModel.getRequirements()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(requirement);
            }
        }
    }

}
