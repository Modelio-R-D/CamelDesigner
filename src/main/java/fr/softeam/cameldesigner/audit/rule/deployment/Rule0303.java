package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("25911e10-feb6-4c2d-9a83-a6349751af85")
public class Rule0303<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("8f0a0798-bafa-44f3-b225-981926cd802e")
    private static final String RULEID = "R0303";

    @objid ("36d1753d-b2a3-4675-bb72-60f3b28dc58b")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("218c6d64-8895-4c98-bb1b-3bcc7f83f2d9")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("1b8524b4-2c6d-46b4-a40d-8d86b1a11104")
    @Override
    public String getRuleId() {
        return Rule0303.RULEID;
    }

    @objid ("e173c8f3-ba9b-4c6b-92be-7688641d518c")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
