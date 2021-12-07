package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("f8136c35-2362-4e3a-85a3-cd192ed62421")
public class UnitWalker extends AbstractCamelWalker {
    @objid ("643df89f-19c9-4310-a6c9-1c732968e963")
    public UnitWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("643c05f7-1e76-4c1a-a8f8-480edbee677a")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
