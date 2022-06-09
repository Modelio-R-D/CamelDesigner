package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;

@objid ("fbb40d5f-4d55-4ca5-8749-d9c38003bf08")
public class ReverseProcessConstraint extends AbstractReverseProcess {
    @objid ("871cccb1-747e-49e2-a3bf-0a6d1fd45004")
    public ReverseProcessConstraint(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @objid ("d1557ca4-c63d-496a-bb05-43db16442605")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if(element instanceof camel.constraint.MetricConstraint) {
            return reverse ((camel.constraint.MetricConstraint)element);
        } else if (element instanceof camel.constraint.MetricConstraint) {
            return reverse ((camel.constraint.LogicalConstraint)element);
        }
        return null;
    }

    @objid ("6ea8b43b-51ac-473d-835e-e54138907cb1")
    private CamelElement reverse(camel.constraint.LogicalConstraint element) {
        //        LogicalConstraint logicalConstraintProxy = LogicalConstraint.create();
        //        if(element.getMetricTemplate() != null) {
        //            MetricTemplate referencedMetricTemplate = retrieveReferencedMetricTemplate(element.getMetricTemplate());
        //            if(referencedMetricTemplate != null) {
        //                rawMetricProxy.setMetricTemplate(referencedMetricTemplate);
        //            }
        //        }
        //        return rawMetricProxy;
        return null;
    }

    @objid ("4413f172-50af-4c54-8cee-a0e935079e39")
    private CamelElement reverse(camel.constraint.MetricConstraint element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
