package fr.softeam.cameldesigner.exchange.importer.data;

import camel.data.Data;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c9da8bec-becc-4d3d-8a11-19af07ca1c44")
public class DataImporter<T extends Data, V extends fr.softeam.cameldesigner.api.datamodel.standard.class_.Data> extends FeatureImporter<T,V> {
    @objid ("c14b9e12-2b3e-45c2-9d90-8e1e4c0679eb")
    public DataImporter() {
        super();
    }

    @objid ("c0d79595-3e24-4e61-a69c-be6122099c37")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.create();
    }

    @objid ("afe0f186-b5c7-4654-987f-7205fc3e0535")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("6cae5218-b032-47de-b8e9-fce9205d5d59")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitData(this);
    }

}
