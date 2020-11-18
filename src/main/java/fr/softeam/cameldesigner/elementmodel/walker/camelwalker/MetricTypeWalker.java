package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.core.Attribute;
import camel.core.MeasurableAttribute;
import camel.metric.CompositeMetric;
import camel.metric.CompositeMetricContext;
import camel.metric.Metric;
import camel.metric.MetricContext;
import camel.metric.MetricTemplate;
import camel.metric.MetricTypeModel;
import camel.metric.MetricVariable;
import camel.metric.ObjectContext;
import camel.metric.RawMetric;
import camel.metric.RawMetricContext;
import camel.metric.Schedule;
import camel.metric.Window;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

public class MetricTypeWalker extends AbstractCamelWalker {
    public MetricTypeWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        if( processedElement instanceof MetricTypeModel) {
            MetricTypeModel metricTypeModel = (MetricTypeModel) processedElement;
            
            for (Attribute attribute: metricTypeModel.getAttributes()){
                if(attribute instanceof MeasurableAttribute) {
                    this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                    walk(attribute);
                }
            }
            
            for(MetricContext metricContext : metricTypeModel.getMetricContexts()) {
                if(metricContext instanceof RawMetricContext) {
                    this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                    walk(metricContext);
                } else if(metricContext instanceof CompositeMetricContext) {
                    this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                    walk(metricContext);
                }
            }
            
            for(ObjectContext objectContext : metricTypeModel.getObjectContexts()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(objectContext);
            }
            
            for(Metric metric : metricTypeModel.getMetrics()) {
                if(metric instanceof RawMetric) {
                    this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                    walk(metric);
                } else if (metric instanceof CompositeMetric) {
                    this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                    walk(metric);
                } else if (metric instanceof MetricVariable) {
                    this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                    walk(metric);
                }
            }
            
            for (Window window: metricTypeModel.getWindows()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(window);
            }     
            
            for (Schedule schedule: metricTypeModel.getSchedules()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(schedule);
            }            
            
            for (MetricTemplate template : metricTypeModel.getTemplates()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(template);
            }
        
        
        }
    }

}
