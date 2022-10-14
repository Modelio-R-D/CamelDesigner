package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("c0e665dd-48bc-4668-ab7e-8165ddb414db")
public class Rule0610<T extends MetricObjectBinding> extends AbstractRule<T> {
    @objid ("b95e8ce4-4e40-41e6-8bb4-c48fa417b5c9")
    private static final String RULEID = "R0610";

    @objid ("c43f36cf-4496-43eb-ba86-567858c0d7ee")
    @Override
    public boolean isViolated(T context) {
        return (context.getExecutionModel() == null);
    }

    @objid ("d67fe2a1-60f8-4b07-86c4-2e51c674ddc4")
    @Override
    public String getDescription(T elt) {
        return "MetricObjectBinding " + elt.getName() + " must be related to one ExecutionModel";
    }

    @objid ("cdccddba-6a6d-46b5-af03-c1850dbc3701")
    @Override
    public String getRuleId() {
        return Rule0610.RULEID;
    }

    @objid ("38673b82-2a2b-4ca3-b5ba-b316e0c2bfb9")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
