package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.VMMeasurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a9fc53c6-c0d6-4c27-88a1-60600bc1f824")
public class VMMeasurementImporter<T extends VMMeasurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement> extends MeasurementImporter<T,V> {
    @objid ("79c3d983-a98c-4224-8d6d-70bad460d2ed")
    public VMMeasurementImporter() {
        super();
    }

    @objid ("6bb21310-18f6-400d-9030-fbc23434005e")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.create();
    }

    @objid ("9fec12b0-14f3-4b24-a32a-c61da2846127")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("3cf78693-9a23-4ba0-b9ad-2f17f1c0eb8a")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitVMMeasurement(this);
    }

}
