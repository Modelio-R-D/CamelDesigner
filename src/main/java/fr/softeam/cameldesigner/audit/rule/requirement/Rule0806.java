package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("33380e2e-a71e-4e32-b74a-6c87eb6e5046")
public class Rule0806<T extends HorizontalScaleRequirement> extends AbstractRule<T> {
    @objid ("507a46ba-e1a9-496d-a1d9-4225760fdda8")
    private static final String RULEID = "R0806";

    @objid ("53d55f49-3984-442f-af7b-e11dd23c84aa")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getMaxInstances());
    }

    @objid ("828ef191-1f34-4d0d-8ec8-746056bf8df8")
    @Override
    public String getDescription(T elt) {
        return "HorizontalScaleRequirement : " + elt.getName() + " must specified one max instance.";
    }

    @objid ("612c60aa-0e2a-4f29-b4fe-dbbd88aacd46")
    @Override
    public String getRuleId() {
        return Rule0806.RULEID;
    }

    @objid ("d074b37f-ec7c-40e5-8f8e-246c90b47945")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
