package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("209bfa9f-44d8-4094-96aa-a1e5c3b25c16")
public class DeploymentInstanceWalker extends AbstractCamelWalker {
    @objid ("6e9509fa-95ef-4ce2-9c44-5a7e82e715e1")
    public DeploymentInstanceWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("2da18913-54ac-43ee-ad04-36971ac8efcc")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
