package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.CompositeConstraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("250513af-c828-4af4-ada0-ae3242b796f4")
public abstract class CompositeConstraintImporter<T extends CompositeConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CompositeConstraint> extends CamelConstraintImporter<T,V> {
    @objid ("a8d3ad4d-44e0-49dc-8c2d-54f37b8ba626")
    public CompositeConstraintImporter() {
    }

    @objid ("9918b899-a623-49a6-a610-6edf15200409")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCompositeConstraint(this);
    }

    @objid ("ca0d4dd5-a8af-4c41-bc24-0cf8ed8989a5")
    public CompositeConstraintImporter(T elt) {
        super(elt);
    }

}
