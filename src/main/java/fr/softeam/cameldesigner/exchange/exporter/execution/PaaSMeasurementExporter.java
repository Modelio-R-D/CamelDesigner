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
    }

    @objid ("8df438c5-cbe7-4ef6-804f-a1d6f7798737")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
