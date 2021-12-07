package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("4d42b36e-6ea6-459f-89a1-e05b9ddbbc94")
public class ConstraintWalker extends AbstractCamelWalker {
    @objid ("7d70c464-59bd-478a-90fe-9e0f95fa4c6f")
    public ConstraintWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("0fc8ab0b-637a-4d98-8107-44d9a6288a71")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
