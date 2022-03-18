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

    @objid ("a35d6eab-a8e1-49ff-b14e-87c45dedda40")
    private void setEndTime(camel.execution.HistoryInfo info) {
        String content = this._element.getEndTime();
        if (content != null)
            info.setEndTime(Date.valueOf(content));
    }

    @objid ("a8ae5e64-8e7d-4f96-801c-956bd647fd10")
    private void setStartTime(camel.execution.HistoryInfo info) {
        String content = this._element.getStartTime();
        if (content != null)
            info.setStartTime(Date.valueOf(content));
    }

    @objid ("3913bba6-1f50-4230-bda0-d2bf0dc6d12b")
    private void setObject(camel.execution.HistoryInfo info) {
        String content = this._element.getObject();
        if (content != null)
            info.setObject(content);
    }

    @objid ("a65f0a81-155c-4177-96b1-0e771b2090c3")
    private void setAction(camel.execution.HistoryInfo info) {
        CDOObject action  =  this._process.getElement(this._element.getAction());
        if ((action != null) &&  (action instanceof camel.mms.MmsObject))
            info.setAction((camel.mms.MmsObject) action);
    }

    @objid ("3ada1c00-c906-40b9-a4fc-76a0f18b3085")
    private void setSubject(camel.execution.HistoryInfo info) {
        CDOObject subject  =  this._process.getElement(this._element.getSubject());
        if ((subject != null) &&  (subject instanceof camel.mms.MmsObject))
            info.setSubject((camel.mms.MmsObject) subject);
    }

}
