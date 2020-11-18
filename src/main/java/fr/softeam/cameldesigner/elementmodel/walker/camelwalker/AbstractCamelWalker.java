package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;
import fr.softeam.cameldesigner.elementmodel.walker.IWalker;

public abstract class AbstractCamelWalker implements IWalker {
    protected AbstractReverseProcess reverseProcess;

    @Override
    public void walk(Object element) {
        CamelElement umlModelElement = this.reverseProcess.process(element );
        
        if(umlModelElement != null) {
            walkChildren(element, umlModelElement);
        }
    }

    protected abstract void walkChildren(Object processedElement, CamelElement resultedElement);

}
