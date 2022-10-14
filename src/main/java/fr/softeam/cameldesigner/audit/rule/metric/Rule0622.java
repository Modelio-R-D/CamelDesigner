package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("acbca515-a20c-4097-97ed-44c1af372f30")
public class Rule0622<T extends AttributeContext> extends AbstractRule<T> {
    @objid ("3a2daa28-5435-45bf-8cda-d3590cb3ea3f")
    private static final String RULEID = "R0622";

    @objid ("db405b72-5da6-4e78-90a3-e4fd535cfafc")
    @Override
    public boolean isViolated(T context) {
        return (context.getAttribute() == null);
    }

    @objid ("c3bf0718-6a4a-453c-8159-3af2e8e0cb26")
    @Override
    public String getDescription(T elt) {
        return "AttributeContext : " + elt.getName() + " must have a related Attribute.";
    }

    @objid ("fc17ef21-4de2-4f76-8785-68389dd0fb8e")
    @Override
    public String getRuleId() {
        return Rule0622.RULEID;
    }

    @objid ("9cb7adca-9ebc-4eac-9474-73cd72cd0cb0")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
