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

    @objid ("48cab6c6-2035-48a4-8aef-03fb3aa9816f")
    private void setFromDataIM(camel.execution.HistoryRecord record) {
        CDOObject fromDIM  =  this._process.getElement(this._element.getFromDataInstanceModel());
        if ((fromDIM != null) &&  (fromDIM instanceof camel.data.DataInstanceModel))
            record.setFromDataInstanceModel((camel.data.DataInstanceModel) fromDIM);
    }

    @objid ("3cf3421c-446d-49cf-95e6-63bf814edf15")
    private void setFromDeployIM(camel.execution.HistoryRecord record) {
        CDOObject fromDIM  =  this._process.getElement(this._element.getFromDeploymentInstanceModel());
        if ((fromDIM != null) &&  (fromDIM instanceof camel.deployment.DeploymentInstanceModel))
            record.setFromDeploymentInstanceModel((camel.deployment.DeploymentInstanceModel) fromDIM);
    }

    @objid ("36027c10-83a7-439c-a05f-75f0bf5aa540")
    private void setToDataIM(camel.execution.HistoryRecord record) {
        CDOObject toDIM  =  this._process.getElement(this._element.getToDataInstanceModel());
        if ((toDIM != null) &&  (toDIM instanceof camel.data.DataInstanceModel))
            record.setToDataInstanceModel((camel.data.DataInstanceModel) toDIM);
    }

    @objid ("c183a70f-e084-443b-846f-5fab74588b4d")
    private void setToDeployIM(camel.execution.HistoryRecord record) {
        CDOObject toDIM  =  this._process.getElement(this._element.getToDeploymentInstanceModel());
        if ((toDIM != null) &&  (toDIM instanceof camel.deployment.DeploymentInstanceModel))
            record.setToDeploymentInstanceModel((camel.deployment.DeploymentInstanceModel) toDIM);
    }

    @objid ("c42ec304-ac59-4915-bec1-23ab273e5293")
    private void setEndTime(camel.execution.HistoryRecord record) {
        String content = this._element.getEndTime();
        if (content != null)
            record.setEndTime(Date.valueOf(content));
    }

    @objid ("8fea9af0-ae61-4d44-985e-dbefc76d18a4")
    private void setStartTime(camel.execution.HistoryRecord record) {
        String content = this._element.getStartTime();
        if (content != null)
            record.setStartTime(Date.valueOf(content));
    }

    @objid ("03a9736f-2ad0-4e16-a803-542f40a53d46")
    private void setCause(camel.execution.HistoryRecord record) {
        CDOObject cause =  this._process.getElement(this._element.getCause());
        if ((cause != null) &&  (cause instanceof camel.execution.Cause))
            record.setCause((camel.execution.Cause) cause);
    }

    @objid ("1d382cdf-92dd-4105-8cb4-62a59c42b19f")
    private void setType(camel.execution.HistoryRecord record) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.mms.MmsObject))
            record.setType((camel.mms.MmsObject) type);
    }

}
