package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;

public class GenerateProcessMetricType extends AbstractGenerateProcess {
    public GenerateProcessMetricType(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
    }

    @Override
    protected CDOObject switchGenerate(ModelElement element) {
        if (element instanceof Class) {
            Class umlClass = (Class) element;
            if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttribute.STEREOTYPE_NAME)) {
                return generate((MeasurableAttribute.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME)) {
                return generate((RawMetricContext.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetricContext.STEREOTYPE_NAME)) {
                return generate((CompositeMetricContext.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME)) {
                return generate((ObjectContext.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetric.STEREOTYPE_NAME)) {
                return generate((RawMetric.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME)) {
                return generate((CompositeMetric.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME)) {
                return generate((MetricVariable.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Window.STEREOTYPE_NAME)) {
                return generate((Window.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME)) {
                return generate((Schedule.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTemplate.STEREOTYPE_NAME)) {
                return generate((MetricTemplate.instantiate(umlClass)));
            }
        } else if (element instanceof Component) {
            Component umlComponent = (Component) element;
            if(umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME)) {
                return generate((Sensor.instantiate(umlComponent)));
            }
        }
        return null;
    }

    private CDOObject generate(Sensor sensorProxy) {
        camel.metric.Sensor sensor = camel.metric.MetricFactory.eINSTANCE.createSensor();
        sensor.setName(sensorProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getSensors().add(sensor);
        }
        return sensor;
    }

    private CDOObject generate(MetricTemplate metricTemplateProxy) {
        camel.metric.MetricTemplate metricTemplate = camel.metric.MetricFactory.eINSTANCE.createMetricTemplate();
        metricTemplate.setName(metricTemplateProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getTemplates().add(metricTemplate);
        }
        return metricTemplate;
    }

    private CDOObject generate(Schedule scheduleProxy) {
        camel.metric.Schedule schedule = camel.metric.MetricFactory.eINSTANCE.createSchedule();
        schedule.setName(scheduleProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getSchedules().add(schedule);
        }
        return schedule;
    }

    private CDOObject generate(Window windowProxy) {
        camel.metric.Window window = camel.metric.MetricFactory.eINSTANCE.createWindow();
        window.setName(windowProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getWindows().add(window);
        }
        return window;
    }

    private CDOObject generate(MetricVariable metricVariableProxy) {
        camel.metric.MetricVariable metricVariable = camel.metric.MetricFactory.eINSTANCE.createMetricVariable();
        metricVariable.setName(metricVariableProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add(metricVariable);
        }
        return metricVariable;
    }

    private CDOObject generate(CompositeMetric compositeMetricProxy) {
        camel.metric.CompositeMetric compositeMetric = camel.metric.MetricFactory.eINSTANCE.createCompositeMetric();
        compositeMetric.setName(compositeMetricProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add(compositeMetric);
        }
        return compositeMetric;
    }

    private CDOObject generate(RawMetric rawMetricProxy) {
        camel.metric.RawMetric rawMetric = camel.metric.MetricFactory.eINSTANCE.createRawMetric();
        rawMetric.setName(rawMetricProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add(rawMetric);
        }
        return rawMetric;
    }

    private CDOObject generate(ObjectContext objectContextProxy) {
        camel.metric.ObjectContext objectContext = camel.metric.MetricFactory.eINSTANCE.createObjectContext();
        objectContext.setName(objectContextProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getObjectContexts().add(objectContext);
        }
        return objectContext;
    }

    private CDOObject generate(CompositeMetricContext compositeMetricContextProxy) {
        camel.metric.CompositeMetricContext compositeMetricContext = camel.metric.MetricFactory.eINSTANCE.createCompositeMetricContext();
        compositeMetricContext.setName(compositeMetricContextProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetricContexts().add(compositeMetricContext);
        }
        return compositeMetricContext;
    }

    private CDOObject generate(RawMetricContext rawMetricContextProxy) {
        camel.metric.RawMetricContext rawMetricContext = camel.metric.MetricFactory.eINSTANCE.createRawMetricContext();
        rawMetricContext.setName(rawMetricContextProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetricContexts().add(rawMetricContext);
        }
        return rawMetricContext;
    }

    private CDOObject generate(MeasurableAttribute measurableAttributeProxy) {
        camel.core.MeasurableAttribute measurableAttribute = camel.core.CoreFactory.eINSTANCE.createMeasurableAttribute();
        measurableAttribute.setName(measurableAttributeProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getAttributes().add(measurableAttribute);
        }
        return measurableAttribute;
    }

    @Override
    protected void updateParent(CDOObject processedElement) {
        if(this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            if(processedElement instanceof camel.core.MeasurableAttribute) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getAttributes().add((camel.core.MeasurableAttribute)processedElement);
            } else if (processedElement instanceof camel.metric.RawMetricContext) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetricContexts().add((camel.metric.RawMetricContext)processedElement);
            } else if (processedElement instanceof camel.metric.CompositeMetricContext) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetricContexts().add((camel.metric.CompositeMetricContext)processedElement);
            } else if (processedElement instanceof camel.metric.ObjectContext) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getObjectContexts().add((camel.metric.ObjectContext)processedElement);
            } else if (processedElement instanceof camel.metric.RawMetric) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add((camel.metric.RawMetric)processedElement);
            } else if (processedElement instanceof camel.metric.CompositeMetric) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add((camel.metric.CompositeMetric)processedElement);
            } else if (processedElement instanceof camel.metric.MetricVariable) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add((camel.metric.MetricVariable)processedElement);
            } else if (processedElement instanceof camel.metric.Window) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getWindows().add((camel.metric.Window)processedElement);
            } else if (processedElement instanceof camel.metric.Schedule) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getSchedules().add((camel.metric.Schedule)processedElement);
            } else if (processedElement instanceof camel.metric.MetricTemplate) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getTemplates().add((camel.metric.MetricTemplate)processedElement);
            } else if (processedElement instanceof camel.metric.Sensor) {
                ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getSensors().add((camel.metric.Sensor)processedElement);
            }
        }
    }

}
