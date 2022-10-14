package fr.softeam.cameldesigner.audit.rule.constraint;

import camel.constraint.LogicalOperatorType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("da683b83-5592-41b9-89c2-09e68ceec153")
public class Rule1308<T extends LogicalConstraint> extends AbstractRule<T> {
    @objid ("9413444d-8e11-4f99-8849-ed9dff34dbe3")
    private static final String RULEID = "R1308";

    @objid ("1d154b19-35d8-4ba0-b307-24c49a604237")
    @Override
    public boolean isViolated(T context) {
        String op = context.getLogicalOperator();
        if (op == null)
            return true;
        else {
            try {
                LogicalOperatorType.valueOf(op);
            }catch(@SuppressWarnings ("unused") Exception e) {
                return true;
            }
        }
        return false;
    }

    @objid ("395926b4-28fb-4695-90f6-02b2e9a0aace")
    @Override
    public String getDescription(T elt) {
        return "Logical Operator of " + elt.getName() + " is not valid.";
    }

    @objid ("b9cffb5b-76a0-4ba0-af6a-612f3dbb779e")
    @Override
    public String getRuleId() {
        return Rule1308.RULEID;
    }

    @objid ("764b2e51-e25e-4347-a9c3-40d5e4477689")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
