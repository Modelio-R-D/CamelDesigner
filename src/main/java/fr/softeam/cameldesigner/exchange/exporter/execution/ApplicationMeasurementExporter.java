package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8c955b6a-2314-4314-831d-34e216e803b0")
public class ApplicationMeasurementExporter<T extends ApplicationMeasurement> extends MeasurementExporter<T> {
    @objid ("3a29af72-b202-40ec-b3b2-5f68ecaeaece")
    public ApplicationMeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("5e77dd11-83b3-4dfe-b48d-b8263b88a397")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createApplicationMeasurement();
    }

    @objid ("ff2a84ce-4ba4-41a6-b159-039d7439412e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("cebd4283-e256-4c85-a979-d32e440ab08b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
