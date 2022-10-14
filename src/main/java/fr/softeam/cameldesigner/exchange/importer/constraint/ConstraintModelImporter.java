package fr.softeam.cameldesigner.exchange.importer.constraint;

import org.eclipse.emf.cdo.CDOObject;
import camel.constraint.ConstraintModel;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;


public class ConstraintModelImporter<T extends ConstraintModel, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel> extends SubModelImporter<T,V> {

    public ConstraintModelImporter() {
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitConstraintModel(this);
    }


    public ConstraintModelImporter(T elt) {
        super(elt);
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

}
