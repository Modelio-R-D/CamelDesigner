package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("078e958b-19ee-4806-abf9-c81a03662e44")
public class Rule0308<T extends VMInstance> extends AbstractRule<T> {
    @objid ("06c3e0ba-09f4-4ab1-adc7-385bf37c809a")
    private static final String RULEID = "R0308";

    @objid ("29f21bca-c4b4-41c3-bd20-2e1ef7067f31")
    @Override
    public boolean isViolated(T context) {
        return (context.getLocation() == null);
    }

    @objid ("9edcea11-cbac-481c-b0c0-1cdc8d0b0371")
    @Override
    public String getDescription(T elt) {
        return "Location of " + elt.getName() + " has not been defined.";
    }

    @objid ("49c87319-02ac-479f-8696-305227da4718")
    @Override
    public String getRuleId() {
        return Rule0308.RULEID;
    }

    @objid ("546941ef-968a-41c4-a0d7-47eb4df0fa38")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
