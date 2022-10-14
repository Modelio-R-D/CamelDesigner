package fr.softeam.cameldesigner.audit.rule.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("4895dd5a-4426-4627-a48c-b28a7bb68364")
public class Rule1403<T extends DataSourceInstance> extends AbstractRule<T> {
    @objid ("f9108389-ab18-4246-8d28-f7d9ef5b1f73")
    private static final String RULEID = "R1402";

    @objid ("767157a3-4aa5-4dfb-930d-87acc13c0b5c")
    @Override
    public boolean isViolated(T context) {
        return (context.getType() == null);
    }

    @objid ("bef62cdb-c443-421a-adb8-d8d1c353366f")
    @Override
    public String getDescription(T elt) {
        return "Type of " + elt.getName() + " has not been defined.";
    }

    @objid ("9d6e1cc9-247a-42d8-81ef-3d85956476f1")
    @Override
    public String getRuleId() {
        return Rule1403.RULEID;
    }

    @objid ("6c58d5a9-df2c-4c90-b0a8-6f7d7f33b425")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
