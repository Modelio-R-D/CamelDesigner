package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.ConstraintModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c206e217-6cac-4d7e-832b-b5187c0f0569")
public class ConstraintModelImporter<T extends ConstraintModel, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel> extends SubModelImporter<T,V> {
    @objid ("db88219c-cbc0-4154-97c1-afc09728c31e")
    public ConstraintModelImporter() {
    }

    @objid ("e44e1e90-7888-4d94-9481-5dc7b58d5c7d")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitConstraintModel(this);
    }

    @objid ("258ce593-ae71-4d24-a1f9-486718646259")
    public ConstraintModelImporter(T elt) {
        super(elt);
    }

    @objid ("ca0d2ce9-a5bf-4556-bc58-e8bccc985e69")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

}
