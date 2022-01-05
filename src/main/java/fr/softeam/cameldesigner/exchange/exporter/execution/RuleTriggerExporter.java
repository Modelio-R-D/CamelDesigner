package fr.softeam.cameldesigner.exchange.exporter.execution;

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
    }

    @objid ("72db50d4-6c3c-405f-a4e4-adea9947b3f1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
