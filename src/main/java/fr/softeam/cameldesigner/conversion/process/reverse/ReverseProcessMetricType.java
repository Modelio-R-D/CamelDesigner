package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.metric.WindowSizeType;
import camel.metric.WindowType;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcessMetricType extends AbstractReverseProcess {
    public ReverseProcessMetricType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if(element instanceof camel.core.MeasurableAttribute) {
            return reverse ((camel.core.MeasurableAttribute)element);
        } else if (element instanceof camel.metric.RawMetricContext) {
            return reverse ((camel.metric.RawMetricContext)element);            
        } else if (element instanceof camel.metric.CompositeMetricContext) {
            return reverse ((camel.metric.CompositeMetricContext)element);            
        } else if (element instanceof camel.metric.ObjectContext) {
            return reverse ((camel.metric.ObjectContext)element);            
        } else if (element instanceof camel.metric.RawMetric) {
            return reverse ((camel.metric.RawMetric)element);            
        } else if (element instanceof camel.metric.CompositeMetric) {
            return reverse ((camel.metric.CompositeMetric)element);            
        } else if (element instanceof camel.metric.MetricVariable) {
            return reverse ((camel.metric.MetricVariable)element);            
        } else if (element instanceof camel.metric.Window) {
            return reverse ((camel.metric.Window)element);            
        } else if (element instanceof camel.metric.Schedule) {
            return reverse ((camel.metric.Schedule)element);            
        } else if (element instanceof camel.metric.Sensor) {
            return reverse ((camel.metric.Sensor)element);            
        } else if (element instanceof camel.metric.MetricTemplate) {
            return reverse ((camel.metric.MetricTemplate)element);            
        }
        return null;
    }

    private MetricTemplate reverse(camel.metric.MetricTemplate element) {
        MetricTemplate metricTemplateProxy = MetricTemplate.create();
        
        if(element.getAttribute() != null) {
            MeasurableAttribute referencedMeasurableAttribute = retrievReferencedMeasurableAttribute(element.getAttribute());
            if(referencedMeasurableAttribute != null) {
                metricTemplateProxy.setAttribute(referencedMeasurableAttribute);
            }
        }
        
        if(element.getUnit() != null) {
            Unit referencedUnit = retrieveReferencedUnit(element.getUnit());
            if(referencedUnit != null) {
                metricTemplateProxy.setUnit(referencedUnit);
            }
        }
        
        if(element.getValueType() != null) {
            // TODO
            //ValueType referencedValueType = retrievReferencedValueType(element.getUnit());
        //            if(referencedValueType != null) {
        //                metricTemplateProxy.set(referencedValueType);
        //            }
        }
        metricTemplateProxy.setValueDirection(Short.toString(element.getValueDirection()));
        return metricTemplateProxy;
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor reverse(camel.metric.Sensor element) {
        fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor sensorProxy = fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.create() ;                //sensorProxy
        sensorProxy.setIsPush(Boolean.toString(element.isIsPush()));
        sensorProxy.setConfiguration(element.getConfiguration());
        return sensorProxy;
    }

    private Schedule reverse(camel.metric.Schedule element) {
        return Schedule.create();
    }

    private Window reverse(camel.metric.Window element) {
        Window windowProxy = Window.create();
        
        windowProxy.setMeasurementSize(Long.toString(element.getMeasurementSize()));
        
        if(element.getSizeType() != null) {
            windowProxy.setWindowType(element.getSizeType().toString());
        }
        
        windowProxy.setTimeSize(Long.toString(element.getTimeSize()));
        
        
        if(element.getTimeUnit() != null) {
            // TODO
        }
        
        if(element.getWindowType() != null) {
            windowProxy.setWindowType(element.getWindowType().toString());
        }
        return windowProxy;
    }

    private MetricVariable reverse(camel.metric.MetricVariable element) {
        return MetricVariable.create();
    }

    private CompositeMetric reverse(camel.metric.CompositeMetric element) {
        return CompositeMetric.create();
    }

    private RawMetric reverse(camel.metric.RawMetric element) {
        // TODO add dependencies
        return RawMetric.create();
    }

    private ObjectContext reverse(camel.metric.ObjectContext element) {
        return ObjectContext.create();
    }

    private CompositeMetricContext reverse(camel.metric.CompositeMetricContext element) {
        // TODO add dependencies
        return CompositeMetricContext.create();
    }

    private RawMetricContext reverse(camel.metric.RawMetricContext element) {
        return RawMetricContext.create();
    }

    private MeasurableAttribute reverse(camel.core.MeasurableAttribute element) {
        fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute measurableAttributeProxy = fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.create();
        return measurableAttributeProxy;
    }

    private MeasurableAttribute retrievReferencedMeasurableAttribute(camel.core.MeasurableAttribute measurableAttribute) {
        MeasurableAttribute referencedMeasurableAttribute = null;
        if(this.processedCamelElements.containsKey(measurableAttribute)) {
            referencedMeasurableAttribute = (MeasurableAttribute) this.processedCamelElements.get(measurableAttribute);
        } else {
            referencedMeasurableAttribute = (MeasurableAttribute) this.switchReverse(measurableAttribute);
            referencedMeasurableAttribute.getElement().setName(measurableAttribute.getName());
            this.processedCamelElements.put(measurableAttribute, referencedMeasurableAttribute);
        }
        return referencedMeasurableAttribute;
    }

    private ValueType retrieveReferencedValueType(camel.unit.Unit unit) {
        // TODO Auto-generated method stub
        return null;
    }

    private Unit retrieveReferencedUnit(camel.unit.Unit unit) {
        // TODO Auto-generated method stub
        return null;
    }


//    private String retrieveWindowType(WindowType windowType) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    private String retrieveSizeType(WindowSizeType sizeType) {
//        // TODO Auto-generated method stub
//        return null;
//    }
}
