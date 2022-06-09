package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;

@objid ("27332343-97bf-4eab-bfd9-1aa70ed71f69")
public class ReverseProcessSecurity extends AbstractReverseProcess {
    @objid ("8861ec49-a84b-4c7e-a493-f0fd029bfa09")
    public ReverseProcessSecurity(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("7dafe1d7-cbc8-4d4e-a80b-32c58b36f832")
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
