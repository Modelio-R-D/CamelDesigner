package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("9aee32e0-5659-4db4-ac4f-f1246340d511")
public class Rule0803<T extends LocationRequirement> extends AbstractRule<T> {
    @objid ("bf3ea42d-1aaf-4f9e-8723-b8f7d4198753")
    private static final String RULEID = "R0803";

    @objid ("c6563166-ccf0-4375-a6c4-f658b56f6e51")
    @Override
    public boolean isViolated(T context) {
        return (context.getLocations().size() == 0);
    }

    @objid ("b14cbad1-f2ac-4655-909e-33bd2dab4f1e")
    @Override
    public String getDescription(T elt) {
        return "LocationRequirement : " + elt.getName() + " must be related to at least one Location.";
    }

    @objid ("3988e08a-08f1-46bf-966c-cd54aa0b4280")
    @Override
    public String getRuleId() {
        return Rule0803.RULEID;
    }

    @objid ("693a410d-b2e7-4032-ace4-43d29626a3cb")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
