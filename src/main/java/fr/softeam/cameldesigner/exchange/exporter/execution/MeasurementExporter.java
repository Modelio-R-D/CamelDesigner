package fr.softeam.cameldesigner.exchange.exporter.execution;

import java.sql.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("86410a20-9920-403c-bbbb-412d8f50e716")
public abstract class MeasurementExporter<T extends Measurement> extends FeatureClassExporter<T> {
    @objid ("643a27db-08c1-4b9e-9205-4baccb6f519b")
    public MeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("84973d79-5754-4344-8c1c-58220e3f70e7")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("967567df-01f2-4bcf-b0c4-f6a4fee1c742")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.Measurement) {
            camel.execution.Measurement measurement = (camel.execution.Measurement) elt;
            setMetricInstance(measurement);
            setValue(measurement);
            setMeasurementTime(measurement);
            setEventInstance(measurement);
        }
    }

    @objid ("ee554493-e44e-41e7-a853-c96445836703")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.execution.ExecutionModel) && (elt instanceof camel.execution.Measurement)) {
            ((camel.execution.ExecutionModel) context).getMeasurements().add((camel.execution.Measurement) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("5e4f57ec-47d9-4ba4-b61d-8414c1e5caaf")
    private void setEventInstance(camel.execution.Measurement measurement) {
        CDOObject event =  this._process.getElement(this._element.getEventInstance());
        if ((event != null) &&  (event instanceof camel.scalability.EventInstance))
            measurement.setEventInstance((camel.scalability.EventInstance) event);
    }

    @objid ("4e798996-0aa4-4bf5-964c-e267c9729d3f")
    private void setMeasurementTime(camel.execution.Measurement measurement) {
        String content = this._element.getMeasurementTime();
        if (content != null)
            measurement.setMeasurementTime(Date.valueOf(content));
    }

    @objid ("0815571a-348c-4ba4-829c-658a4bb550fa")
    private void setValue(camel.execution.Measurement measurement) {
        String content = this._element.getValue();
        if (content != null)
            measurement.setValue(Double.valueOf(content));
    }

    @objid ("e29720f3-020c-4469-b5d5-e35d4d8365d5")
    private void setMetricInstance(camel.execution.Measurement measurement) {
        CDOObject mi =  this._process.getElement(this._element.getMetricInstance());
        if ((mi != null) &&  (mi instanceof camel.metric.MetricInstance))
            measurement.setMetricInstance((camel.metric.MetricInstance) mi);
    }

}
