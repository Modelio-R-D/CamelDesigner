package fr.softeam.cameldesigner.exchange.exporter.constraint;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint;

public abstract class UnaryConstraintExporter<T extends UnaryConstraint> extends ConstraintExporter<T>{

    public UnaryConstraintExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }


    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }


    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
