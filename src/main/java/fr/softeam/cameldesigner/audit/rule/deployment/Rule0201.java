package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("b8248b06-5628-449d-9fd8-e52f9511cd6f")
public class Rule0201<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("51779dab-973f-4d3c-83a3-516d54923865")
    private static final String RULEID = "R0201";

    @objid ("6e154b5e-229a-4526-81bd-fc078c822459")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("90cc0e05-6726-4d94-b6c5-608fa299357f")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("c70ea44b-0c9d-4261-84de-108933c8b7f9")
    @Override
    public String getRuleId() {
        return Rule0201.RULEID;
    }

    @objid ("d3000993-befe-4a36-ae1d-6d12cbd5dd4b")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(DeploymentInstanceModel.STEREOTYPE_NAME, this);
    }

}
