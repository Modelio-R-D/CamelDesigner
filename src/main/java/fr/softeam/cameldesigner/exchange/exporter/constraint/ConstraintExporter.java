package fr.softeam.cameldesigner.exchange.exporter.constraint;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.exchange.exporter.core.ExpendableElementExporter;

public abstract class ConstraintExporter<T extends CamelConstraint> extends ExpendableElementExporter<T>{

    public ConstraintExporter(T elt) {
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
        if ((context instanceof camel.constraint.ConstraintModel) && (elt instanceof camel.constraint.Constraint)) {
            ((camel.constraint.ConstraintModel) context).getConstraints().add((camel.constraint.Constraint) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
