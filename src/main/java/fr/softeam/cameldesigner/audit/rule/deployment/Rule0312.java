package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("66c09c28-51d7-433e-b354-07becef651cc")
public class Rule0312<T extends HostingInstance> extends AbstractRule<T> {
    @objid ("4cfdf8e3-34fa-4920-8c72-4b09e14730a7")
    private static final String RULEID = "R0312";

    @objid ("2239081d-db9c-4fad-9f61-301e7f372b6a")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("8937387b-c9bc-4365-b20c-d5df89090c64")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("4031326e-1edf-40e9-a874-fe829c9ae3c7")
    @Override
    public String getRuleId() {
        return Rule0312.RULEID;
    }

    @objid ("e1e92bb4-6c22-490e-8d5a-a5f683cfe008")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
