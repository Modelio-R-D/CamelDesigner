package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.CommunicationMeasurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3c6cc95e-1f2b-4eb4-8d09-a20f78340758")
public class CommunicationMeasurementImporter<T extends CommunicationMeasurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement> extends MeasurementImporter<T,V> {
    @objid ("0a9e9486-7e31-4845-97d7-aded5e95b4f7")
    public CommunicationMeasurementImporter() {
        super();
    }

    @objid ("f2801525-2b99-45eb-b146-a96a824e5f40")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.create();
    }

    @objid ("159bcb46-ce61-47e9-bea1-b43836932e59")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("43319095-c0e0-4f58-a6eb-4000180d48f9")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCommunicationMeasurement(this);
    }

}
