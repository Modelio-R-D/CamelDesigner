package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.deployment.Component;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
            MeasurableAttribute referencedMeasurableAttribute = retrieveReferencedMeasurableAttribute(element.getAttribute());
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
            ValueType referencedValueType = retrieveReferencedValueType(element.getValueType());
            if(referencedValueType != null) {
                metricTemplateProxy.setValueType(referencedValueType);
            }
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
        Schedule scheduleProxy = Schedule.create();
        if(element.getTimeUnit() != null) {
            Unit referencedTimeUnit = retrieveReferencedTimeUnit(element.getTimeUnit());
            if(referencedTimeUnit != null) {
                scheduleProxy.setTimeUnit(referencedTimeUnit);
            }
        }
        return scheduleProxy;
    }

    private Window reverse(camel.metric.Window element) {
        Window windowProxy = Window.create();
        
        windowProxy.setMeasurementSize(Long.toString(element.getMeasurementSize()));
        
        if(element.getSizeType() != null) {
            windowProxy.setWindowType(element.getSizeType().toString());
        }
        
        windowProxy.setTimeSize(Long.toString(element.getTimeSize()));
        
        // TODO
        //        if(element.getTimeUnit() != null) {
        //            Unit referencedTimeUnit = retrieveReferencedTimeUnit(element.getTimeUnit());
        //            if(referencedTimeUnit != null) {
        //                windowProxy.setTimeUnit(referencedTimeUnit);
        //            }
        //        }
        
        if(element.getWindowType() != null) {
            windowProxy.setWindowType(element.getWindowType().toString());
        }
        return windowProxy;
    }

    private MetricVariable reverse(camel.metric.MetricVariable element) {
        MetricVariable metricVariable = MetricVariable.create();
        if(element.getFormula() != null) {
            metricVariable.setFormula(element.getFormula());
        }    
        
        if(element.getComponent() != null) {
            CamelComponent referencedComponent = retrieveReferencedComponent(element.getComponent());
            if(referencedComponent != null) {
                metricVariable.setComponent(referencedComponent);
            }
        }   
        
        metricVariable.setCurrentConfiguration(element.isCurrentConfiguration());
        return metricVariable;
    }

    private CompositeMetric reverse(camel.metric.CompositeMetric element) {
        CompositeMetric compositeMetricProxy = CompositeMetric.create();
        if(element.getMetricTemplate() != null) {
            MetricTemplate referencedMetricTemplate = retrieveReferencedMetricTemplate(element.getMetricTemplate());
            if(referencedMetricTemplate != null) {
                compositeMetricProxy.setMetricTemplate(referencedMetricTemplate);
            }
        }
        return compositeMetricProxy;
    }

    private RawMetric reverse(camel.metric.RawMetric element) {
        RawMetric rawMetricProxy = RawMetric.create();
        if(element.getMetricTemplate() != null) {
            MetricTemplate referencedMetricTemplate = retrieveReferencedMetricTemplate(element.getMetricTemplate());
            if(referencedMetricTemplate != null) {
                rawMetricProxy.setMetricTemplate(referencedMetricTemplate);
            }
        }
        return rawMetricProxy;
    }

    private ObjectContext reverse(camel.metric.ObjectContext element) {
        ObjectContext objectContext = ObjectContext.create();
        if(element.getComponent () != null) {
            CamelComponent referencedComponent = retrieveReferencedComponent (element.getComponent());
            if(referencedComponent != null) {
                objectContext.setComponent(referencedComponent);
            }
        }
        return objectContext;
    }

    private CompositeMetricContext reverse(camel.metric.CompositeMetricContext element) {
        CompositeMetricContext compositeMetricContextProxy = (CompositeMetricContext) reverseMetricContext(element);
        
        for(camel.metric.MetricContext metricContext : element.getComposingMetricContexts()) {
            MetricContext referencedMetricContext = retrievReferencedMetricContext(metricContext);
            if(referencedMetricContext != null) {
                compositeMetricContextProxy.addComposingMetricContexts(referencedMetricContext);
            }
        }
        return compositeMetricContextProxy;
    }

    private RawMetricContext reverse(camel.metric.RawMetricContext element) {
        RawMetricContext rawMetricContextProxy = (RawMetricContext) reverseMetricContext(element);
        
        if(element.getSensor() != null) {
            Sensor referencedSensor = retrieveReferencedSensor(element.getSensor());
            if(referencedSensor != null) {
                rawMetricContextProxy.setSensor(referencedSensor);
            }
        }
        return rawMetricContextProxy;
    }

    private MeasurableAttribute reverse(camel.core.MeasurableAttribute element) {
        fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute measurableAttributeProxy = fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.create();
        return measurableAttributeProxy;
    }

    private MeasurableAttribute retrieveReferencedMeasurableAttribute(camel.core.MeasurableAttribute measurableAttribute) {
        MeasurableAttribute referencedMeasurableAttribute = null;
        if(this.processedCamelElements.containsKey(measurableAttribute)) {
            referencedMeasurableAttribute = (MeasurableAttribute) this.processedCamelElements.get(measurableAttribute);
        } else {
            referencedMeasurableAttribute = (MeasurableAttribute) this.switchReverse(measurableAttribute);
            if(referencedMeasurableAttribute != null) {
                referencedMeasurableAttribute.getElement().setName(measurableAttribute.getName());
                this.processedCamelElements.put(measurableAttribute, referencedMeasurableAttribute);
            }
        }
        return referencedMeasurableAttribute;
    }

    private ValueType retrieveReferencedValueType(camel.type.ValueType valueType) {
        ValueType referencedValueType = null;
        if(this.processedCamelElements.containsKey(valueType)) {
            referencedValueType = (ValueType) this.processedCamelElements.get(valueType);
        } else {
            referencedValueType = (ValueType) (new ReverseProcessType(null, this.processedCamelElements)).switchReverse(valueType);
            if(referencedValueType != null) {
                referencedValueType.getElement().setName(valueType.getName());
                this.processedCamelElements.put(valueType, referencedValueType);
            }
        }
        return referencedValueType;
    }

    private Unit retrieveReferencedUnit(camel.unit.Unit unit) {
        Unit referencedUnit = null;
        if(this.processedCamelElements.containsKey(unit)) {
            referencedUnit = (Unit) this.processedCamelElements.get(unit);
        } else {
            referencedUnit = (Unit) (new ReverseProcessUnit(null, this.processedCamelElements)).switchReverse(unit);
            if(referencedUnit != null) {
                referencedUnit.getElement().setName(unit.getName());
                this.processedCamelElements.put(unit, referencedUnit);
            }
        }
        return referencedUnit;
    }

    private MetricTemplate retrieveReferencedMetricTemplate(camel.metric.MetricTemplate metricTemplate) {
        MetricTemplate referencedMetricTemplate = null;
        if(this.processedCamelElements.containsKey(metricTemplate)) {
            referencedMetricTemplate = (MetricTemplate) this.processedCamelElements.get(metricTemplate);
        } else if (metricTemplate.getName() != null){
            //TODO for now if metricTemplate.getName() != null tells us if the external references are working
            referencedMetricTemplate = (MetricTemplate) this.switchReverse(metricTemplate);
            if(referencedMetricTemplate != null) {
                referencedMetricTemplate.getElement().setName(metricTemplate.getName());
                this.processedCamelElements.put(metricTemplate, referencedMetricTemplate);
            }
        }
        return referencedMetricTemplate;
    }

    private Sensor retrieveReferencedSensor(camel.metric.Sensor sensor) {
        Sensor referencedSensor = null;
        if(this.processedCamelElements.containsKey(sensor)) {
            referencedSensor = (Sensor) this.processedCamelElements.get(sensor);
        } else {
            referencedSensor = (Sensor) this.switchReverse(sensor);
            if(referencedSensor != null) {
                referencedSensor.getElement().setName(sensor.getName());
                this.processedCamelElements.put(sensor, referencedSensor);
            }
        }
        return referencedSensor;
    }

    private Unit retrieveReferencedTimeUnit(camel.unit.Unit timeUnit) {
        Unit referencedTimeUnit = null;
        if(this.processedCamelElements.containsKey(timeUnit)) {
            referencedTimeUnit = (Unit) this.processedCamelElements.get(timeUnit);
        } else {
            referencedTimeUnit = (Unit) (new ReverseProcessUnit(null, this.processedCamelElements)).switchReverse(timeUnit);
            if(referencedTimeUnit != null) {
                referencedTimeUnit.getElement().setName(timeUnit.getName());
                this.processedCamelElements.put(timeUnit, referencedTimeUnit);
            }
        }
        return referencedTimeUnit;
    }

    private MetricContext retrievReferencedMetricContext(camel.metric.MetricContext metricContext) {
        MetricContext referencedMetricContext = null;
        if(this.processedCamelElements.containsKey(metricContext)) {
            referencedMetricContext = (MetricContext) this.processedCamelElements.get(metricContext);
        } else {
            referencedMetricContext = (MetricContext) this.switchReverse(metricContext);
            if(referencedMetricContext != null) {
                referencedMetricContext.getElement().setName(metricContext.getName());
                this.processedCamelElements.put(metricContext, referencedMetricContext);
            }
        }
        return referencedMetricContext;
    }

    private MetricContext reverseMetricContext(camel.metric.MetricContext element) {
        MetricContext metricContextProxy = null;
        
        if(element instanceof camel.metric.CompositeMetricContext) {
            metricContextProxy = CompositeMetricContext.create();
        } else if(element instanceof camel.metric.RawMetricContext) {
            metricContextProxy = RawMetricContext.create();
        }
        
        if(element.getMetric() != null) {
            Metric referencedMetric = retrieveReferencedMetric(element.getMetric());
            if(referencedMetric != null) {
                metricContextProxy.setMetric(referencedMetric);
            }
        }
        
        if(element.getWindow() != null) {
            Window referencedWindow = retrieveReferencedWindow(element.getWindow());
            if(referencedWindow != null) {
                metricContextProxy.setWindow(referencedWindow);
            }
        }
        
        if(element.getSchedule() != null) {
            Schedule referencedSchedule = retrieveReferencedSchedule(element.getSchedule());
            if(referencedSchedule != null) {
                metricContextProxy.setSchedule(referencedSchedule);
            }
        }
        
        if(element.getObjectContext() != null) {
            ObjectContext referencedObjectContext = retrieveReferencedObjectContext(element.getObjectContext());
            if(referencedObjectContext != null) {
                metricContextProxy.setObjectContext(referencedObjectContext);
            }
        }
        return metricContextProxy;
    }

    private ObjectContext retrieveReferencedObjectContext(camel.metric.ObjectContext objectContext) {
        ObjectContext referencedObjectContext = null;
        if(this.processedCamelElements.containsKey(objectContext)) {
            referencedObjectContext = (ObjectContext) this.processedCamelElements.get(objectContext);
        } else {
            referencedObjectContext = (ObjectContext) this.switchReverse(objectContext);
            if(referencedObjectContext != null) {
                referencedObjectContext.getElement().setName(objectContext.getName());
                this.processedCamelElements.put(objectContext, referencedObjectContext);
            }
        }
        return referencedObjectContext;
    }

    private Schedule retrieveReferencedSchedule(camel.metric.Schedule schedule) {
        Schedule referencedSchedule = null;
        if(this.processedCamelElements.containsKey(schedule)) {
            referencedSchedule = (Schedule) this.processedCamelElements.get(schedule);
        } else {
            referencedSchedule = (Schedule) this.switchReverse(schedule);
            if(referencedSchedule != null) {
                referencedSchedule.getElement().setName(schedule.getName());
                this.processedCamelElements.put(schedule, referencedSchedule);
            }
        }
        return referencedSchedule;
    }

    private Window retrieveReferencedWindow(camel.metric.Window window) {
        Window referencedWindow = null;
        if(this.processedCamelElements.containsKey(window)) {
            referencedWindow = (Window) this.processedCamelElements.get(window);
        } else {
            referencedWindow = (Window) this.switchReverse(window);
            if(referencedWindow != null) {
                referencedWindow.getElement().setName(window.getName());
                this.processedCamelElements.put(window, referencedWindow);
            }
        }
        return referencedWindow;
    }

    private Metric retrieveReferencedMetric(camel.metric.Metric metric) {
        Metric referencedMetric = null;
        if(this.processedCamelElements.containsKey(metric)) {
            referencedMetric = (Metric) this.processedCamelElements.get(metric);
        } else {
            referencedMetric = (Metric) this.switchReverse(metric);
            if(referencedMetric != null) {
                referencedMetric.getElement().setName(metric.getName());
                this.processedCamelElements.put(metric, referencedMetric);
            }
        }
        return referencedMetric;
    }

    private CamelComponent retrieveReferencedComponent(Component component) {
        CamelComponent referencedCamelComponent = null;
        if(this.processedCamelElements.containsKey(component)) {
            referencedCamelComponent = (CamelComponent) this.processedCamelElements.get(component);
        } else {
            referencedCamelComponent = (CamelComponent) (new ReverseProcessDeploymentType(null, this.processedCamelElements)).switchReverse(component);
            if(referencedCamelComponent != null) {
                referencedCamelComponent.getElement().setName(component.getName());
                this.processedCamelElements.put(component, referencedCamelComponent);
            }
        }
        return referencedCamelComponent;
    }


//    private String retrieveReferencedWindowType(camel.metric.WindowType windowType) {
//        WindowType referencedWindowType = null;
//        if(this.processedCamelElements.containsKey(windowType)) {
//            referencedWindowType = (WindowType) this.processedCamelElements.get(windowType);
//        } else {
//            referencedWindowType = (WindowType) this.switchReverse(windowType);
//            if(referencedWindowType != null) {
//                referencedWindowType.getElement().setName(windowType.getName());
//                this.processedCamelElements.put(windowType, referencedWindowType);
//            }
//        }
//        return referencedWindowType;
//    }
}
