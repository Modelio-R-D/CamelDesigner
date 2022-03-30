package fr.softeam.cameldesigner.exchange.exporter.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c5cd8aa8-516a-4570-9f3f-278390923cb9")
public abstract class UnaryConstraintExporter<T extends UnaryConstraint> extends ConstraintExporter<T> {
    @objid ("2f3c0b1d-53d9-431a-b724-8be82af0b7d0")
    public UnaryConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("fc343f07-f38b-4e60-b513-7e7673a6babf")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("be2f9f72-0f96-4100-9bdc-b359e12e9531")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("858b0803-7988-446a-beb3-77880092ac47")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
