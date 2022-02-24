package fr.softeam.cameldesigner.exchange.exporter.execution;

import java.sql.Date;
import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("eb6efb0b-6f39-4465-98c0-3c64bd7757af")
public class ActionInstanceExporter<T extends ActionInstance> extends FeatureExporter<T> {
    @objid ("71f594f7-03c8-439c-8a49-6e9c0bed2aa9")
    public ActionInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("02007768-7a64-4442-8c38-7593d5f29fa6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createActionInstance();
    }

    @objid ("b727fa55-21a5-4f9b-a209-ec5cd8769f4b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.ActionInstance) {
            camel.execution.ActionInstance ai = (camel.execution.ActionInstance) elt;
            setAction(ai);
            setStartTime(ai);
            setEndTime(ai);
            setSuccessful(ai);
        }
    }

    @objid ("d489086d-6b2d-4bb8-949c-79d7792db136")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("10c5a425-e211-4b8e-97db-97cb793b8b29")
    private void setSuccessful(camel.execution.ActionInstance ai) {
        ai.setSuccessful(this._element.isSuccessful());
    }

    @objid ("c61617d8-66b8-4091-babf-843fd2adc400")
    private void setStartTime(camel.execution.ActionInstance ai) {
        ai.setStartTime(Date.valueOf(this._element.getStartTime()));
    }

    @objid ("8ee360ad-24fa-4366-a0b7-ace5e6b17c17")
    private void setEndTime(camel.execution.ActionInstance ai) {
        ai.setEndTime(Date.valueOf(this._element.getEndTime()));
    }

    @objid ("ef19de19-11af-40cc-a910-8be9ea613509")
    private void setAction(camel.execution.ActionInstance ai) {
        CDOObject action =  this._process.getElement(this._element.getAction());
        if ((action != null) &&  (action instanceof camel.core.Action))
            ai.setAction((camel.core.Action) action);
    }

}
