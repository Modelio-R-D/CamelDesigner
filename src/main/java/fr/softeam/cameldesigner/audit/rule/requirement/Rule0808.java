package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("ad78fe89-10a0-4106-a216-f76ac782842b")
public class Rule0808<T extends VerticalScaleRequirement> extends AbstractRule<T> {
    @objid ("5caa3c7d-c290-4715-8790-23d9701634d1")
    private static final String RULEID = "R0808";

    @objid ("e43773f0-4aee-42af-bbb2-bf62e3f7429f")
    @Override
    public boolean isViolated(T context) {
        //        Tuple {
        //            message : String = 'VerticalScaleRequirement: ' + self.name + ' should have at least one feature or attribute being specified',
        //            status : Boolean =
        //                        asError(self.subFeatures->size() <> 0 xor self.attributes->size() <> 0)
        //        }.status
        return false;
    }

    @objid ("c150cab0-e135-4e22-a478-f4b10eadcc9a")
    @Override
    public String getDescription(T elt) {
        return "VerticalScaleRequirement : " + elt.getName() + " must specified consistantes instance.";
    }

    @objid ("c5cfd237-622a-4059-ab97-a70cbde61fad")
    @Override
    public String getRuleId() {
        return Rule0808.RULEID;
    }

    @objid ("3e32aadb-7e6c-4999-b9ac-a5bb0db4b722")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
