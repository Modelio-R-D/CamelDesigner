package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("c56fa63d-a4ac-434a-ace0-ef2f4cb27b25")
public class Rule0801<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("53bf269a-aa2b-4e79-8ae7-cccf7617ba49")
    private static final String RULEID = "R0301";

    @objid ("61049f6d-25eb-4780-8d02-3e288dd9d865")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("04f87a08-b7cd-48a8-9531-c63e3314361c")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("ec0ae2c3-2758-4ec4-bd0b-740dba2ec24f")
    @Override
    public String getRuleId() {
        return Rule0801.RULEID;
    }

    @objid ("ea60f2fe-3ce1-4cd5-ade2-da8f47f85f2d")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
