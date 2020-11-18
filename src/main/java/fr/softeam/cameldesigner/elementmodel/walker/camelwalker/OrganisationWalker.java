package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

public class OrganisationWalker extends AbstractCamelWalker {
    public OrganisationWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
