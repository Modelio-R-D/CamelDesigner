package fr.softeam.cameldesigner.exchange.importer.unit;

import camel.unit.Dimensionless;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f49001bb-3ccd-4419-b3f0-b8ca73a9e48b")
public class DimensionlessImporter<T extends Dimensionless, V extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless> extends UnitImporter<T,V> {
    @objid ("b6418fb2-8b59-4557-8841-3a70511bb685")
    public DimensionlessImporter() {
    }

    @objid ("a5eeaa6d-2d27-4552-abef-20b6248c6a81")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDimensionless(this);
    }

    @objid ("48cc8eb6-ac92-4eac-8126-c7d89496be9b")
    public DimensionlessImporter(T elt) {
        super(elt);
    }

    @objid ("a63e7840-4182-4028-9cd8-f06b242cad58")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("be6090e4-e105-4dc6-8d95-736851bffbd2")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless.create();
    }

}
