package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.deployment.Component;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
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

@objid ("5af83dce-bbf9-4b20-8040-9db6d6df2c37")
public class ReverseProcessMetricType extends AbstractReverseProcess {
    @objid ("3b24044d-defd-4e7b-85ee-9a5051367641")
    public ReverseProcessMetricType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("2a5139b6-e75c-4ac2-ac2f-c5e84d6eb073")
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

    @objid ("d3257439-0e37-4c2b-9831-ef142241579d")
    private MetricTemplate reverse(camel.metric.MetricTemplate element) {
        MetricTemplate metricTemplateProxy = MetricTemplate.create();
        
        if(element.getAttribute() != null) {
            MeasurableAttributeClass referencedMeasurableAttribute = retrieveReferencedMeasurableAttribute(element.getAttribute());
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

    @objid ("a880f094-4bd2-4acd-ba61-0b6365e9d7e0")
    private fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor reverse(camel.metric.Sensor element) {
        fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor sensorProxy = fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.create() ;                //sensorProxy
        sensorProxy.setIsPush(element.isIsPush());
        sensorProxy.setConfiguration(element.getConfiguration());
        return sensorProxy;
    }

    @objid ("84dc469e-d77f-45e6-8811-3e16dffdb86a")
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

    @objid ("7a61acd0-83aa-4430-a75d-1cec9d54303e")
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

    @objid ("b5e03e47-9caa-4868-a7f9-f8289655cc1d")
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

    @objid ("5176995d-7b89-4032-ae26-da0614ad7f47")
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

    @objid ("566d3746-db99-4732-818b-8c31e49ef8bc")
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

    @objid ("b3fd62be-2df5-4b0f-bf02-81d143797ac7")
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

    @objid ("f4c1de1f-ba14-4598-8c55-4c5706737ef2")
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

    @objid ("6ff3396c-db26-40a5-8699-fd3d1d22fe6a")
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

    @objid ("d991fbbf-929d-4345-b6bb-1d4f237e3fd1")
    private MeasurableAttributeClass reverse(camel.core.MeasurableAttribute element) {
        fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass measurableAttributeProxy = fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass.create();
        return measurableAttributeProxy;
    }

    @objid ("d728cbb0-fd09-4c5e-a24d-c97691c5903f")
    private MeasurableAttributeClass retrieveReferencedMeasurableAttribute(camel.core.MeasurableAttribute measurableAttribute) {
        MeasurableAttributeClass referencedMeasurableAttribute = null;
        if(this.processedCamelElements.containsKey(measurableAttribute)) {
            referencedMeasurableAttribute = (MeasurableAttributeClass) this.processedCamelElements.get(measurableAttribute);
        } else {
            referencedMeasurableAttribute = (MeasurableAttributeClass) this.switchReverse(measurableAttribute);
            if(referencedMeasurableAttribute != null) {
                referencedMeasurableAttribute.getElement().setName(measurableAttribute.getName());
                this.processedCamelElements.put(measurableAttribute, referencedMeasurableAttribute);
            }
        }
        return referencedMeasurableAttribute;
    }

    @objid ("afd9619a-1468-4839-8b4d-2f74e817d02f")
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

    @objid ("74da2406-f0e7-4d0d-afb5-ac85ed1f3a1e")
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

    @objid ("60d538f1-58df-4c10-a265-0bff00be03c1")
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

    @objid ("55110f75-0924-42a6-9d12-7ba0598b83f2")
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

    @objid ("76f2b532-2474-43cf-a9cb-76d93215cd80")
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

    @objid ("98e1b171-0405-47c2-b72d-7c0a91739fda")
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

    @objid ("3064203d-9925-416e-8faf-45fa5b97cd97")
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

    @objid ("bbb31a84-e14e-4b2a-a457-281ea5520665")
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

    @objid ("ece04568-88b0-4a74-99d2-a7fb1cc26b8e")
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

    @objid ("e67f82ac-2dc7-4e23-9ab9-8eaba20a15db")
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

    @objid ("3fdd136d-5bc4-4c2e-9067-001822d1d40b")
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

    @objid ("56543e0f-5046-403b-9e1a-07416893ff44")
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

    @objid ("6ce3d7f7-77c9-4067-ae94-ef02c19bfa09")
    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
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
