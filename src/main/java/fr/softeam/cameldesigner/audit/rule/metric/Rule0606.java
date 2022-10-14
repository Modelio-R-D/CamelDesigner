package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("88b19bcf-efc1-4f40-bef8-c60c4d0d1c46")
public class Rule0606<T extends CompositeMetric> extends AbstractRule<T> {
    @objid ("273f387d-5096-406c-9e4f-10d35b828be4")
    private static final String RULEID = "R0606";

    @objid ("29a0f317-0c24-4fe5-b505-e6398bd541c5")
    @Override
    public boolean isViolated(T context) {
        String formula = context.getFormula();
        return ((formula == null)  || (formula.equals(""))) ;
    }

    @objid ("173b3cfe-ba72-4945-a747-32d626fecfc5")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " CompositeMetric must have a formula.";
    }

    @objid ("f70e3ba1-dbba-4d67-b4f8-138a3ff72a88")
    @Override
    public String getRuleId() {
        return Rule0606.RULEID;
    }

    @objid ("4c782f77-efb4-4c4f-9a1c-24a86fc52e1e")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
