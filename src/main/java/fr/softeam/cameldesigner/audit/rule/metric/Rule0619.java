package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("dbd4b6fd-fd32-40a5-a96a-4d893a8327af")
public class Rule0619<T extends Window> extends AbstractRule<T> {
    @objid ("280c7561-91e3-4279-a16a-b5c296c9a9d8")
    private static final String RULEID = "R0619";

    @objid ("32df242c-0533-405d-bf90-411bd094e193")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getTimeSize());
    }

    @objid ("cd94aa19-73e0-4008-a80a-6aef0dd1fd51")
    @Override
    public String getDescription(T elt) {
        return "Window : " + elt.getName() + " must have a specified time size.";
    }

    @objid ("9f07f40a-a3fe-444e-9b9a-5a8460d23da0")
    @Override
    public String getRuleId() {
        return Rule0619.RULEID;
    }

    @objid ("49ce46d5-4794-46d5-a9e6-37d56c358df6")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
