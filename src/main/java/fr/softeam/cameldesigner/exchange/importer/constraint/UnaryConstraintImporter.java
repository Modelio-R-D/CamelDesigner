package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.UnaryConstraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("150f8dbd-6516-4c98-9f03-2781653055a5")
public abstract class UnaryConstraintImporter<T extends UnaryConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint> extends CamelConstraintImporter<T,V> {
    @objid ("f03af0f6-2281-4387-b552-f767a758e841")
    public UnaryConstraintImporter() {
    }

    @objid ("2da14eed-965d-436a-8e00-b930c3e5cb14")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUnaryConstraint(this);
    }

    @objid ("dd412d04-a8ec-48a9-bcae-e1780ec6419f")
    public UnaryConstraintImporter(T elt) {
        super(elt);
    }

}
