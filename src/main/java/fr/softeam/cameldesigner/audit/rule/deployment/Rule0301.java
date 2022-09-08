package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("40f96f5a-60c5-43ce-b68d-f594a9f4cc16")
public class Rule0301<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("af2d6fee-76a1-47c1-bf9a-5afb0ea5ef85")
    private static final String RULEID = "R0301";

    @objid ("ef1b65be-53e3-4e77-b037-ae434ff08126")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("e4dfa313-9ab6-4734-a081-1284301c7da7")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("d13ff403-5064-44ce-aafd-704fe894ef2a")
    @Override
    public String getRuleId() {
        return Rule0301.RULEID;
    }

    @objid ("b4e2ac30-a4f1-463d-a01f-45bc89104cb3")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
