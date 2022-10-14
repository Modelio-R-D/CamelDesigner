package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("d4673439-96a9-4180-818b-86e6e8f9f5a3")
public class Rule0607<T extends CompositeMetric> extends AbstractRule<T> {
    @objid ("c22764dd-65f2-42ff-a3d5-c7e890f0c903")
    private static final String RULEID = "R0607";

    @objid ("b806c642-8dac-4001-bef9-ddaa75edcd6b")
    @Override
    public boolean isViolated(T context) {
        org.modelio.metamodel.uml.statik.Class self = context.getElement();
        for (Metric comp : context.getComponentMetrics()) {
            if (comp.getElement().equals(self))
                    return true;
        }
        return false;
    }

    @objid ("cde52103-b386-40b4-aa3d-ef8956d5e4c6")
    @Override
    public String getDescription(T elt) {
        return "CompositeMetric: " + elt.getName() + " should not contain itself recursively.";
    }

    @objid ("28be3d10-8f88-4911-8b40-fe18b2897345")
    @Override
    public String getRuleId() {
        return Rule0607.RULEID;
    }

    @objid ("7816090d-9de7-452e-bfe8-5d9b164170f6")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
