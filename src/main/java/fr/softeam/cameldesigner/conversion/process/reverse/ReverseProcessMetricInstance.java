package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("18777714-2734-4665-853d-396b1b510d4a")
public class ReverseProcessMetricInstance extends AbstractReverseProcess {
    @objid ("0ab18e16-23b8-4eb1-b9ec-4792101d42e1")
    public ReverseProcessMetricInstance(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("60c243dc-df0d-4928-bf2d-3073f25bc777")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

}
