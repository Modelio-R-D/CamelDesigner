package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d2fcefae-5a4f-4a83-bb98-21d6d3e1830c")
public class ContainerMeasurementExporter<T extends ContainerMeasurement> extends MeasurementExporter<T> {
    @objid ("1655bc49-2846-471c-b969-15a137e4479f")
    public ContainerMeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("4c829ef3-0ca3-4795-a97d-b5bee8b5f1b4")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createContainerMeasurement();
    }

    @objid ("075bc890-45d7-4d0a-bfa8-11b50ac444d1")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("d0f925a6-caf7-400a-9727-ca7166fa8232")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
