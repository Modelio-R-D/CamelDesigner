package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ce0bca04-59e6-46ec-9317-2cbcbfb624a4")
public class HistoryRecordExporter<T extends HistoryRecord> extends FeatureClassExporter<T> {
    @objid ("609a7d0c-138b-404d-ae39-ca8818d9b206")
    public HistoryRecordExporter(T elt) {
        super(elt);
    }

    @objid ("9a33a7da-dc19-41c1-b678-5ec7aa73e5e1")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createHistoryRecord();
    }

    @objid ("ff03c54b-db2e-4fb0-b222-a18e723e2567")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("8d47492e-58b1-4db6-a131-506dc52e5b07")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
