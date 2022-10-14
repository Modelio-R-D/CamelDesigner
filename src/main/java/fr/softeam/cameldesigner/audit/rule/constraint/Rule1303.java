package fr.softeam.cameldesigner.audit.rule.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("080a5c3a-5231-490a-b7c9-ab9ec4309beb")
public class Rule1303<T extends MetricConstraint> extends AbstractRule<T> {
    @objid ("f66a9802-b52a-4fb9-a700-f7b013701849")
    private static final String RULEID = "R1303";

    @objid ("c020cd4a-a8d0-46e5-aadc-d6b3448c9287")
    @Override
    public boolean isViolated(T context) {
        return (!(MetricContext.canInstantiate(context.getElement().getCompositionOwner())));
    }

    @objid ("c3f727bc-176d-4103-9ab0-69a8a6bcd9b5")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " is not related to a MetricContext.";
    }

    @objid ("f210fea7-a095-4832-b22e-587e34ec20e0")
    @Override
    public String getRuleId() {
        return Rule1303.RULEID;
    }

    @objid ("46caa987-727b-4156-bbed-0d5e4935a34f")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
