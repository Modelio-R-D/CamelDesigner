package fr.softeam.cameldesigner.audit.rule.mms;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("57b51b32-2869-4df6-aee8-d805633c44ca")
public class Rule0207<T extends MmsPropertyInstance> extends AbstractRule<T> {
    @objid ("ea2545db-6fb8-4286-abbd-6f3334cc5b45")
    private static final String RULEID = "R0207";

    @objid ("5400f734-fbc5-4723-b15b-a11c1252a188")
    @Override
    public boolean isViolated(T context) {
        String value = context.getElement().getValue();
        return ( (value == null) || (value.equals("")));
    }

    @objid ("34345664-5b18-4abd-bdb6-3de0c4d0fff4")
    @Override
    public String getDescription(T elt) {
        return "The MsmPropertyInstance: " + elt.getName() + " must have a value";
    }

    @objid ("49fa9393-e56a-4580-bbbf-0a0ff7fb0f02")
    @Override
    public String getRuleId() {
        return Rule0207.RULEID;
    }

    @objid ("44b10d74-66b2-4ed1-b316-83c2e0526c1f")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
