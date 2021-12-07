package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("18f4e824-7fcc-45ea-9e4c-bf54f2347d71")
public class GenerateProcessMetricType extends AbstractGenerateProcess {
    @objid ("cb5a5618-865b-4c02-8cb4-ed59f157dbb3")
    public GenerateProcessMetricType(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
    }

    @objid ("b9b24abe-8554-4f8f-bf83-e19870850512")
    @Override
    protected CDOObject switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement camelElement) {
        ModelElement element = camelElement.getElement();
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

    @objid ("cf5519be-c26a-43ac-b7b3-e1102c17b639")
    private CDOObject generate(Sensor sensorProxy) {
        camel.metric.Sensor sensor = camel.metric.MetricFactory.eINSTANCE.createSensor();
        sensor.setName(sensorProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getSensors().add(sensor);
        }
        return sensor;
    }

    @objid ("efcba9b3-a897-4d00-bba0-3caac2579512")
    private CDOObject generate(MetricTemplate metricTemplateProxy) {
        camel.metric.MetricTemplate metricTemplate = camel.metric.MetricFactory.eINSTANCE.createMetricTemplate();
        metricTemplate.setName(metricTemplateProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getTemplates().add(metricTemplate);
        }
        return metricTemplate;
    }

    @objid ("8654d271-ba89-4f4c-846f-dbd84bb37b14")
    private CDOObject generate(Schedule scheduleProxy) {
        camel.metric.Schedule schedule = camel.metric.MetricFactory.eINSTANCE.createSchedule();
        schedule.setName(scheduleProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getSchedules().add(schedule);
        }
        return schedule;
    }

    @objid ("8aac1a08-340d-4a9f-8605-2e91d54eee2c")
    private CDOObject generate(Window windowProxy) {
        camel.metric.Window window = camel.metric.MetricFactory.eINSTANCE.createWindow();
        window.setName(windowProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getWindows().add(window);
        }
        return window;
    }

    @objid ("557453b2-d331-4b85-b3ca-47749ba156b0")
    private CDOObject generate(MetricVariable metricVariableProxy) {
        camel.metric.MetricVariable metricVariable = camel.metric.MetricFactory.eINSTANCE.createMetricVariable();
        metricVariable.setName(metricVariableProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add(metricVariable);
        }
        return metricVariable;
    }

    @objid ("d0d7fee7-dfee-4c15-9bea-64f7e78bea1f")
    private CDOObject generate(CompositeMetric compositeMetricProxy) {
        camel.metric.CompositeMetric compositeMetric = camel.metric.MetricFactory.eINSTANCE.createCompositeMetric();
        compositeMetric.setName(compositeMetricProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add(compositeMetric);
        }
        return compositeMetric;
    }

    @objid ("bd7c2be0-e507-4626-8802-f9efbf46ca14")
    private CDOObject generate(RawMetric rawMetricProxy) {
        camel.metric.RawMetric rawMetric = camel.metric.MetricFactory.eINSTANCE.createRawMetric();
        rawMetric.setName(rawMetricProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetrics().add(rawMetric);
        }
        return rawMetric;
    }

    @objid ("9813bbf9-ceda-4622-8167-53958f35319b")
    private CDOObject generate(ObjectContext objectContextProxy) {
        camel.metric.ObjectContext objectContext = camel.metric.MetricFactory.eINSTANCE.createObjectContext();
        objectContext.setName(objectContextProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getObjectContexts().add(objectContext);
        }
        return objectContext;
    }

    @objid ("8c58b51a-2597-4721-b211-1d546b9358a1")
    private CDOObject generate(CompositeMetricContext compositeMetricContextProxy) {
        camel.metric.CompositeMetricContext compositeMetricContext = camel.metric.MetricFactory.eINSTANCE.createCompositeMetricContext();
        compositeMetricContext.setName(compositeMetricContextProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetricContexts().add(compositeMetricContext);
        }
        return compositeMetricContext;
    }

    @objid ("83eca2dd-0653-472f-8470-f46cbb167272")
    private CDOObject generate(RawMetricContext rawMetricContextProxy) {
        camel.metric.RawMetricContext rawMetricContext = camel.metric.MetricFactory.eINSTANCE.createRawMetricContext();
        rawMetricContext.setName(rawMetricContextProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getMetricContexts().add(rawMetricContext);
        }
        return rawMetricContext;
    }

    @objid ("504dd19f-e173-427c-9f05-4c6ef7b4fadb")
    private CDOObject generate(MeasurableAttribute measurableAttributeProxy) {
        camel.core.MeasurableAttribute measurableAttribute = camel.core.CoreFactory.eINSTANCE.createMeasurableAttribute();
        measurableAttribute.setName(measurableAttributeProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.metric.MetricTypeModel) {
            ((camel.metric.MetricTypeModel)this.getCamelElementParent()).getAttributes().add(measurableAttribute);
        }
        return measurableAttribute;
    }

    @objid ("d94953d4-1ec9-415d-a7d0-4b8efb321c33")
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
