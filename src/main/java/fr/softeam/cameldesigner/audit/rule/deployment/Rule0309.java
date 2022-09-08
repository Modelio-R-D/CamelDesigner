package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("d33ab5e7-a5d7-4560-99a3-c612141466f4")
public class Rule0309<T extends DeploymentInstanceModel> extends AbstractRule<T> {
    @objid ("6688c0a5-bd57-4935-baf5-1c36b2afbd61")
    private static final String RULEID = "R0301";

    @objid ("250a038c-bced-470c-88dd-a68f75749e93")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("0a8a8e23-f90e-48e6-bbe6-e96b510b0223")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("4ada77d9-8c1f-4778-a76d-b93fdce4f69d")
    @Override
    public String getRuleId() {
        return Rule0309.RULEID;
    }

    @objid ("6d45ef0d-96b5-407b-b351-3b497667d297")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
