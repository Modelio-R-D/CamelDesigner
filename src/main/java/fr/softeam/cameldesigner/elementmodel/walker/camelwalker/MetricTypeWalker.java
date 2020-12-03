package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

public class MetricTypeWalker extends AbstractCamelWalker {
    public MetricTypeWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        if( processedElement instanceof camel.metric.MetricTypeModel) {
            camel.metric.MetricTypeModel metricTypeModel = (camel.metric.MetricTypeModel) processedElement;
        
            for (camel.core.Attribute attribute: metricTypeModel.getAttributes()){
                if(attribute instanceof camel.core.MeasurableAttribute) {
                    this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                    walk(attribute);
                }
            }
        
            for(camel.metric.Sensor sensor : metricTypeModel.getSensors()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(sensor);
            }
        
            for (camel.metric.MetricTemplate template : metricTypeModel.getTemplates()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(template);
            }
        
            for(camel.metric.Metric metric : metricTypeModel.getMetrics()) {
                // this includes raw metrics, composite metric, and metric variables
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(metric);
            }
        
            for (camel.metric.Window window: metricTypeModel.getWindows()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(window);
            }  
            
            for (camel.metric.Schedule schedule: metricTypeModel.getSchedules()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(schedule);
            }    
            
            for(camel.metric.ObjectContext objectContext : metricTypeModel.getObjectContexts()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(objectContext);
            }
            
            for(camel.metric.MetricContext metricContext : metricTypeModel.getMetricContexts()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(metricContext);
            }
        
        }
    }

}
