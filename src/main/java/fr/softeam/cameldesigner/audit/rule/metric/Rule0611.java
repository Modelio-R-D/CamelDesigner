package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("348bfd54-2d52-4a40-a334-1cfa693d54eb")
public class Rule0611<T extends Schedule> extends AbstractRule<T> {
    @objid ("52e72552-94fe-4c17-936d-8de84fd6d198")
    private static final String RULEID = "R0611";

    @objid ("78489a88-ce79-4407-a3c4-c55071d65236")
    @Override
    public boolean isViolated(T context) {
        return (context.getTimeUnit() == null);
    }

    @objid ("07af3779-0157-409b-9537-ea45d0c3fc8a")
    @Override
    public String getDescription(T elt) {
        return "Schedule : " + elt.getName() + " must have a related TimeUnit";
    }

    @objid ("880fc4d1-71ae-49aa-bc0d-5eadd6c7c7c9")
    @Override
    public String getRuleId() {
        return Rule0611.RULEID;
    }

    @objid ("2a8b40a3-dbf9-43ee-bdbe-ffc4822184cd")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
