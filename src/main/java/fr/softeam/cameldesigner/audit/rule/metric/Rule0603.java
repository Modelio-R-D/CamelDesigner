package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("065924f6-1169-4472-8c94-1a2b8750e856")
public class Rule0603<T extends MetricInstance> extends AbstractRule<T> {
    @objid ("2e2f1468-7860-468a-9daf-d232273000c5")
    private static final String RULEID = "R0603";

    @objid ("471ba9e9-6c15-435c-801d-5b9112b07447")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'CompositeMetricInstance: ' + self.name + ' should have component metric instances which map to the component metrics referenced by the composite instance\'s metric',
        //            status : Boolean =
        //                        asError(metricContext.metric.oclIsTypeOf(CompositeMetric)
        //                            implies self.metricContext.metric.oclAsType(CompositeMetric).componentMetrics
        //                            ->forAll(p | self.composingMetricInstances
        //                                ->exists(q | q.metricContext.metric = p))
        //                            and
        //                            self.composingMetricInstances->forAll(inst | self.metricContext.metric.oclAsType(CompositeMetric).componentMetrics->exists(comp | comp = inst.metricContext.metric)))
        //        }.status
        return false;
    }

    @objid ("37dbd44e-df6c-4ac2-8c77-d46dd0b1f68f")
    @Override
    public String getDescription(T elt) {
        return "";
    }

    @objid ("a199572c-ecca-454d-89ae-d9f6319124b9")
    @Override
    public String getRuleId() {
        return Rule0603.RULEID;
    }

    @objid ("e02418e6-5292-4da4-ac1d-9c6e15df70bd")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
