package fr.softeam.cameldesigner.audit.rule.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("e7413f50-2cb6-4848-be62-da817ac929c8")
public class Rule0000<T extends CamelElement> extends AbstractRule<T> {
    @objid ("f5f24d18-8b0f-4d81-b198-b5d39414c25f")
    private static final String RULEID = "R0000";

    @objid ("b5d32728-7a22-4d46-ac74-ba9711d2cf2f")
    @Override
    public boolean isViolated(T context) {
        return true;
    }

    @objid ("e52c4b1b-35f5-45ca-aa37-b5ab2f0f231b")
    @Override
    public String getDescription(T elt) {
        return "Description test pour l'initialisation du report";
    }

    @objid ("785669ce-54ce-477b-84fc-6ced86e298cd")
    @Override
    public String getRuleId() {
        return Rule0000.RULEID;
    }

    @objid ("c17ed5f9-c504-4443-91f0-f031e7c52639")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(CamelElement.STEREOTYPE_NAME, this);
    }

}
