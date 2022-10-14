package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("c26ec26c-0b71-4210-a3cf-033a6fec0884")
public class Rule0813<T extends PaaSRequirement> extends AbstractRule<T> {
    @objid ("0b858c1c-5b5a-469d-9796-bffae739cf3f")
    private static final String RULEID = "R0813";

    @objid ("fb15f063-2dd9-4594-9522-4f9c244c3b38")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'PaaSRequirement: ' + self.name + ' should have at least one feature or attribute being specified',
        //            status : Boolean =
        //                        asError(self.subFeatures->size() > 0 or self.attributes->size() > 0)
        //        }.status
        return false;
    }

    @objid ("1037de8a-d73b-4a23-9d7d-4d499717503c")
    @Override
    public String getDescription(T elt) {
        return "PaaSRequirement : " + elt.getName() + " must specified one priority.";
    }

    @objid ("c538c5a1-df1d-4136-9aaa-7ea3799767e5")
    @Override
    public String getRuleId() {
        return Rule0813.RULEID;
    }

    @objid ("c57bd444-a135-4bf9-b786-45db37217bc3")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
