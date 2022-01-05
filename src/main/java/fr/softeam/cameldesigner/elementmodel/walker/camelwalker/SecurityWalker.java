package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("c635c52a-312b-4114-bab8-c79d53908037")
public class SecurityWalker extends AbstractCamelWalker {
    @objid ("13b8ae40-6d5c-4acb-8a2d-bb40b9115f1b")
    public SecurityWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("b8360f60-4e1b-419c-9b61-e069b055dbc4")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
