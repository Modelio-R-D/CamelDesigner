package fr.softeam.cameldesigner.exchange.importer.unit;

import camel.unit.UnitDimension;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("06f80a1f-3670-45f5-8fb2-bb144472c70f")
public class UnitDimensionImporter<T extends UnitDimension, V extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension> extends FeatureImporter<T,V> {
    @objid ("bb4b5f08-acdf-49fe-9ebe-e9f95015cbab")
    public UnitDimensionImporter() {
    }

    @objid ("adaefed6-647b-41ec-be43-3439e5387ea4")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUnitDimension(this);
    }

    @objid ("85bd4694-8540-4b79-8407-27e7bb91b4bd")
    public UnitDimensionImporter(T elt) {
        super(elt);
    }

    @objid ("b1e026ce-6cfb-448d-9c39-cad41d2a45bb")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof UnitModel)
            ((UnitModel) context).addDimensions(elt);
    }

    @objid ("8eaf21d6-6ef0-48dc-bb72-c6c86a3e2701")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension.create();
    }

}
