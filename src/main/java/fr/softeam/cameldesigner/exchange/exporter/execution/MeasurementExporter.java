package fr.softeam.cameldesigner.exchange.exporter.execution;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("86410a20-9920-403c-bbbb-412d8f50e716")
public abstract class MeasurementExporter<T extends Measurement> extends FeatureClassExporter<T> {
    @objid ("643a27db-08c1-4b9e-9205-4baccb6f519b")
    public MeasurementExporter(T elt) {
        super(elt);
    }

    @objid ("84973d79-5754-4344-8c1c-58220e3f70e7")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("967567df-01f2-4bcf-b0c4-f6a4fee1c742")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("ee554493-e44e-41e7-a853-c96445836703")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
