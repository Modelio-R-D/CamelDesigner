package fr.softeam.cameldesigner.audit.rule.mms;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("481f80c5-3f66-43ac-9755-0464663518d8")
public class Rule0206<T extends MmsPropertyInstance> extends AbstractRule<T> {
    @objid ("f2144e12-1b68-4295-98d7-9d7211025873")
    private static final String RULEID = "R0206";

    @objid ("172ebacb-db84-4b05-8415-16167728b8f5")
    @Override
    public boolean isViolated(T context) {
        return (context.getIsA() == null);
    }

    @objid ("5303fefe-311b-459a-90e4-53a3e7241f29")
    @Override
    public String getDescription(T elt) {
        return "The isA relation of the MsmPropertyInstance: " + elt.getName() + " must be fulfilled";
    }

    @objid ("d13680e8-8ba1-4425-8f89-29088fad1bc5")
    @Override
    public String getRuleId() {
        return Rule0206.RULEID;
    }

    @objid ("c99c9764-9498-4e88-859d-4f0de74a778c")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
