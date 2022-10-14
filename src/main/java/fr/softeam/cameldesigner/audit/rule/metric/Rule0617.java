package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("26f7edc6-bebd-4511-a7ab-36327312d7e0")
public class Rule0617<T extends Window> extends AbstractRule<T> {
    @objid ("868631fe-caea-4cd3-b612-61a5aa65eeb9")
    private static final String RULEID = "R0617";

    @objid ("f4c7e7e1-bb1e-44a0-83a0-1f1865825f08")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getSizeType());
    }

    @objid ("a0ac7c31-ca48-478c-bfde-2f4902403eed")
    @Override
    public String getDescription(T elt) {
        return "Window : " + elt.getName() + " must have a specified size type";
    }

    @objid ("c33051a5-6412-45ca-844d-8c02a9ef22c3")
    @Override
    public String getRuleId() {
        return Rule0617.RULEID;
    }

    @objid ("86a6cbfd-dd6f-4b3b-98f2-66057ea21013")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
