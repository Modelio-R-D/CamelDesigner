package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("8b7b8b47-c15c-4595-ac0c-2850520c09c8")
public class Rule0313<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("2de6f69c-d61d-4ef5-aaf3-d48721bd5b16")
    private static final String RULEID = "R0301";

    @objid ("1aa41395-72ab-45c6-9a87-d95e0e299e5f")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("ca851702-9817-4447-a600-02601f86bbde")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("2841e95d-c8b2-489d-9747-d54c127375a1")
    @Override
    public String getRuleId() {
        return Rule0313.RULEID;
    }

    @objid ("a64e6e2f-cad7-4fd1-a49b-0bf3f709d499")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
