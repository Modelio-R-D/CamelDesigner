package fr.softeam.cameldesigner.audit.rule.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("27e66079-e9b1-4974-bcae-80eba9cf69c8")
public class Rule0102<T extends CamelModel> extends AbstractRule<T> {
    @objid ("8f901f97-271c-4050-a935-ea9549a3671c")
    private static final String RULEID = "R0102";

    @objid ("d7fee5e3-1713-469e-b992-8012b8c70863")
    @Override
    public boolean isViolated(T context) {
        String appName = context.getApplicationName();
        String appVersion = context.getApplicationVersion();
        if ((appName != null) && (appVersion != null)) {
            return ((appVersion.equals("") && (!(appName.equals(""))))
                    || (appName.equals("") && (!(appVersion.equals("")))));
        }else {
            return false;
        }
    }

    @objid ("2cb0833f-a67a-4de3-a810-97281c05b7c2")
    @Override
    public String getDescription(T elt) {
        return "Both application name and version must be set";
    }

    @objid ("8bcc9ee0-a99c-4343-890d-7c24743d9d8a")
    @Override
    public String getRuleId() {
        return Rule0102.RULEID;
    }

    @objid ("c5f3bf78-a3d9-438b-a6d7-32e9f9dbb721")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
