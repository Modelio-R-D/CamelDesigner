package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.HistoryRecord;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("04f38348-a92c-4f39-a127-656d77cb14f0")
public class HistoryRecordImporter<T extends HistoryRecord, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord> extends FeatureImporter<T,V> {
    @objid ("99307e9e-652b-4a7c-a405-a84484052714")
    public HistoryRecordImporter() {
        super();
    }

    @objid ("9df70d76-0af3-4ec5-b324-e077dc9513dc")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.create();
    }

    @objid ("b1c6004b-2f4f-468d-acfd-c979fe75304a")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("46bd64d1-4c10-4c2f-a74d-ee72eae75032")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHistoryRecord(this);
    }

}
