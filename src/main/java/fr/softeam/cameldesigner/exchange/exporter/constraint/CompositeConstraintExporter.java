package fr.softeam.cameldesigner.exchange.exporter.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CompositeConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("99847e88-2c42-4c31-98ca-e20ade328bbd")
public abstract class CompositeConstraintExporter<T extends CompositeConstraint> extends ConstraintExporter<T> {
    @objid ("6384826f-cea3-4c94-9e89-56f7193cd766")
    public CompositeConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("293a7aa2-ee57-4267-964e-a891a674def8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("80819236-de05-4cac-8f34-c1d652204131")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("5d1b25ef-acf3-43c0-94a4-25c5a8756872")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
