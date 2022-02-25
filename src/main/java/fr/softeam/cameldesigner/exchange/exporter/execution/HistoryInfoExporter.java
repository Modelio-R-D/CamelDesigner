package fr.softeam.cameldesigner.exchange.exporter.execution;

import java.sql.Date;
import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a13e6c2f-87b7-4f14-b84e-11af65e152aa")
public class HistoryInfoExporter<T extends HistoryInfo> extends FeatureClassExporter<T> {
    @objid ("956e8dcc-09c8-4ae7-9164-216cd50e35f5")
    public HistoryInfoExporter(T elt) {
        super(elt);
    }

    @objid ("78605a5b-ea8d-4ec0-b89c-a9293910ae0e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createHistoryInfo();
    }

    @objid ("57d1ff73-0550-4f33-bc48-036c652595a6")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.HistoryInfo) {
            camel.execution.HistoryInfo info = (camel.execution.HistoryInfo) elt;
            setSubject(info);
            setAction(info);
            setObject(info);
        //            setObjectRef(info);
            setStartTime(info);
            setEndTime(info);
        }
    }

    @objid ("6d701344-9321-49ba-b127-9510288dd837")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("09c8cbee-adc7-43af-b80a-4900bb4c564f")
    private void setEndTime(camel.execution.HistoryInfo info) {
        info.setEndTime(Date.valueOf(this._element.getEndTime()));
    }

    @objid ("df04741a-89ea-4fe9-9f55-ba8b10404a7e")
    private void setStartTime(camel.execution.HistoryInfo info) {
        info.setStartTime(Date.valueOf(this._element.getStartTime()));
    }

    @objid ("723baef3-ac89-4c90-9369-e3d77c8cc4fa")
    private void setObject(camel.execution.HistoryInfo info) {
        info.setObject(this._element.getObject());
    }

    @objid ("009cca51-9902-48e3-b5c4-49d1e5a576d2")
    private void setAction(camel.execution.HistoryInfo info) {
        CDOObject action  =  this._process.getElement(this._element.getAction());
        if ((action != null) &&  (action instanceof camel.mms.MmsObject))
            info.setAction((camel.mms.MmsObject) action);
    }

    @objid ("3bf16745-c6c3-41c1-997f-5d88b10ddbab")
    private void setSubject(camel.execution.HistoryInfo info) {
        CDOObject subject  =  this._process.getElement(this._element.getSubject());
        if ((subject != null) &&  (subject instanceof camel.mms.MmsObject))
            info.setSubject((camel.mms.MmsObject) subject);
    }

}
