package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("aa24d2e7-f569-496b-995e-128266c1c192")
public class Rule0812<T extends ResourceRequirement> extends AbstractRule<T> {
    @objid ("259e1290-dff0-4e39-b321-662d32b9afb2")
    private static final String RULEID = "R0812";

    @objid ("1f31323d-0395-484b-a9ab-8d505dfb36b5")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'ResourceRequirement: ' + self.name + ' should have at least one feature or attribute being specified',
        //            status : Boolean =
        //                        asError(self.subFeatures->size() > 0 or self.attributes->size() > 0)
        //        }.status
        return false;
    }

    @objid ("acd8fc84-5127-4910-a921-4776786e4c05")
    @Override
    public String getDescription(T elt) {
        return "ResourceRequirement : " + elt.getName() + " must specified one priority.";
    }

    @objid ("d03283cb-d6ae-4e7b-bb73-4206763962df")
    @Override
    public String getRuleId() {
        return Rule0812.RULEID;
    }

    @objid ("39c576a0-2a04-4615-9571-ceb63772dd5d")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
