package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.Constraint;
import camel.constraint.LogicalConstraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("561a92c2-f915-400c-9b8b-5728c1229d8b")
public class LogicalConstraintImporter<T extends LogicalConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint> extends CompositeConstraintImporter<T,V> {
    @objid ("ba800719-1995-46b5-b904-a5e3f7e52063")
    public LogicalConstraintImporter() {
    }

    @objid ("ab97edb1-8c2e-4aec-8387-69846a145811")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitLogicalConstraint(this);
    }

    @objid ("7d8dc3e1-bec7-4615-b9ad-3c4cca0789cd")
    public LogicalConstraintImporter(T elt) {
        super(elt);
    }

    @objid ("ef48296e-e48f-4980-a20c-d9063c0543ad")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return  fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint.create();
    }

    @objid ("f0b65241-e5b0-4b4b-9ce3-86305a11d065")
    @Override
    public void attach(V elt, CamelElement context) {
        Constraint constraint = this._element.getConstraints().get(0);
        
        CamelElement camelElt = this._process.getElement(constraint);
        if (camelElt instanceof fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint)
            elt.addConstraints((fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint) camelElt);
    }

    @objid ("f6ed3fd8-972f-4cb9-87f6-f3369cca973e")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setLogicalOperator(elt);
    }

    @objid ("9153249b-3cbf-4dcf-b41d-03fd2dde9409")
    private void setLogicalOperator(V elt) {
        elt.setLogicalOperator(this._element.getLogicalOperator().toString());
    }

}
