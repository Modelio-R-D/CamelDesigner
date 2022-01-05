package fr.softeam.cameldesigner.exchange.exporter.execution;

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
    }

    @objid ("6d701344-9321-49ba-b127-9510288dd837")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
