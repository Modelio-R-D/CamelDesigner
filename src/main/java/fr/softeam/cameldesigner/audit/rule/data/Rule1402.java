package fr.softeam.cameldesigner.audit.rule.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("ddf05d0b-1ded-429c-b069-49508fbccecd")
public class Rule1402<T extends DataInstanceModel> extends AbstractRule<T> {
    @objid ("a123fd92-70c8-4df4-ac7a-67848f92adfb")
    private static final String RULEID = "R1402";

    @objid ("482d4484-af13-4544-8a74-53daf0c74c6e")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("a762331b-4941-4fee-94ec-19faa483a7a4")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("78aadb67-b92c-4b9d-bced-dbaeaa56a69a")
    @Override
    public String getRuleId() {
        return Rule1402.RULEID;
    }

    @objid ("b70dba1f-5d96-4b5c-bda4-53a8c66a2836")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
