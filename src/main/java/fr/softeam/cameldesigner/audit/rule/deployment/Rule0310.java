package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("3263f5f7-1eec-4bee-866d-67b0fc5edced")
public class Rule0310<T extends CommunicationInstance> extends AbstractRule<T> {
    @objid ("4186bc1a-e53b-4933-abf6-2c44cec2552c")
    private static final String RULEID = "R0310";

    @objid ("ed1215f8-e625-4c70-950f-f5a25d77109f")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("82c39a88-5c69-4178-8704-0173f46bf587")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("19e5e118-877d-452a-b7b5-2cb4175fcaf9")
    @Override
    public String getRuleId() {
        return Rule0310.RULEID;
    }

    @objid ("f9e410e5-95ed-4d0a-9d6a-6fa993f96096")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
