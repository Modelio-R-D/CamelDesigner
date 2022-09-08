package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("9cc6a0b6-9398-4e6d-a291-1d64723af512")
public class Rule0304<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("60b9d64c-5d6e-4653-ba08-623b7fd029b0")
    private static final String RULEID = "R0301";

    @objid ("06b672f6-bb5a-45b1-9c19-915ec84e5f26")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("785c4fee-0928-4f3a-a3c2-54fe7dc08550")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("1d584c17-6921-4b7e-b442-08085cc002e0")
    @Override
    public String getRuleId() {
        return Rule0304.RULEID;
    }

    @objid ("fcf0814b-a59c-490d-be2a-a98d834fa73e")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
