package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("9ea36551-bae0-49c8-b0d0-1b7811a56ba1")
public class Rule0604<T extends Metric> extends AbstractRule<T> {
    @objid ("0f942797-27b0-4e9b-8398-2b0c0bee7438")
    private static final String RULEID = "R0604";

    @objid ("86c1ce9d-9c74-4adf-aae0-b2a6e4537527")
    @Override
    public boolean isViolated(T context) {
        return (context.getMetricTemplate() == null);
    }

    @objid ("5b99ffa8-4abe-4cf9-815a-c678ecd98973")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " Metric must ba associated to a MetricTemplate.";
    }

    @objid ("183413f1-60a5-4746-bb12-4c78bfbcc7c8")
    @Override
    public String getRuleId() {
        return Rule0604.RULEID;
    }

    @objid ("09b2c308-bb54-4ed7-8e57-7787f4a10146")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
