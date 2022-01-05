package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;
import fr.softeam.cameldesigner.elementmodel.walker.IWalker;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2274e6f8-6e5e-423e-abae-f8597e8b3f73")
public abstract class AbstractCamelWalker implements IWalker<CDOObject> {
    @objid ("4441316e-4128-42d2-8f8a-0aef5efe19aa")
    protected AbstractReverseProcess reverseProcess;

    @objid ("430c4cea-a7fb-4c3c-a0fa-2d536e767616")
    @Override
    public void walk(CDOObject element) {
        CamelElement umlModelElement = this.reverseProcess.process(element );
        
        if(umlModelElement != null) {
            walkChildren(element, umlModelElement);
        }
    }

    @objid ("2f01af4f-ba96-4cb5-8c9a-98a245d05657")
    protected abstract void walkChildren(Object processedElement, CamelElement resultedElement);

}
