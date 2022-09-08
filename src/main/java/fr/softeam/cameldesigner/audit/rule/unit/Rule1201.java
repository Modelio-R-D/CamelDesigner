package fr.softeam.cameldesigner.audit.rule.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("0e54eadd-ffad-48be-b6f0-254cb0c615a7")
public class Rule1201<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("0d549624-edeb-4538-84c1-744a16c0d2bd")
    private static final String RULEID = "R0301";

    @objid ("32078184-e707-400e-b9fb-ced4f0cb7440")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("b40d0708-af50-4201-be80-a47ab4eab713")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("30fb4382-08a4-46f2-99e0-b4aeb3c9f68e")
    @Override
    public String getRuleId() {
        return Rule1201.RULEID;
    }

    @objid ("e6f87335-80a1-4210-9ee9-d2cd878fdddf")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
