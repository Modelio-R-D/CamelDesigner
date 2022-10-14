package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("b58cd53d-ea65-4e81-9ee7-a4c0b868aecc")
public class Rule0605<T extends Metric> extends AbstractRule<T> {
    @objid ("5c23ff02-1560-41cd-a7f0-d2d686532de1")
    private static final String RULEID = "R0605";

    @objid ("f817df2f-2199-457c-bc97-97354636a611")
    @Override
    public boolean isViolated(T context) {
        //        System.out.println("Checking recursiveness for Metric: " + mt1.getName());
        //        camel.metric.CompositeMetric m1 = (camel.metric.CompositeMetric)mt1;
        //        for (camel.metric.Metric mt: m1.getComponentMetrics()){
        //                if (mt.getName().equals(mt2.getName())) return Boolean.TRUE;
        //                if (mt instanceof camel.metric.CompositeMetric && checkRecursiveness(mt,mt2)) return Boolean.TRUE;
        //        }
        //        return Boolean.FALSE;
        return false;
    }

    @objid ("18d4027e-605c-4082-b756-d3024f1e44d6")
    @Override
    public String getDescription(T elt) {
        return "";
    }

    @objid ("cb17bc49-c8ab-4baf-91ff-70f2093c62d9")
    @Override
    public String getRuleId() {
        return Rule0605.RULEID;
    }

    @objid ("e195c860-943d-4a4b-b340-affd47e1a603")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
