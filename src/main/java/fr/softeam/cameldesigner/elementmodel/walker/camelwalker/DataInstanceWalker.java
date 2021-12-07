package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("a7723591-c1a4-464c-b2c5-d663934bb0ad")
public class DataInstanceWalker extends AbstractCamelWalker {
    @objid ("e2760053-181c-4590-9c87-4658410a359a")
    public DataInstanceWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("efda4a97-6d9f-40fe-9e9d-d28a18df2356")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
