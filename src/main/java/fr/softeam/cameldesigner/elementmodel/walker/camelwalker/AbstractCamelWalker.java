package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;
import fr.softeam.cameldesigner.elementmodel.walker.IWalker;

public abstract class AbstractCamelWalker implements IWalker<CDOObject> {

    protected AbstractReverseProcess reverseProcess;

    @Override
    public void walk(CDOObject element) {
        CamelElement umlModelElement = this.reverseProcess.process(element );

        if(umlModelElement != null) {
            walkChildren(element, umlModelElement);
        }
    }

    protected abstract void walkChildren(Object processedElement, CamelElement resultedElement);

}
