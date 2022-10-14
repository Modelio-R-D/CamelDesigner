package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("f8b26b87-ac48-44e4-a2f6-cfeb41a8f8f8")
public class Rule0616<T extends Window> extends AbstractRule<T> {
    @objid ("57d5f779-81c5-4142-983c-ffcb8a6316a6")
    private static final String RULEID = "R0616";

    @objid ("9fea0378-e304-41cd-8395-b079ec957c57")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getWindowType());
    }

    @objid ("01e815e0-b89d-4169-bdad-8dc5b56b5d8e")
    @Override
    public String getDescription(T elt) {
        return "Window : " + elt.getName() + " must have a specified Window type";
    }

    @objid ("67c76cf1-d6de-43e2-9e40-057f49f0243b")
    @Override
    public String getRuleId() {
        return Rule0616.RULEID;
    }

    @objid ("fdb49fd2-26d7-4319-95c6-6d3c7f351231")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
