package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("86a02f1a-4ed0-44ed-85e0-656ebe33a8b3")
public class Rule0615<T extends Window> extends AbstractRule<T> {
    @objid ("28ae2699-3c02-47e6-aefa-3794ea080302")
    private static final String RULEID = "R0615";

    @objid ("8de5df14-ff59-41ee-9971-3634fe704fe3")
    @Override
    public boolean isViolated(T context) {
        return (context.getTimeUnit() == null);
    }

    @objid ("c49c6ecb-c4ce-4fe0-9008-a22b0536c26a")
    @Override
    public String getDescription(T elt) {
        return "Window : " + elt.getName() + " must have a specified TimeUnit";
    }

    @objid ("c46d809a-b73f-4862-97b7-bfa90e0b6873")
    @Override
    public String getRuleId() {
        return Rule0615.RULEID;
    }

    @objid ("4db7b3dd-6b83-4aec-8fed-85e515a6a557")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
