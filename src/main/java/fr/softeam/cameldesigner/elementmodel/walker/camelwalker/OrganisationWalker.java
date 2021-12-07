package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("f7ac8dcf-3da1-414e-9d29-c50db4cdf124")
public class OrganisationWalker extends AbstractCamelWalker {
    @objid ("f54b92e3-b91b-4e4c-9da7-f5f5586f581b")
    public OrganisationWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("761b7ccd-6851-4bf6-8975-6b9b0a46ae10")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        // TODO Auto-generated method stub
    }

}
