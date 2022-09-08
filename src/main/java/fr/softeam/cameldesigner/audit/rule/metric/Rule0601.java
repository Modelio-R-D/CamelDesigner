package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("bd11a2c7-c864-4595-b52e-11c5b37a33d8")
public class Rule0601<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("6b05b81a-0c3b-4b0d-8898-9226fb280e87")
    private static final String RULEID = "R0301";

    @objid ("153527fe-4f5e-4ff9-bf94-83d025f2857c")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("97746b8e-165a-4409-8d97-e071b9a50699")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("bc20cc76-78a2-475e-acdd-f96b497e378f")
    @Override
    public String getRuleId() {
        return Rule0601.RULEID;
    }

    @objid ("5e25013f-2e52-4eff-bb33-06f04354025d")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
