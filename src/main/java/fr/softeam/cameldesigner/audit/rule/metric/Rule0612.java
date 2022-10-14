package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("bf897d24-6fc6-460f-95c6-6028f9eef7cd")
public class Rule0612<T extends Schedule> extends AbstractRule<T> {
    @objid ("30fd5cc3-15cd-4027-99f4-d5be0ff41ae0")
    private static final String RULEID = "R0612";

    @objid ("74ed9f7a-650f-42e9-ba61-9d56ce8d067e")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getRepetitions());
    }

    @objid ("78ef0f20-fad5-45eb-9c59-74c304b21334")
    @Override
    public String getDescription(T elt) {
        return "Schedule : " + elt.getName() + " must have a repetition value";
    }

    @objid ("8b627288-b415-478c-a0f7-af1fc89cc782")
    @Override
    public String getRuleId() {
        return Rule0612.RULEID;
    }

    @objid ("5fe701b6-cad4-4d98-92da-b8b9c38de555")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
