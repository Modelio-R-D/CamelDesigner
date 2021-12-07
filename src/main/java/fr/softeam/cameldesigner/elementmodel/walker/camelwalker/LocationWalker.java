package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("91a83457-032e-4193-b67f-f2e4c0cad64a")
public class LocationWalker extends AbstractCamelWalker {
    @objid ("db9f883e-5c6b-4c39-bdcf-1b837fc85b56")
    public LocationWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("c5ca9bff-ce64-467e-b2f9-0914fa54e7d4")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
