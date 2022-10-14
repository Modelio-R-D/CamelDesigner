package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("fa7f8302-c7a5-4eb7-b0e8-62f87540d4e2")
public class Rule0802<T extends SecurityRequirement> extends AbstractRule<T> {
    @objid ("2afd9211-b8f6-454e-a8b5-00def711d2ee")
    private static final String RULEID = "R0802";

    @objid ("dd0f8a7e-ce9d-4b36-8533-b82ba75bf2b9")
    @Override
    public boolean isViolated(T context) {
        return (context.getSecurityControls().size() == 0);
    }

    @objid ("0e5962a5-988d-4b22-b72d-8bdaafcf2663")
    @Override
    public String getDescription(T elt) {
        return "SecurityRequirement : " + elt.getName() + " must be related to at least one SecurityControl.";
    }

    @objid ("d58a0b0e-a00b-412e-9461-179c474451c5")
    @Override
    public String getRuleId() {
        return Rule0802.RULEID;
    }

    @objid ("9d4c4ea6-c6f9-4749-b3b9-cb2a6fe0bd92")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
