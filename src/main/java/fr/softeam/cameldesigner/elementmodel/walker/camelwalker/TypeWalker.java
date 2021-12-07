package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("c3fd8fbb-c58c-4eb2-945a-8b89f95d784b")
public class TypeWalker extends AbstractCamelWalker {
    @objid ("8f0d53a8-5a13-4c35-9e00-0f01636b9573")
    public TypeWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("61c66f2b-c048-4a55-ac12-dfdbaf335cc3")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
