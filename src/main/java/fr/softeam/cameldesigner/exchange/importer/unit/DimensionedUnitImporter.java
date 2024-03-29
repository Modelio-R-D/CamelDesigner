package fr.softeam.cameldesigner.exchange.importer.unit;

import camel.unit.DimensionedUnit;
import camel.unit.UnitDimension;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("03bb4a8b-41c5-4969-a43e-343b19996707")
public class DimensionedUnitImporter<T extends DimensionedUnit, V extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit> extends UnitImporter<T,V> {
    @objid ("fb5aca73-dfcf-4c70-9133-10df2434791a")
    public DimensionedUnitImporter() {
    }

    @objid ("f96fc824-3759-4ec4-9ac2-d3bf019ea556")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDimensionedUnit(this);
    }

    @objid ("c80e08f5-bab8-4759-ba3f-60f6589dd6f4")
    public DimensionedUnitImporter(T elt) {
        super(elt);
    }

    @objid ("f4efa263-c8d6-4b9b-b1e2-addcaa9e19b2")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("d7cbd7f4-5052-4bcd-8b52-f9c0fe461c8f")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return super.createCamelElt(owner);
    }

    @objid ("1c8e82bd-ad45-41be-bafc-91738107f0ea")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setDimension(elt);
    }

    @objid ("4b15fc22-136f-4d13-bb2b-372c4116a1b0")
    private void setDimension(V elt) {
        UnitDimension value = this._element.getDimension();
        CamelElement camValue = this._process.getElement(value);
        if ((camValue != null) && (camValue instanceof fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension)) {
            elt.setDimension((fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension) camValue);
        }
    }

}
