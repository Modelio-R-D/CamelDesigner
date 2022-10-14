package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("c57ce2ee-535d-46ce-8f4b-54e566d11d46")
public class Rule0811<T extends SoftRequirement> extends AbstractRule<T> {
    @objid ("0f8b7b51-79c9-4206-bea8-e31e16ba7526")
    private static final String RULEID = "R0811";

    @objid ("8f93b299-5b0b-43ab-a2b2-ee630bc89dc7")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getPriority());
    }

    @objid ("6e5f8cce-7533-4d20-8d2a-16130d214f63")
    @Override
    public String getDescription(T elt) {
        return "SoftRequirement : " + elt.getName() + " must specified one priority.";
    }

    @objid ("6392f446-6f5b-4167-a545-5d354e1c2e4a")
    @Override
    public String getRuleId() {
        return Rule0811.RULEID;
    }

    @objid ("a57568c6-f78b-44d5-af53-e71e74ed4d9c")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
