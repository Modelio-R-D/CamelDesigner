package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.ContainerMeasurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("49bd8d73-e335-493e-bf0d-f85459ea9005")
public class ContainerMeasurementImporter<T extends ContainerMeasurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement> extends MeasurementImporter<T,V> {
    @objid ("89bf0759-a89f-4f59-b103-1f9e7f7a4bd3")
    public ContainerMeasurementImporter() {
        super();
    }

    @objid ("0c41a6e0-6f91-434b-9559-cdd306c055f9")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.create();
    }

    @objid ("35e0cec8-e4fc-4672-acd6-5e719eb66b54")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("6f4faf9d-dd44-4926-a2cb-1bf441d5aef8")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitContainerMeasurement(this);
    }

}
