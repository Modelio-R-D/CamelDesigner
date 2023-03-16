package fr.softeam.cameldesigner.exchange.exporter.constraint;

import camel.constraint.ConstraintFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bfcf6b80-c112-44f5-b7ac-eea97a6e1cc0")
public class IfThenConstraintExporter<T extends IfThenConstraint> extends CompositeConstraintExporter<T> {
    @objid ("4c86f3cf-9632-464b-ac01-a1a45e53dfcd")
    public IfThenConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("110bb65f-9974-41d7-8cac-deed3e349b0f")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createIfThenConstraint();
    }

    @objid ("afc7d885-8d45-4fe3-9648-1bd5e7fc8337")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.constraint.IfThenConstraint) {
            camel.constraint.IfThenConstraint ifConst = (camel.constraint.IfThenConstraint) elt;
            setIf(ifConst);
            setElse(ifConst);
            setThen(ifConst);
        }
    }

    @objid ("cc59095e-f5a9-4f3c-b0f7-8ec09e2aba28")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("dbdc4bc4-c0a7-40d0-8281-9f730e2a3a58")
    private void setIf(camel.constraint.IfThenConstraint ifConst) {
        CDOObject ifConstraint =  this._process.getElement(this._element.getIf());
        if ((ifConstraint != null) &&  (ifConstraint instanceof camel.constraint.Constraint))
            ifConst.setIf((camel.constraint.Constraint) ifConstraint);
    }

    @objid ("4e0610e1-87cb-4e54-9ed6-ccbd95430dab")
    private void setElse(camel.constraint.IfThenConstraint ifConst) {
        CDOObject elseConstraint =  this._process.getElement(this._element.getElse());
        if ((elseConstraint != null) &&  (elseConstraint instanceof camel.constraint.Constraint))
            ifConst.setElse((camel.constraint.Constraint) elseConstraint);
    }

    @objid ("bd938540-f034-4bf0-a2a6-91b287f6879e")
    private void setThen(camel.constraint.IfThenConstraint ifConst) {
        CDOObject thenConstraint =  this._process.getElement(this._element.getThen());
        if ((thenConstraint != null) &&  (thenConstraint instanceof camel.constraint.Constraint))
            ifConst.setThen((camel.constraint.Constraint) thenConstraint);
    }

}
