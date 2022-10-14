package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.AttributeConstraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b4ff67d0-fad0-4923-8048-81fbb3a1d823")
public abstract class AttributeConstraintImporter<T extends AttributeConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint> extends UnaryConstraintImporter<T,V> {
    @objid ("df997eca-0b1d-4986-a75b-2315ac1547c8")
    public AttributeConstraintImporter() {
    }

    @objid ("94732904-cab1-493c-b488-6fbc397a2f90")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitAttributeConstraint(this);
    }

    @objid ("dd15e7d8-1656-4541-8e47-ace6b2e50b73")
    public AttributeConstraintImporter(T elt) {
        super(elt);
    }

    @objid ("8e97f459-d8b8-490d-b90a-b1ff3f65a11d")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

    @objid ("a1e4941d-9f7c-45a7-815e-e9e95a97c3d5")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
