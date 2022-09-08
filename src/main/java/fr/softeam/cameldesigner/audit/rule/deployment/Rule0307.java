package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("85cd39a6-ad84-4e2b-8b89-5d997df3a1e3")
public class Rule0307<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("0ee8c167-b294-44da-8f72-aa70995e10b9")
    private static final String RULEID = "R0301";

    @objid ("74af2802-ac20-4aa4-969d-01de2588d50f")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("1ac7fff6-58a4-418d-9201-39ba866fcafc")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("c60e6b8d-bf08-4d5b-90ad-faaaa2928517")
    @Override
    public String getRuleId() {
        return Rule0307.RULEID;
    }

    @objid ("a81dd432-cab0-4b67-8d8c-a9e584be8a77")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
