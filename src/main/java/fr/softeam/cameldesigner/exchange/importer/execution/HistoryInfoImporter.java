package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.HistoryInfo;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("47cabe70-bf8d-4580-b980-7d4b0f4b91da")
public class HistoryInfoImporter<T extends HistoryInfo, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo> extends FeatureImporter<T,V> {
    @objid ("7683e676-e3b8-43aa-9b51-e41aa379c3ae")
    public HistoryInfoImporter() {
        super();
    }

    @objid ("6cc41902-dd97-4519-81e8-8741aa5270d1")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.create();
    }

    @objid ("57c6bf40-8888-4f9c-96d7-4ca666a9a986")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("6c0541ad-eeb2-4d8a-9f0f-33c7609a1e84")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHistoryInfo(this);
    }

}
