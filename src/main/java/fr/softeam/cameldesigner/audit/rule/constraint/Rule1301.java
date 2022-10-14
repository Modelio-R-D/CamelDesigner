package fr.softeam.cameldesigner.audit.rule.constraint;

import camel.constraint.ComparisonOperatorType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("295c6494-24a8-4479-99a9-17b63e2dbaef")
public class Rule1301<T extends UnaryConstraint> extends AbstractRule<T> {
    @objid ("eb51ef03-33af-4216-8c54-ea5a53cee54b")
    private static final String RULEID = "R1301";

    @objid ("60916abb-ccee-4255-bb10-c481d17f061c")
    @Override
    public boolean isViolated(T context) {
        String operator = context.getComparisonOperator();
        if ((operator == null) ||(operator.equals(""))){
            return true;
        }else {
            try {
                ComparisonOperatorType.valueOf(operator);
            }catch(@SuppressWarnings ("unused") Exception e) {
                return true;
            }
        }
        return false;
    }

    @objid ("ce02a125-33f7-485f-ab2e-1f51ec219fa8")
    @Override
    public String getDescription(T elt) {
        return "Comparison Operator of " + elt.getName() + " is not valid.";
    }

    @objid ("cd75f47d-0ade-48ed-8713-270b5cef46e3")
    @Override
    public String getRuleId() {
        return Rule1301.RULEID;
    }

    @objid ("ef240f67-bac2-4b82-b72a-2f0ef4b9bd5c")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
