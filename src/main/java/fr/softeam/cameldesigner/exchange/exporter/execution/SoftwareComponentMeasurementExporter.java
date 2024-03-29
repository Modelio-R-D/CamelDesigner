package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("62507eb3-7361-4e7c-885a-fc61f0d8e17a")
public class SoftwareComponentMeasurementExporter<T extends SoftwareComponentMeasurement> extends MeasurementExporter<T> {
    @objid ("b99584d2-8843-4084-8531-d4b6c41dc9cf")
    public SoftwareComponentMeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("23f62113-35f1-496f-b828-f262e0cebee1")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createSoftwareComponentMeasurement();
    }

    @objid ("3afca890-dff3-421c-8984-83941a6fcd34")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.SoftwareComponentMeasurement) {
            camel.execution.SoftwareComponentMeasurement measurement = (camel.execution.SoftwareComponentMeasurement) elt;
            setSoftwareComponentInstance(measurement);
            setSoftwareComponent(measurement);
        }
    }

    @objid ("66a87eb7-8579-4a44-9b79-a039feb860cb")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("5bdc455b-b534-4227-8345-4e9cfec01bbb")
    private void setSoftwareComponent(camel.execution.SoftwareComponentMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getSoftwareComponent());
        if ((comp != null) &&  (comp instanceof camel.deployment.SoftwareComponent))
            measurement.setSoftwareComponent((camel.deployment.SoftwareComponent) comp);
    }

    @objid ("20c32475-d62e-46f4-a9b7-419c8fc4e981")
    private void setSoftwareComponentInstance(camel.execution.SoftwareComponentMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getSoftwareComponentInstance());
        if ((comp != null) &&  (comp instanceof camel.deployment.SoftwareComponentInstance))
            measurement.setSoftwareComponentInstance((camel.deployment.SoftwareComponentInstance) comp);
    }

}
