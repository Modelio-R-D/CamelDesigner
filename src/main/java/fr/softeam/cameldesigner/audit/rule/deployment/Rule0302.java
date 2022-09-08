package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("3d1c4aab-eca7-41ab-ac6f-9dfe56081f1c")
public class Rule0302<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("58646d1e-30ae-43a6-9b1a-5e6780458f24")
    private static final String RULEID = "R0302";

    @objid ("a425f098-bdc7-4cd0-8361-c55e457a2756")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("a4c19f10-9ca6-4f2f-ba7f-9e18736930e0")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("aee3def3-419e-4b23-8283-dc260c9b8bc3")
    @Override
    public String getRuleId() {
        return Rule0302.RULEID;
    }

    @objid ("175fbc04-e699-49a0-b3ca-189dfa99ee80")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
