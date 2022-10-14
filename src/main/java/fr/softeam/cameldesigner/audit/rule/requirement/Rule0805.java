package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("cb953698-7b41-4c0b-8455-5d45c7764362")
public class Rule0805<T extends HorizontalScaleRequirement> extends AbstractRule<T> {
    @objid ("e5d1879c-dba9-4e3d-90aa-1cbb3f42483d")
    private static final String RULEID = "R0805";

    @objid ("af900048-ba33-4b10-ae02-b2170d1887cb")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isNullOrEmpty(context.getMinInstances());
    }

    @objid ("716e2c21-ea5b-48ff-b4de-0b7676850d0d")
    @Override
    public String getDescription(T elt) {
        return "HorizontalScaleRequirement : " + elt.getName() + " must specified one min instance.";
    }

    @objid ("6e6f0209-3615-496f-84d1-4633fa3abfa8")
    @Override
    public String getRuleId() {
        return Rule0805.RULEID;
    }

    @objid ("69ddb2c9-4434-4fe3-8c06-2de07ec51490")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
