package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("d330ab7d-3faa-4f48-a7c8-72ac2d658625")
public class Rule0627<T extends MetricTemplate> extends AbstractRule<T> {
    @objid ("d837af9a-5225-488e-a049-9075fee67118")
    private static final String RULEID = "R0627";

    @objid ("47e3560e-c3fa-4fbc-a616-fa2b182cdf26")
    @Override
    public boolean isViolated(T context) {
        return (context.getAttribute() == null);
    }

    @objid ("a0068a64-b16b-4279-a48a-f231401f0ba8")
    @Override
    public String getDescription(T elt) {
        return "MetricTemplate : " + elt.getName() + " must have a related MeasurableAttribute.";
    }

    @objid ("90deb4bb-90ff-4b08-acf2-3a87ec1b39bc")
    @Override
    public String getRuleId() {
        return Rule0627.RULEID;
    }

    @objid ("cde3851b-a416-4357-967e-89a6e7fa10c5")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
