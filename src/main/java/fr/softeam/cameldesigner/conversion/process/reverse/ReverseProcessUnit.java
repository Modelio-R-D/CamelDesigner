package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("d73f925e-7cd0-4eb4-b89c-283c47824dff")
public class ReverseProcessUnit extends AbstractReverseProcess {
    @objid ("794307ee-c5bc-479e-a251-993d2c7401b3")
    public ReverseProcessUnit(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("89a4ff1d-6f4c-4ce2-94ac-f3951e178bbc")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

}
