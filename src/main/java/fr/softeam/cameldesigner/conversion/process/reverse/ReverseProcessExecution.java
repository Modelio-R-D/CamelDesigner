package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("92dc2dd2-e83d-4679-b148-bebfd9dc74a6")
public class ReverseProcessExecution extends AbstractReverseProcess {
    @objid ("20e73540-ecff-44e0-832c-f9adf19b9bf2")
    public ReverseProcessExecution(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("02aedcb7-568e-4d9a-8e8b-96f75168cc71")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("797767e9-131e-4acc-9586-fc0c3a445ced")
    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
