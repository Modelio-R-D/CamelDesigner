package fr.softeam.cameldesigner.exchange.importer.unit;

import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4e4feb1a-b09e-4c6c-93fd-7c0d56a4a920")
public abstract class UnitImporter<T extends Unit, V extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit> extends FeatureImporter<T,V> {
    @objid ("93afb810-2a0b-4db4-83fc-da3d8b2f9af1")
    public UnitImporter() {
    }

    @objid ("5629c1c2-3ddd-42ff-ab25-85d1977a1e43")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUnit(this);
    }

    @objid ("f52e676a-7dce-4b9b-aed0-96a85637782b")
    public UnitImporter(T elt) {
        super(elt);
    }

    @objid ("3ad3a965-875b-4fde-b3b7-f6e05a94a3ad")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("df6808b7-2da7-458b-9697-e3a0ef48cbd8")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return super.createCamelElt(owner);
    }

}
