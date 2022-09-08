package fr.softeam.cameldesigner.audit.rule.mms;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("77ba0ecd-0104-4863-9ab6-a2c568c12297")
public class Rule0202<T extends MmsObject> extends AbstractRule<T> {
    @objid ("45f6913b-5075-4e4f-accc-a8a6d0e1bd4c")
    private static final String RULEID = "R0202";

    @objid ("97778f8d-8c86-4a2b-ae83-8a38778d0a88")
    @Override
    public boolean isViolated(T context) {
        String id = context.getId();
        return ((id == null) || (id.equals("")));
    }

    @objid ("f7c3cb5f-f119-431c-b198-e2c69dc96f61")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " does not have any id.";
    }

    @objid ("8c1a1d63-0413-44c8-ad61-161fc98d8160")
    @Override
    public String getRuleId() {
        return Rule0202.RULEID;
    }

    @objid ("6a133e06-eb6b-4a8d-9684-303d8f755117")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
