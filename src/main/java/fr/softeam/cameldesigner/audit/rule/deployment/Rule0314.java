package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("b21ce8b3-9c4d-4be8-8a03-6da991fa0dde")
public class Rule0314<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("6a2434e0-d854-4649-9e67-a16ee71bf26c")
    private static final String RULEID = "R0301";

    @objid ("709a380c-6150-45fe-8e02-daf36a5aa8bd")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("f68c7ae1-f4df-4122-92f3-bfd38fcc8d6e")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("ca966aa6-c332-48ba-95b5-b75ed7e82b31")
    @Override
    public String getRuleId() {
        return Rule0314.RULEID;
    }

    @objid ("0aa23848-ab93-43d8-bdb0-4448a2fc3b82")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
