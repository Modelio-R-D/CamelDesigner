package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("cfbe4eb1-7124-4b88-89b1-e2a6307ebb18")
public class Rule0809<T extends OptimisationRequirement> extends AbstractRule<T> {
    @objid ("6d93314a-7fd5-4e49-a37d-03146b8f7833")
    private static final String RULEID = "R0809";

    @objid ("68ab8dc3-a5a6-4ffa-8e88-ae0f3c5c69e3")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'In OptimizationRequirement: ' + self.name + ' either a metric context or a metric variable must given',
        //            status : Boolean =
        //                        asError((metricContext <> null and metricVariable = null) xor (metricContext = null and metricVariable <> null))
        //        }.status
        return false;
    }

    @objid ("5b7ec428-1a8d-4688-8355-8655603d386f")
    @Override
    public String getDescription(T elt) {
        return "OptimisationRequirement : " + elt.getName() + " must specified consistantes instance.";
    }

    @objid ("d8a59785-ec3c-4c0e-bc38-1ef5ec36b063")
    @Override
    public String getRuleId() {
        return Rule0809.RULEID;
    }

    @objid ("f8a41e3f-9e62-472d-ad01-2740bc85ace2")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
