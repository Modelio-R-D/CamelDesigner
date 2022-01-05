package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("050470e3-1435-4d0b-80bf-b6c56559d489")
public class CommunicationMeasurementExporter<T extends CommunicationMeasurement> extends FeatureClassExporter<T> {
    @objid ("3715052d-38b3-4b2a-8872-70ecb96b22b8")
    public CommunicationMeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("1a837042-19d9-4806-adca-b3e3021754ea")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createCommunicationMeasurement();
    }

    @objid ("49d59873-3d43-4605-9d39-0faca70662ab")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a670819d-ac64-4141-954a-1a39fdfb6cfa")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
