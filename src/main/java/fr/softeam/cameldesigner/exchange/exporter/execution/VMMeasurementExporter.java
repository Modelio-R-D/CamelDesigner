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
        if (elt instanceof camel.execution.VMMeasurement) {
            camel.execution.VMMeasurement measurement = (camel.execution.VMMeasurement) elt;
            setVMInstance(measurement);
            setVM(measurement);
        }
    }

    @objid ("98349203-5015-4af2-802a-d15bcec6f2c9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("02842435-7ef4-40ff-9c36-384036601f26")
    private void setVM(camel.execution.VMMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getVm());
        if ((comp != null) &&  (comp instanceof camel.deployment.VM))
            measurement.setVm((camel.deployment.VM) comp);
    }

    @objid ("eacc5f8c-fb82-49fb-b2b6-88460bbdd0f5")
    private void setVMInstance(camel.execution.VMMeasurement measurement) {
        CDOObject comp =  this._process.getElement(this._element.getVmInstance());
        if ((comp != null) &&  (comp instanceof camel.deployment.VMInstance))
            measurement.setVmInstance((camel.deployment.VMInstance) comp);
    }

}
