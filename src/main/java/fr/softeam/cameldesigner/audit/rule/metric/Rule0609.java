package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("a03afcb9-031d-4b2b-b468-fb1ec4f47941")
public class Rule0609<T extends MetricVariable> extends AbstractRule<T> {
    @objid ("43dadf5c-9c9b-4fb7-91e5-e901da6aed5f")
    private static final String RULEID = "R0610";

    @objid ("f8dea46c-66ca-4493-a4bf-03a14dc37a39")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'MetricVariable: ' + self.name + ' should not contain recursively itself'
        //                    ,
        //            status : Boolean = asError(not self.containsMetric(self))
        //        }.status
        return false;
    }

    @objid ("5f4d347a-de2a-4573-ab68-8deee3aeaf1a")
    @Override
    public String getDescription(T elt) {
        return "";
    }

    @objid ("bb9006b7-7d8c-41e2-b2fe-7817eef15f89")
    @Override
    public String getRuleId() {
        return Rule0609.RULEID;
    }

    @objid ("1ca37cb7-8e11-4fa0-9307-77e084ffe564")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
