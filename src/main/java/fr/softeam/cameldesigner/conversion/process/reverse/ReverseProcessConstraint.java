package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.class_.LogicalConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcessConstraint extends AbstractReverseProcess {
    public ReverseProcessConstraint(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if(element instanceof camel.constraint.MetricConstraint) {
            return reverse ((camel.constraint.MetricConstraint)element);
        } else if (element instanceof camel.constraint.MetricConstraint) {
            return reverse ((camel.constraint.LogicalConstraint)element);            
        }
        return null;
    }

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

    private CamelElement reverse(camel.constraint.MetricConstraint element) {
        // TODO Auto-generated method stub
        return null;
    }

}
