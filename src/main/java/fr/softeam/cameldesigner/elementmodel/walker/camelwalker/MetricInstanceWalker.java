package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("7154e349-a18b-4c9e-b8a0-b586dece25bb")
public class MetricInstanceWalker extends AbstractCamelWalker {
    @objid ("bdd61824-41f0-48e6-a6fc-0b93ce5d106b")
    public MetricInstanceWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("1e293e33-50cf-4bef-b841-67a0bca5ea19")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
