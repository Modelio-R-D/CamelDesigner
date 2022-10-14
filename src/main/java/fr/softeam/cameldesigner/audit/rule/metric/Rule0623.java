package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("35d9c9c5-53b0-4b94-97ac-31da639a8956")
public class Rule0623<T extends Function> extends AbstractRule<T> {
    @objid ("05512337-0619-4d03-aaeb-4c6c7e18da99")
    private static final String RULEID = "R0623";

    @objid ("2dac1708-188e-44c9-a583-f7b67b7baaa8")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getExpression());
    }

    @objid ("5fbd6b0f-7763-43ad-99e5-eb679cda1e5d")
    @Override
    public String getDescription(T elt) {
        return "Function : " + elt.getName() + " must have an expression.";
    }

    @objid ("0a1f371d-112e-445f-a913-52e4b71bfd1b")
    @Override
    public String getRuleId() {
        return Rule0623.RULEID;
    }

    @objid ("6876c3ce-e25e-4508-9463-2ee4551ba631")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
