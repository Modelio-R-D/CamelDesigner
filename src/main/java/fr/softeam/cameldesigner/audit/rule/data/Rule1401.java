package fr.softeam.cameldesigner.audit.rule.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("32026d8b-5b1c-41f9-9cba-8d09798a7bee")
public class Rule1401<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("f15cf11f-ff90-42c8-b183-54846f4abd1d")
    private static final String RULEID = "R0301";

    @objid ("d8521654-0009-40d0-9f71-a0641a3ec181")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("48752796-0749-4459-9464-a963d9af6f2c")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("8f923eed-454f-4fa7-83fe-72c3bf55c728")
    @Override
    public String getRuleId() {
        return Rule1401.RULEID;
    }

    @objid ("504b759e-d96e-4eda-b2b4-b9bfa190d629")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
