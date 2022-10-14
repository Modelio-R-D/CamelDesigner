package fr.softeam.cameldesigner.audit.rule.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("5d07a628-3c45-40c8-b104-26f2c3c9a980")
public class Rule0501<T extends Location> extends AbstractRule<T> {
    @objid ("8353502b-f6b7-4042-9daf-ee9498ebcd18")
    private static final String RULEID = "R0501";

    @objid ("addb1e31-f32b-4fcf-a784-4c285110ad88")
    @Override
    public boolean isViolated(T context) {
        String id = context.getId();
        return ((id == null) || (id.equals("")));
    }

    @objid ("e51a7947-27f5-4870-afef-66555a68d85f")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " Location must have an ID.";
    }

    @objid ("34094b3d-9686-4cfe-9edc-4aa0c1caf28f")
    @Override
    public String getRuleId() {
        return Rule0501.RULEID;
    }

    @objid ("443ada0b-e0b6-4198-92c9-28779479382f")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
