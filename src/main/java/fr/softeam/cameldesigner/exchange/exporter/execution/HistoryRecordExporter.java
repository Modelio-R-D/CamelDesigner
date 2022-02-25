package fr.softeam.cameldesigner.exchange.exporter.execution;

import java.sql.Date;
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
        if (elt instanceof camel.execution.HistoryRecord) {
            camel.execution.HistoryRecord record = (camel.execution.HistoryRecord) elt;
            setType(record);
            setCause(record);
            setStartTime(record);
            setEndTime(record);
            setFromDeployIM(record);
            setToDeployIM(record);
            setFromDataIM(record);
            setToDataIM(record);
        }
    }

    @objid ("8d47492e-58b1-4db6-a131-506dc52e5b07")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.execution.ExecutionModel) && (elt instanceof camel.execution.HistoryRecord)) {
            ((camel.execution.ExecutionModel) context).getHistoryRecords().add((camel.execution.HistoryRecord) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("9976feb8-3e03-4a92-b023-24f3eb1a8a97")
    private void setFromDataIM(camel.execution.HistoryRecord record) {
        CDOObject fromDIM  =  this._process.getElement(this._element.getFromDataInstanceModel());
        if ((fromDIM != null) &&  (fromDIM instanceof camel.data.DataInstanceModel))
            record.setFromDataInstanceModel((camel.data.DataInstanceModel) fromDIM);
    }

    @objid ("1c65ca66-5d38-4f18-8de1-ea37fb70e54c")
    private void setFromDeployIM(camel.execution.HistoryRecord record) {
        CDOObject fromDIM  =  this._process.getElement(this._element.getFromDeploymentInstanceModel());
        if ((fromDIM != null) &&  (fromDIM instanceof camel.deployment.DeploymentInstanceModel))
            record.setFromDeploymentInstanceModel((camel.deployment.DeploymentInstanceModel) fromDIM);
    }

    @objid ("34454404-04c9-444d-939c-6b3fb71d2a66")
    private void setToDataIM(camel.execution.HistoryRecord record) {
        CDOObject toDIM  =  this._process.getElement(this._element.getToDataInstanceModel());
        if ((toDIM != null) &&  (toDIM instanceof camel.data.DataInstanceModel))
            record.setToDataInstanceModel((camel.data.DataInstanceModel) toDIM);
    }

    @objid ("fe52500e-0def-4dc5-9f53-a017e087f37a")
    private void setToDeployIM(camel.execution.HistoryRecord record) {
        CDOObject toDIM  =  this._process.getElement(this._element.getToDeploymentInstanceModel());
        if ((toDIM != null) &&  (toDIM instanceof camel.deployment.DeploymentInstanceModel))
            record.setToDeploymentInstanceModel((camel.deployment.DeploymentInstanceModel) toDIM);
    }

    @objid ("0e17d170-df44-4205-a1d2-a8141512c52e")
    private void setEndTime(camel.execution.HistoryRecord record) {
        record.setEndTime(Date.valueOf(this._element.getEndTime()));
    }

    @objid ("ace90ce8-e565-40ab-8506-d51d1e973e6e")
    private void setStartTime(camel.execution.HistoryRecord record) {
        record.setStartTime(Date.valueOf(this._element.getStartTime()));
    }

    @objid ("a99b0d77-8e15-457a-80d7-7ac9e5048d6d")
    private void setCause(camel.execution.HistoryRecord record) {
        CDOObject cause =  this._process.getElement(this._element.getCause());
        if ((cause != null) &&  (cause instanceof camel.execution.Cause))
            record.setCause((camel.execution.Cause) cause);
    }

    @objid ("146354b6-b618-4412-b1a0-f8fa02251fca")
    private void setType(camel.execution.HistoryRecord record) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.mms.MmsObject))
            record.setType((camel.mms.MmsObject) type);
    }

}
