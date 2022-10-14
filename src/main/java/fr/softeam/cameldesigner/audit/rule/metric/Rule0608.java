package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("8d7ed2c7-0ca0-4037-b88d-dd2f4bf1aadf")
public class Rule0608<T extends MetricVariable> extends AbstractRule<T> {
    @objid ("13dc05f7-3517-48d0-86a7-76703749ffe1")
    private static final String RULEID = "R0608";

    @objid ("a0fd3a5b-0310-42d0-8046-b53a3a6f3403")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'MetricVariable: ' + self.name + ' cannot span both the current configuration and the node candidates',
        //            status : Boolean =
        //                        asError(currentConfiguration = false or onNodeCandidates = false)
        //        }.status
        return false;
    }

    @objid ("d268c311-7899-4472-9d0b-c0a94cf6aa72")
    @Override
    public String getDescription(T elt) {
        return "";
    }

    @objid ("695b733f-ba4c-416e-abfb-275e86f83175")
    @Override
    public String getRuleId() {
        return Rule0608.RULEID;
    }

    @objid ("469f3415-0c6f-4301-966d-5176fb4485ab")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
