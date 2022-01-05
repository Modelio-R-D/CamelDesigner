package fr.softeam.cameldesigner.exchange.exporter.execution;

import org.eclipse.emf.cdo.CDOObject;
import camel.execution.ExecutionFactory;
import fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;


public class ActionInstanceExporter<T extends ActionInstance> extends FeatureExporter<T> {

    public ActionInstanceExporter(T elt) {
        super(elt);
    }

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createActionInstance();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @Override
    public void attach(CDOObject elt, CDOObject context) {
      super.attach(elt, context);
    }
}
