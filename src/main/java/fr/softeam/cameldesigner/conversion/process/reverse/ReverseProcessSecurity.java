package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcessSecurity extends AbstractReverseProcess {
    public ReverseProcessSecurity(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

}
