package fr.softeam.cameldesigner.audit.rule.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("bde30041-df9c-4d04-a631-2cfe6a0f7d10")
public class Rule1302<T extends UnaryConstraint> extends AbstractRule<T> {
    @objid ("7a6bc9e4-bc45-4ce6-a3a1-36a15c0d3fd1")
    private static final String RULEID = "R1302";

    @objid ("3b06bad0-1da4-454b-a3b5-89c7896f2b10")
    @Override
    public boolean isViolated(T context) {
        String operator = context.getThreshold();
        if ((operator == null) ||(operator.equals(""))){
            return true;
        }else {
            try {
               Double.valueOf(operator);
            }catch(@SuppressWarnings ("unused") Exception e) {
                return true;
            }
        }
        return false;
    }

    @objid ("ee93cdbb-d19e-415d-a9a0-6fb462c3d554")
    @Override
    public String getDescription(T elt) {
        return "Threshold value of " + elt.getName() + " is not valid.";
    }

    @objid ("aad00a09-c8cb-438e-a573-d59e73d808c7")
    @Override
    public String getRuleId() {
        return Rule1302.RULEID;
    }

    @objid ("b6f8fac2-03db-4034-a70b-4e7480d5f96e")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
