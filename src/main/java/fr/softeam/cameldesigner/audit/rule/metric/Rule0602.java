package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("d85ae442-c6b3-4c13-964f-3d174a4a1366")
public class Rule0602<T extends MetricInstance> extends AbstractRule<T> {
    @objid ("d271994b-2045-4d86-b42f-328ed56cda3b")
    private static final String RULEID = "R0602";

    @objid ("aaddab7e-a8e6-4e86-b2a0-75a2f8a658fb")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'Instance: ' + self.name + ' of composite metric:' + self.metricContext.metric.name + 'should have the same execution model as the one of all of its component metric instances',
        //            status : Boolean =
        //                        asError(metricContext.metric.oclIsTypeOf(CompositeMetric)
        //                            implies self.composingMetricInstances->forAll(p | p.objectBinding.executionModel = self.objectBinding.executionModel))
        //        }.status
        return false;
    }

    @objid ("215da604-fe1a-4a53-aad0-eee0f8954f4a")
    @Override
    public String getDescription(T elt) {
        return "";
    }

    @objid ("d077baef-df2a-4f81-8af8-0dd44af6732c")
    @Override
    public String getRuleId() {
        return Rule0602.RULEID;
    }

    @objid ("5bc72b9b-28f7-4164-bff8-16a300a22547")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
