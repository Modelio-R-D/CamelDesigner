package fr.softeam.cameldesigner.audit.rule.mms;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("e4a528d1-863b-47c8-b300-9962953b2980")
public class Rule0205<T extends MmsPropertyInstance> extends AbstractRule<T> {
    @objid ("926b20e7-62f2-424a-94d9-6f1ba287abc8")
    private static final String RULEID = "R0205";

    @objid ("ed1c6142-d920-4202-9df7-a704bfac0f83")
    @Override
    public boolean isViolated(T context) {
        return context.getConceptInstance().getElement().getCompositionOwner().equals(context.getIsA().getDomain());
    }

    @objid ("1bb49d3e-b9da-4580-ba8c-a12d63ede75e")
    @Override
    public String getDescription(T elt) {
        return "The type of the domain of MsmPropertyInstance: " + elt.getName() + "should correspond to the domain of it\'s type";
    }

    @objid ("8402e07d-9d50-4772-9109-3956118b45a0")
    @Override
    public String getRuleId() {
        return Rule0205.RULEID;
    }

    @objid ("71dddd23-fc3f-48b1-9c64-fb3a82e442f5")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
