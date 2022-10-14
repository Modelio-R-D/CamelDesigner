package fr.softeam.cameldesigner.audit.rule.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("cbaf950c-f5b7-4d8b-b5e3-a236d5e3432f")
public class Rule1305<T extends IfThenConstraint> extends AbstractRule<T> {
    @objid ("e4f81520-ae6b-4b8a-8381-bed4e80e79cd")
    private static final String RULEID = "R1305";

    @objid ("21c45d63-0b8e-44ae-8fed-9c08b2265170")
    @Override
    public boolean isViolated(T context) {
        CamelConstraint ifConstraint = context.getIf();
        return (ifConstraint  == null);
    }

    @objid ("13bfcae0-a105-4a8c-bbac-6ae44e4a7673")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " is not related to an IfConstraint.";
    }

    @objid ("f821730d-b5f8-41b2-8e08-2562ee63f56d")
    @Override
    public String getRuleId() {
        return Rule1305.RULEID;
    }

    @objid ("b17c7f30-ed64-4328-aca4-2a3debc3dea8")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
