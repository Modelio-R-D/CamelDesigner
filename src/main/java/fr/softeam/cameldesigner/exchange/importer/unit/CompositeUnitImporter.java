package fr.softeam.cameldesigner.exchange.importer.unit;

import camel.unit.CompositeUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("7a80e714-8e64-4243-b5f0-4c6abfc3f60e")
public abstract class CompositeUnitImporter<T extends CompositeUnit, V extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit> extends DimensionedUnitImporter<T,V> {
    @objid ("b5ebcb1e-fe44-4d08-a8b7-01d2464f6c6f")
    public CompositeUnitImporter() {
    }

    @objid ("8249f36a-a84a-474a-8fae-76db36a84e9b")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCompositeUnit(this);
    }

    @objid ("26bb0a96-8800-469f-a6ba-d1f7e6f52685")
    public CompositeUnitImporter(T elt) {
        super(elt);
    }

    @objid ("6d71b8a2-e94e-49e1-9c8e-1e9a0c1cb5de")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("198883c7-8ef0-4066-a335-8e0104c63ffb")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit.create();
    }

}
