package fr.softeam.cameldesigner.audit.rule.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("9ec08afe-49c3-487a-aada-6028e88be2e0")
public class Rule1309<T extends LogicalConstraint> extends AbstractRule<T> {
    @objid ("79c6c63a-c9f3-4e76-8458-bf9c70bd5354")
    private static final String RULEID = "R1309";

    @objid ("410621e5-277c-4866-ad20-5eee70ba9bbc")
    @Override
    public boolean isViolated(T context) {
        return CamelConstraint.canInstantiate(context.getElement().getCompositionOwner());
    }

    @objid ("a24e97cd-abaa-41db-87b9-6f47a48bb674")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " must be related to a Constraint";
    }

    @objid ("844bc5b3-c375-4670-bc32-68af310c40e8")
    @Override
    public String getRuleId() {
        return Rule1309.RULEID;
    }

    @objid ("b4e91aeb-422c-41cb-bc18-e0292b554c7f")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
