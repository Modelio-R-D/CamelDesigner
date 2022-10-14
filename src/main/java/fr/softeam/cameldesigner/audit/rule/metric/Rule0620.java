package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("5f086c76-1300-4cb1-abe1-b95b8c5b1a6b")
public class Rule0620<T extends MetricContext> extends AbstractRule<T> {
    @objid ("fb6fb80d-d4b8-4bae-bfa4-5fc3e10c0ec0")
    private static final String RULEID = "R0620";

    @objid ("d1a7a6c9-72cc-41f7-9f6f-5e05d94c5a94")
    @Override
    public boolean isViolated(T context) {
        return (context.getMetric() == null);
    }

    @objid ("f60e2b2f-a7f1-4aec-aa84-952ba442dfdd")
    @Override
    public String getDescription(T elt) {
        return "MetricContext : " + elt.getName() + " must have a related Metric.";
    }

    @objid ("7faf8d96-80bf-4276-9eaa-63b920c69555")
    @Override
    public String getRuleId() {
        return Rule0620.RULEID;
    }

    @objid ("ec226acb-5eab-452d-9ecf-73c5abb3fbbd")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
