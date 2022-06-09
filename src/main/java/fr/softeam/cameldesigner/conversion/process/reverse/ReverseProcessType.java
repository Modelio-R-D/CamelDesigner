package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;

@objid ("00a43af2-5509-4f36-a3ce-1f5cdf80c7cb")
public class ReverseProcessType extends AbstractReverseProcess {
    @objid ("6e8487da-305e-4225-b10d-e837117cff7b")
    public ReverseProcessType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("6c9c4856-e729-423e-8d8e-9156213af19d")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
