package fr.softeam.cameldesigner.audit.rule.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import fr.softeam.cameldesigner.utils.StringUtils;

@objid ("93983c2e-8462-4593-8d83-7b2704c87a38")
public class Rule0305<T extends CommunicationPort> extends AbstractRule<T> {
    @objid ("d1dfe966-2e55-470a-8d52-fb18e1f2e625")
    private static final String RULEID = "R0305";

    @objid ("3e291a9b-3fce-4937-956d-280f88bc63fc")
    @Override
    public boolean isViolated(T context) {
        return StringUtils.isInteger(context.getHighPortNumber());
    }

    @objid ("b2bb6871-791f-4803-bd24-09ff743957b9")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " CommunicationPort must have a valid high port number";
    }

    @objid ("f8561bb0-bd62-40af-94fb-c3a71d46a6cf")
    @Override
    public String getRuleId() {
        return Rule0305.RULEID;
    }

    @objid ("9baef944-a9a2-43a0-a49f-f4ffdc13cd49")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
