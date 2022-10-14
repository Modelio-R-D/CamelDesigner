package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("22b4927e-127e-4bee-ba56-5c4ed23cf508")
public class Rule0807<T extends HorizontalScaleRequirement> extends AbstractRule<T> {
    @objid ("fd746585-8382-4de7-aa20-ee6ab3e2f654")
    private static final String RULEID = "R0807";

    @objid ("7cf31514-5981-4ec9-b73e-12e7a3c97566")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'HorizontalScaleRequirement: ' + self.name + ' has wrong values for the minInstances and/or maxInstance properties. The minInstances value should be non-negative, the maxInstances value positive or equal to -1, and when maxInstances value is positive, then minInstances value should not be greater than it',
        //            status : Boolean =
        //                         asError(self.minInstances >= 0 and (self.maxInstances > 0 or self.maxInstances = - 1) and
        //                        (self.maxInstances <> - 1 implies self.minInstances<= self.maxInstances))
        //        }.status
        return false;
    }

    @objid ("b74a1478-361e-49fe-a6bd-4a7e1f311e53")
    @Override
    public String getDescription(T elt) {
        return "HorizontalScaleRequirement : " + elt.getName() + " must specified consistantes instance.";
    }

    @objid ("6c9173c0-92c2-4cd8-a3d1-ff549d84766a")
    @Override
    public String getRuleId() {
        return Rule0807.RULEID;
    }

    @objid ("6223d390-8c95-46fa-818b-3904e5b9980f")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
