package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.SoftwareComponentMeasurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("29ac404a-4825-45a4-8ed0-88eb5ec44ae2")
public class SoftwareComponentMeasurementImporter<T extends SoftwareComponentMeasurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement> extends MeasurementImporter<T,V> {
    @objid ("8b6f0513-e649-4044-9f1d-8129faaf7472")
    public SoftwareComponentMeasurementImporter() {
        super();
    }

    @objid ("5edf678c-e7e3-45f1-a891-83736a2a5400")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.create();
    }

    @objid ("1c954b9d-4ea5-46c8-aaf1-19535a66ae52")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("20d5c859-950f-4659-bf43-28899f63961d")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSoftwareComponentMeasurement(this);
    }

}
