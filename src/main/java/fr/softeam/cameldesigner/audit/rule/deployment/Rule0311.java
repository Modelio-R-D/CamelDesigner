package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("6881c177-cd5e-493b-809e-7e9c114ac333")
public class Rule0311<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("1cb30a8a-86e7-40d6-b26b-dabc9c59af5e")
    private static final String RULEID = "R0301";

    @objid ("518aaa06-6e9a-44d8-b812-a053ae0b14b7")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("6e7d9218-6e82-4dbc-9d88-2335f9a2f3a0")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("a336a7d0-2037-4a17-83d7-bd634ce46d8d")
    @Override
    public String getRuleId() {
        return Rule0311.RULEID;
    }

    @objid ("3ac48545-464a-4bc8-8972-3e145d4139c3")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
