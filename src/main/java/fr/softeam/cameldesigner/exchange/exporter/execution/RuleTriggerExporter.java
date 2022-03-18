package fr.softeam.cameldesigner.exchange.exporter.execution;

import java.sql.Date;
import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1bb0be9d-982b-4b01-8552-dc433598af02")
public class RuleTriggerExporter<T extends RuleTrigger> extends CauseExporter<T> {
    @objid ("edd91dbc-35bc-433a-8111-11f84bf48dc5")
    public RuleTriggerExporter(T elt) {
        super(elt);
    }

    @objid ("5e608d53-aa24-49fd-abe0-cb0104e99093")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createRuleTrigger();
    }

    @objid ("f616e606-2cbe-4b21-806b-3587ee11cdec")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.RuleTrigger) {
            camel.execution.RuleTrigger rule = (camel.execution.RuleTrigger) elt;
            setScalabilityRule(rule);
            setTrigerringTime(rule);
        }
    }

    @objid ("72db50d4-6c3c-405f-a4e4-adea9947b3f1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.execution.ExecutionModel) && (elt instanceof camel.execution.RuleTrigger)) {
            ((camel.execution.ExecutionModel) context).getRuleTriggers().add((camel.execution.RuleTrigger) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("63f52aa7-44d0-436e-844d-ea34bb295527")
    private void setTrigerringTime(camel.execution.RuleTrigger rule) {
        String content = this._element.getTriggeringTime();
        if (content != null)
            rule.setTrigerringTime(Date.valueOf(content));
    }

    @objid ("6c120901-3a04-4323-98c1-90a8ab22467d")
    private void setScalabilityRule(camel.execution.RuleTrigger rule) {
        CDOObject  scaRule =  this._process.getElement(this._element.getScalabilityRule());
        if ((scaRule != null) &&  (scaRule instanceof camel.scalability.ScalabilityRule))
            rule.setScalabilityRule((camel.scalability.ScalabilityRule) scaRule);
    }

}
