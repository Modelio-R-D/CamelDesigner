package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("1f929a3a-b9f8-4bb3-a2b5-c9cf963dfb81")
public class Rule0810<T extends SoftRequirement> extends AbstractRule<T> {
    @objid ("b9cae5d8-e462-4613-8c1f-169e788905cc")
    private static final String RULEID = "R0810";

    @objid ("a417473b-7f56-4ea3-8490-5e9fc59f8e67")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'Requirement: ' + self.name + ' has a negative priority: ' + self.priority.toString(),
        //            status : Boolean =
        //                        asError(self.priority >= 0.0)
        //        }.status
        return false;
    }

    @objid ("e0fbaaeb-35d5-4167-9dc8-9f54538d4baf")
    @Override
    public String getDescription(T elt) {
        return "SoftRequirement : " + elt.getName() + " must specified consistantes instance.";
    }

    @objid ("8d40d118-4031-47f4-90c1-2dcebe3d1812")
    @Override
    public String getRuleId() {
        return Rule0810.RULEID;
    }

    @objid ("71864286-faf1-4894-af34-b3827522f64b")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
