package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("238a597b-76ba-459b-8892-1e37d9b07255")
public class VMMeasurementExporter<T extends VMMeasurement> extends FeatureClassExporter<T> {
    @objid ("0e2d6f96-3870-4025-af86-ac2c21177648")
    public VMMeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("71898bf3-f1b4-4b6c-bc73-44e168b1f395")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createVMMeasurement();
    }

    @objid ("79807018-fcc1-4940-b5df-3a8ef048a980")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("98349203-5015-4af2-802a-d15bcec6f2c9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
