package fr.softeam.cameldesigner.exchange.exporter.constraint;

import java.sql.Date;
import camel.constraint.ComparisonOperatorType;
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
        if (elt instanceof camel.constraint.UnaryConstraint) {
            camel.constraint.UnaryConstraint unaryConst = (camel.constraint.UnaryConstraint) elt;
            setValidity(unaryConst);
            setCompOperator(unaryConst);
            setThresold(unaryConst);
        }
    }

    @objid ("858b0803-7988-446a-beb3-77880092ac47")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("d09f5578-1f58-4786-8528-86ce4ee287ba")
    private void setThresold(camel.constraint.UnaryConstraint unaryConst) {
        String thre =  this._element.getThreshold();
        if (thre != null) {
            try {
            unaryConst.setThreshold(Double.valueOf(thre));
            }catch(Exception e) {  }
        }
    }

    @objid ("2af7bfc9-0b9f-40e2-b33f-062401e7d89c")
    private void setCompOperator(camel.constraint.UnaryConstraint unaryConst) {
        String op =  this._element.getComparisonOperator();
        if (op != null) {
            try {
            unaryConst.setComparisonOperator(ComparisonOperatorType.valueOf(op));
            }catch(Exception e) {  }
        }
    }

    @objid ("167034f6-7a9b-4a45-b5fa-3a63a2cae0ce")
    private void setValidity(camel.constraint.UnaryConstraint unaryConst) {
        String date =  this._element.getValidity();
        if (date != null) {
            try {
            unaryConst.setValidity(Date.valueOf(date));
            }catch(Exception e) {   }
        }
    }

}
