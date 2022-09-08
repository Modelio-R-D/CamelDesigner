package fr.softeam.cameldesigner.audit.rule.mms;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("0fd02860-0c74-4f91-b8dd-76d8f0d5a9b3")
public class Rule0204<T extends MmsObject> extends AbstractRule<T> {
    @objid ("9edb8aa5-178c-45f3-96e7-1ccf3e621e89")
    private static final String RULEID = "R0204";

    @objid ("689d1504-239a-47b0-9b67-8aad472fd5b0")
    @Override
    public boolean isViolated(T context) {
        return (context.getName().equals(""));
    }

    @objid ("5545ce06-861c-4ee9-9b00-4ba9424aab11")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " does not have a name.";
    }

    @objid ("46882912-16aa-4656-b003-93800258fdfd")
    @Override
    public String getRuleId() {
        return Rule0204.RULEID;
    }

    @objid ("521c40cb-bde2-4bd4-8a69-0a5572b6915c")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
