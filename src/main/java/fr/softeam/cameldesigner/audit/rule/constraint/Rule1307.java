package fr.softeam.cameldesigner.audit.rule.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("cd00ca50-1db3-44bc-ba40-d43811a12496")
public class Rule1307<T extends MetricVariableConstraint> extends AbstractRule<T> {
    @objid ("f62e720c-396e-4e9c-af4b-67480224f9a5")
    private static final String RULEID = "R1307";

    @objid ("eea47956-8faf-4dcd-9aca-1de1c1891b1d")
    @Override
    public boolean isViolated(T context) {
        return (context.getMetricVariable() == null);
    }

    @objid ("c8ac4af2-a98d-4aeb-87f6-41b5ce489ae0")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " is not related to a MetricVariable.";
    }

    @objid ("3b4da574-132f-4f6a-81fc-0ff50b44b726")
    @Override
    public String getRuleId() {
        return Rule1307.RULEID;
    }

    @objid ("121799cb-7cdb-4821-9b09-04eaca7283a8")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
