package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d08b4fbc-50e8-47b2-87b3-bdad872b9592")
public class DataMeasurementExporter<T extends DataMeasurement> extends MeasurementExporter<T> {
    @objid ("79e5f5f1-42af-4994-88fa-f0edc5cc4855")
    public DataMeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("b83c41cf-bdc7-439e-b1d1-8c8d65757ba1")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createDataMeasurement();
    }

    @objid ("a3ed2119-eec4-4878-bf7c-a268bd05206f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.DataMeasurement) {
            camel.execution.DataMeasurement measurement = (camel.execution.DataMeasurement) elt;
            setDataInstance(measurement);
            setData(measurement);
        }
    }

    @objid ("a06890c0-9c48-47fd-b8b9-e78704b1f3da")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("03dd87e1-11f7-4565-a5eb-f9d88f5c3fa8")
    private void setData(camel.execution.DataMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getData());
        if ((comp != null) &&  (comp instanceof camel.data.Data))
            measurement.setData((camel.data.Data) comp);
    }

    @objid ("b55d4f7a-7c20-4ece-90df-344e8b5f9446")
    private void setDataInstance(camel.execution.DataMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getDataInstance());
        if ((comp != null) &&  (comp instanceof camel.data.DataInstance))
            measurement.setDataInstance((camel.data.DataInstance) comp);
    }

}
