package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("70f9254b-af15-4d71-8c50-d4b37d06611b")
public class Rule0628<T extends MetricInstanceModel> extends AbstractRule<T> {
    @objid ("1738da95-a2a7-42d7-8eda-c154fa5e109a")
    private static final String RULEID = "R0628";

    @objid ("87b9b2d3-c310-4749-baac-d284443fcb38")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("658c9f77-d6e2-40f3-9541-b669f394872d")
    @Override
    public String getDescription(T elt) {
        return "MetricInstanceModel : " + elt.getName() + " must be typed.";
    }

    @objid ("edb5bd91-3b8f-44ee-80d3-4faa450eb8f4")
    @Override
    public String getRuleId() {
        return Rule0628.RULEID;
    }

    @objid ("b118efe9-2a16-4af0-85ce-eb0b81e3473b")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
