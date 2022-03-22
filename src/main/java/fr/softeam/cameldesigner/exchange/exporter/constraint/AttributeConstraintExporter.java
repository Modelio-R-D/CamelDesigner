package fr.softeam.cameldesigner.exchange.exporter.constraint;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;

public abstract class AttributeConstraintExporter<T extends AttributeConstraint> extends UnaryConstraintExporter<T>{

    public AttributeConstraintExporter(T elt) {
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
