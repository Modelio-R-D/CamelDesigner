package fr.softeam.cameldesigner.exchange.exporter.constraint;

import camel.constraint.ConstraintFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("87a33fe1-b48e-4ee1-b5b5-e33d7d58e59f")
public class LogicalConstraintExporter<T extends LogicalConstraint> extends CompositeConstraintExporter<T> {
    @objid ("81b7dd5a-0ae7-41c0-ac53-f6cd6f36abdb")
    public LogicalConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("30a9b6d6-034b-4909-99cc-000db2a4f5ce")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createLogicalConstraint();
    }

    @objid ("55ac245a-7f2a-484a-aa40-7497e81027bb")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("cb94d65e-4241-4d11-aa61-c9945618b3c0")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
