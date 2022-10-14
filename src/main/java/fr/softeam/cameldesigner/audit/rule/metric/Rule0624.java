package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("b666a537-814e-4104-9a25-df00c1c952d7")
public class Rule0624<T extends Function> extends AbstractRule<T> {
    @objid ("a01a9910-5638-470f-8804-fe71bc8f0928")
    private static final String RULEID = "R0624";

    @objid ("9ce741d9-0b13-4558-ae29-c97c1934d209")
    @Override
    public boolean isViolated(T context) {
        return context.getArguments().size() == 0;
    }

    @objid ("e227efce-8cbb-4467-89d8-263b252e78d6")
    @Override
    public String getDescription(T elt) {
        return "Function : " + elt.getName() + " must have at least one arguments.";
    }

    @objid ("5af10dcc-5319-4b0c-89fb-87cbab9b7773")
    @Override
    public String getRuleId() {
        return Rule0624.RULEID;
    }

    @objid ("d3e59ba9-11ec-43be-8a26-2ac629ba0987")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
