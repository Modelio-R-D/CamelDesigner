package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("7becaf30-65b8-499f-9011-f7ee6b8cfac9")
public class Rule0618<T extends Window> extends AbstractRule<T> {
    @objid ("500199b5-d4b0-41b7-a351-2065df14efaa")
    private static final String RULEID = "R0618";

    @objid ("22795ff0-7040-414d-b98c-3cb87ed604a5")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getMeasurementSize());
    }

    @objid ("21e0443a-e76b-4ea3-acaa-a57d7af3f3b9")
    @Override
    public String getDescription(T elt) {
        return "Window : " + elt.getName() + " must have a specified measurement size.";
    }

    @objid ("711173f4-4da7-4a0e-b923-d7ea561b2dcf")
    @Override
    public String getRuleId() {
        return Rule0618.RULEID;
    }

    @objid ("ce1b5b3f-413b-4c76-ab78-e5a520c906dc")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
