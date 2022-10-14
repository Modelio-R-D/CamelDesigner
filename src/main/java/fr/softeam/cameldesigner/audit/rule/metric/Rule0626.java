package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("6f8ca272-c0d1-4b12-88cc-26d70a33892a")
public class Rule0626<T extends MetricTemplate> extends AbstractRule<T> {
    @objid ("66b3da4f-589c-4882-a756-8397f07dd036")
    private static final String RULEID = "R0626";

    @objid ("687e0069-001a-40e6-92dc-cf700ae17a74")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getValueDirection());
    }

    @objid ("4d91e3de-eee9-4fcc-86ad-db8dbea6dccf")
    @Override
    public String getDescription(T elt) {
        return "MetricTemplate : " + elt.getName() + " must have a ValueDirection.";
    }

    @objid ("e2effe39-4a42-4e62-9d35-525d5e998bd8")
    @Override
    public String getRuleId() {
        return Rule0626.RULEID;
    }

    @objid ("74b96df4-9109-42e8-b377-a590bf86ad60")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
