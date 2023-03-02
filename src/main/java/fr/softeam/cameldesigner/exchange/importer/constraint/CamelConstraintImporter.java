package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.Constraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2eedec42-b29c-4fd7-b1f2-b160eb926a12")
public abstract class CamelConstraintImporter<T extends Constraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint> extends NamedElementImporter<T,V> {
    @objid ("3e6d0143-1ac6-4cf5-a2e9-c4ac5aa52ea6")
    public CamelConstraintImporter() {
    }

    @objid ("81b003a4-9e7a-4990-8132-e7fbe2688aec")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitConstraint(this);
    }

    @objid ("3e36fedb-8dc5-4584-848d-e7ac4bb97957")
    public CamelConstraintImporter(T elt) {
        super(elt);
    }

    @objid ("f15c3b9d-8d4c-4fe6-ab72-f28f09914731")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

}
