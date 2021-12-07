package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("d30338e3-97a0-4bb1-9b5d-ea1f13e706f9")
public class ReverseProcessOrganisation extends AbstractReverseProcess {
    @objid ("1b7a5272-f603-47b4-a74a-71612929579e")
    public ReverseProcessOrganisation(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("5a5c56fc-aa09-4d25-9d6d-8ce39e571249")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

}
