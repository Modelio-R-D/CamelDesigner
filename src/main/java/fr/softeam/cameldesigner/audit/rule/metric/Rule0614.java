package fr.softeam.cameldesigner.audit.rule.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("dacbe6b4-ebdf-4ac7-bb6f-d478e0433ea4")
public class Rule0614<T extends Schedule> extends AbstractRule<T> {
    @objid ("a37d9a81-5e17-46a9-9e5f-13e674ba488c")
    private static final String RULEID = "R0614";

    @objid ("c574fd61-5c60-4c90-acd6-dc945f4b1d84")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'Schedule: ' + self.name + ' should have a correct interval',
        //            status : Boolean =
        //                        asError(interval >0)
        //        }.status
        return false;
    }

    @objid ("a64e256c-a2a8-4018-9cfe-337ff09de1d0")
    @Override
    public String getDescription(T elt) {
        return "Schedule : " + elt.getName() + " must have a correct interval";
    }

    @objid ("ccdf698c-8436-4b21-9b3c-eaba3929c4e7")
    @Override
    public String getRuleId() {
        return Rule0614.RULEID;
    }

    @objid ("27ffa53f-a535-4aa0-99fa-be0f90497c7b")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
