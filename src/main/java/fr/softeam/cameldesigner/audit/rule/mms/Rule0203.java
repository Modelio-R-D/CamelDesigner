package fr.softeam.cameldesigner.audit.rule.mms;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("277e7789-ee92-45f5-9b07-b616e0226eb9")
public class Rule0203<T extends MmsObject> extends AbstractRule<T> {
    @objid ("8a0b1874-8627-4b2d-8c92-63408fd3c133")
    private static final String RULEID = "R0203";

    @objid ("a136ad39-7bd2-4c9c-9968-bbee96b694b0")
    @Override
    public boolean isViolated(T context) {
        String uri = context.getUri();
        return ((uri == null) || (uri.equals("")));
    }

    @objid ("dfc0aa6f-ca71-49c0-9755-ce436dcfaae1")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " does not have any URI.";
    }

    @objid ("5a85e388-4f46-4f71-a8c1-ca9c7810fb31")
    @Override
    public String getRuleId() {
        return Rule0203.RULEID;
    }

    @objid ("f25dfb41-f6f0-471c-95f6-5904aa252240")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
