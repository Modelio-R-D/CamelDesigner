package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.requirement.Requirement;
import camel.requirement.RequirementModel;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

public class RequirementWalker extends AbstractCamelWalker {
    public RequirementWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

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
