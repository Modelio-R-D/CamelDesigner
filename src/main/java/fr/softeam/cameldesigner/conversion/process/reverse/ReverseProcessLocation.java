package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("9b1e9cb2-313f-4597-a602-a8ce6953233d")
public class ReverseProcessLocation extends AbstractReverseProcess {
    @objid ("48d961e0-1920-499a-baec-d8ff3d808517")
    public ReverseProcessLocation(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("a63476da-f461-4505-9948-690a46ec9c6e")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

}
