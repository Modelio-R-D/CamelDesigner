package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("9e7324a5-280f-4fa7-b604-9ff5398f6593")
public class Rule0625<T extends MetricTemplate> extends AbstractRule<T> {
    @objid ("1bdb04db-a884-48bf-a4d1-4c13bd87a395")
    private static final String RULEID = "R0625";

    @objid ("67124aa3-249c-4e42-b39a-1b5e1a179bcb")
    @Override
    public boolean isViolated(T context) {
        return (context.getUnit() == null);
    }

    @objid ("227d32f8-047d-485d-837e-f71bc6ae7424")
    @Override
    public String getDescription(T elt) {
        return "MetricTemplate : " + elt.getName() + " must have a Unit.";
    }

    @objid ("df81c018-6ca1-4b88-94d1-043e890dac86")
    @Override
    public String getRuleId() {
        return Rule0625.RULEID;
    }

    @objid ("fdcf4aaa-239f-487e-9ed6-a8b5a75da8e4")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
