package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("b09a6107-4bf7-41d4-a4fc-941015df17ed")
public class ExecutionWalker extends AbstractCamelWalker {
    @objid ("fbc94b97-53a3-472c-bdb1-8a40f871d8b4")
    public ExecutionWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("2c0c3b51-d753-4465-b154-5a9b77df16e1")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
