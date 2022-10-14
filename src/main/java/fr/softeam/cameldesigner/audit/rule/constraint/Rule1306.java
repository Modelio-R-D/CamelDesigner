package fr.softeam.cameldesigner.audit.rule.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("c79c85f5-0be2-4598-993a-22d669ea364d")
public class Rule1306<T extends IfThenConstraint> extends AbstractRule<T> {
    @objid ("af6e72cf-269e-48b9-b475-d48f0f0011f4")
    private static final String RULEID = "R1306";

    @objid ("55f2407f-8f14-4642-9158-509379b04999")
    @Override
    public boolean isViolated(T context) {
        return (context.getThen() == null);
    }

    @objid ("4a62b6c8-177f-4a51-872a-e24d0efc7e25")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " is not related to a ThenConstraint.";
    }

    @objid ("e38b58de-58d0-46d7-91e7-38f6fb7f7208")
    @Override
    public String getRuleId() {
        return Rule1306.RULEID;
    }

    @objid ("691d1a45-c54c-4536-b432-5d049a172e4a")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
