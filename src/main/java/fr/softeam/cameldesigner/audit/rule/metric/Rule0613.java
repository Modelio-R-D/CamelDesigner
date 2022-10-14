package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("56de93a7-22d0-4d3b-bb21-e9a66bac8cc2")
public class Rule0613<T extends Schedule> extends AbstractRule<T> {
    @objid ("09c531ce-8b0a-4fa6-bc2a-7eb1739e81ff")
    private static final String RULEID = "R0613";

    @objid ("452289d0-34b0-4ef5-9be2-a87f54f2cc86")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getInterval());
    }

    @objid ("9d44c310-cddd-407d-98cc-4067ac37eb5b")
    @Override
    public String getDescription(T elt) {
        return "Schedule : " + elt.getName() + " must have an interval value";
    }

    @objid ("1432b179-9097-462c-b8a6-d57aa4f8936c")
    @Override
    public String getRuleId() {
        return Rule0613.RULEID;
    }

    @objid ("f472edf4-8dc3-437e-a39e-34d7a2647b69")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
