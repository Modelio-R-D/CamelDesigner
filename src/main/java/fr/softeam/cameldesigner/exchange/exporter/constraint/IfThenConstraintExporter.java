package fr.softeam.cameldesigner.exchange.exporter.constraint;

import org.eclipse.emf.cdo.CDOObject;
import camel.constraint.ConstraintFactory;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;

public class IfThenConstraintExporter<T extends IfThenConstraint> extends CompositeConstraintExporter<T>{

    public IfThenConstraintExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createIfThenConstraint();
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
