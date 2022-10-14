package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("0ffd863b-b662-41ac-9145-6913a530eeb9")
public class Rule0621<T extends RawMetricContext> extends AbstractRule<T> {
    @objid ("bd7f13cd-fc96-45c1-9ff5-d1a08d6c4204")
    private static final String RULEID = "R0621";

    @objid ("c28b1456-d968-4634-a6c6-9b5d0936ee76")
    @Override
    public boolean isViolated(T context) {
        return (context.getSensor() == null);
    }

    @objid ("66b60a74-d7af-40c4-93b1-578dc556dcfb")
    @Override
    public String getDescription(T elt) {
        return "RawMetricContext : " + elt.getName() + " must have a related Sensor.";
    }

    @objid ("0c0626ef-2969-40ff-aa2a-55cdac734383")
    @Override
    public String getRuleId() {
        return Rule0621.RULEID;
    }

    @objid ("9d529f63-4129-443b-9587-dd716136eb30")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
