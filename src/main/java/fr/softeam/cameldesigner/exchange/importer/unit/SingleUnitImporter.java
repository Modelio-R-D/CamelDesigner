package fr.softeam.cameldesigner.exchange.importer.unit;

import camel.unit.SingleUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6b8d2c4d-1934-43f3-b941-338280f6580b")
public class SingleUnitImporter<T extends SingleUnit, V extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit> extends UnitImporter<T,V> {
    @objid ("a7d19e14-a95e-4edb-a929-ce968615069f")
    public SingleUnitImporter() {
    }

    @objid ("f68d7dd6-2a12-45d7-991f-79d5ac63ca2c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSingleUnit(this);
    }

    @objid ("136a892e-37c5-46a1-822d-13a3306873f5")
    public SingleUnitImporter(T elt) {
        super(elt);
    }

    @objid ("1a549980-2d3d-4921-8857-b669834c261e")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("559fd8b0-7cab-4b7d-b8e2-22aa4227456a")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit.create();
    }

}
