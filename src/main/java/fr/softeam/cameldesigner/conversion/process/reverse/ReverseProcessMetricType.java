package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.core.MeasurableAttribute;
import camel.metric.CompositeMetric;
import camel.metric.CompositeMetricContext;
import camel.metric.MetricTemplate;
import camel.metric.MetricVariable;
import camel.metric.ObjectContext;
import camel.metric.RawMetric;
import camel.metric.RawMetricContext;
import camel.metric.Schedule;
import camel.metric.Sensor;
import camel.metric.Window;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcessMetricType extends AbstractReverseProcess {
    public ReverseProcessMetricType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if(element instanceof MeasurableAttribute) {
            return reverse ((MeasurableAttribute)element);
        } else if (element instanceof RawMetricContext) {
            return reverse ((RawMetricContext)element);            
        } else if (element instanceof CompositeMetricContext) {
            return reverse ((CompositeMetricContext)element);            
        } else if (element instanceof ObjectContext) {
            return reverse ((ObjectContext)element);            
        } else if (element instanceof RawMetric) {
            return reverse ((RawMetric)element);            
        } else if (element instanceof CompositeMetric) {
            return reverse ((CompositeMetric)element);            
        } else if (element instanceof MetricVariable) {
            return reverse ((MetricVariable)element);            
        } else if (element instanceof Window) {
            return reverse ((Window)element);            
        } else if (element instanceof Schedule) {
            return reverse ((Schedule)element);            
        } else if (element instanceof Sensor) {
            return reverse ((Sensor)element);            
        } else if (element instanceof MetricTemplate) {
            return reverse ((MetricTemplate)element);            
        }
        return null;
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate reverse(MetricTemplate element) {
        fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate metricTemplateProxy = fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.create();
        
        if(element.getAttribute() != null) {
            MeasurableAttribute referencedMeasurableAttribute = retrievReferencedMeasurableAttribute(element.getAttribute());
            if(referencedMeasurableAttribute != null) {
                // TODO
            }
        }
        
        if(element.getUnit() != null) {
            // TODO
        }
        
        if(element.getValueType() != null) {
            // TODO
        }
        metricTemplateProxy.setValueDirection(Short.toString(element.getValueDirection()));
        return metricTemplateProxy;
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor reverse(Sensor element) {
        fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor sensorProxy = fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.create() ;                //sensorProxy
        sensorProxy.setIsPush(Boolean.toString(element.isIsPush()));
        sensorProxy.setConfiguration(element.getConfiguration());
        return sensorProxy;
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule reverse(Schedule element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window reverse(Window element) {
        fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window windowProxy = fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.create();
        
        windowProxy.setMeasurementSize(Long.toString(element.getMeasurementSize()));
        
        if(element.getSizeType() != null) {
            // TODO
        }
        
        windowProxy.setTimeSize(Long.toString(element.getTimeSize()));
        
        
        if(element.getTimeUnit() != null) {
            // TODO
        }
        
        if(element.getWindowType() != null) {
            // TODO
        }
        return windowProxy;
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable reverse(MetricVariable element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric reverse(CompositeMetric element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric reverse(RawMetric element) {
        // TODO add dependencies
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext reverse(ObjectContext element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext reverse(CompositeMetricContext element) {
        // TODO add dependencies
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext reverse(RawMetricContext element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.create();
    }

    private fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute reverse(MeasurableAttribute element) {
        fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute measurableAttributeProxy = fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.create();
        return measurableAttributeProxy;
    }

    private MeasurableAttribute retrievReferencedMeasurableAttribute(MeasurableAttribute attribute) {
        // TODO Auto-generated method stub
        return null;
    }

}
