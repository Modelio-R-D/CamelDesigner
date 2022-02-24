package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1518ffa5-5b81-4490-a6fc-6d05581bcbdf")
public class PaaSMeasurementExporter<T extends PaaSMeasurement> extends MeasurementExporter<T> {
    @objid ("8f301d30-6638-4c1a-bf98-5e14d326ada7")
    public PaaSMeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("3467b9f1-9191-4487-94ca-eccbe267f700")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createPaaSMeasurement();
    }

    @objid ("bd4d8813-27fd-4c09-8b61-2646a94331e8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.PaaSMeasurement) {
            camel.execution.PaaSMeasurement measurement = (camel.execution.PaaSMeasurement) elt;
            setPaaSInstance(measurement);
            setPaaS(measurement);
        }
    }

    @objid ("8df438c5-cbe7-4ef6-804f-a1d6f7798737")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("dfd5dc80-f50c-40cd-82dd-8ffaf0794da3")
    private void setPaaS(camel.execution.PaaSMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getPaaS());
        if ((comp != null) &&  (comp instanceof camel.deployment.PaaS))
            measurement.setPaas((camel.deployment.PaaS) comp);
    }

    @objid ("12e7e136-cbe2-4cf3-9def-4e7f1bb8440e")
    private void setPaaSInstance(camel.execution.PaaSMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getPaaSInstance());
        if ((comp != null) &&  (comp instanceof camel.deployment.PaaSInstance))
            measurement.setPaasInstance((camel.deployment.PaaSInstance) comp);
    }

}
