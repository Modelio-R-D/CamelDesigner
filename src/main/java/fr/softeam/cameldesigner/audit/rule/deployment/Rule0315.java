package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("bc921a29-120c-47ff-8d85-f49d4c1baf7b")
public class Rule0315<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("2bf41e0b-e837-4819-bf51-d460d11fbeeb")
    private static final String RULEID = "R0301";

    @objid ("64a20db2-80ff-465b-8391-3de4c904477f")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("c9434922-f571-4d2b-8436-d3a51f56f5c1")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("7276f602-7ac7-40ec-ba80-11d38dac1565")
    @Override
    public String getRuleId() {
        return Rule0315.RULEID;
    }

    @objid ("8323a8eb-e085-4176-b741-a4988842c99b")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
