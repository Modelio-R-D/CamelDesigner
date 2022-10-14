package fr.softeam.cameldesigner.audit.rule.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("604830d8-62a8-4c4a-9a15-cc17dfe67bd7")
public class Rule0804<T extends ImageRequirement> extends AbstractRule<T> {
    @objid ("1e1e5485-addb-454b-906d-9442cc85e432")
    private static final String RULEID = "R0804";

    @objid ("e6340109-e806-44a3-8f58-2e54cd103041")
    @Override
    public boolean isViolated(T context) {
        return (context.getImages().size() == 0);
    }

    @objid ("1b369848-d174-495b-8c30-3ffff60e12c2")
    @Override
    public String getDescription(T elt) {
        return "ImageRequirement : " + elt.getName() + " must be related to at least one Image.";
    }

    @objid ("36716878-005f-4359-96c9-ac7961c73d75")
    @Override
    public String getRuleId() {
        return Rule0804.RULEID;
    }

    @objid ("b5676080-4f5f-4269-871d-34e165b25fc5")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
