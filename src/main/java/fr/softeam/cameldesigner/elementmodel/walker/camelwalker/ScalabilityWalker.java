package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("2d5b7fe1-eb08-4934-a037-71214cede6df")
public class ScalabilityWalker extends AbstractCamelWalker {
    @objid ("58c45feb-edaf-49f2-a7b0-ece951c0fdd7")
    public ScalabilityWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("7294ec56-fc89-410c-b2ce-19222aeb3111")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
