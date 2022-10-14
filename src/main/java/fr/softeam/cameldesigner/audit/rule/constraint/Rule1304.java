package fr.softeam.cameldesigner.audit.rule.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("d19f3cae-2bf5-411d-87df-d65b04b36000")
public class Rule1304<T extends AttributeConstraint> extends AbstractRule<T> {
    @objid ("3454a330-0794-4492-9bad-b8506abdc23f")
    private static final String RULEID = "R1304";

    @objid ("01734a39-f4bd-4161-821c-b92259df614e")
    @Override
    public boolean isViolated(T context) {
        return (!(AttributeContext.canInstantiate(context.getElement().getCompositionOwner())));
    }

    @objid ("b60f6aca-a15c-435d-8a8c-9dd9941d20b3")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " is not related to an AttributeContext.";
    }

    @objid ("03c8075d-8398-43e2-8d00-d6d04bb566ef")
    @Override
    public String getRuleId() {
        return Rule1304.RULEID;
    }

    @objid ("799be777-bf3a-46c8-aea1-757eb4ecbde0")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
