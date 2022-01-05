package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("db11059e-f431-4aad-810b-e8fb3c3299a6")
public class ExecutionModelExporter<T extends ExecutionModel> extends SubModelExporter<T> {
    @objid ("9ca85901-8ebe-4c1c-9b7e-bff3127be561")
    public ExecutionModelExporter(T elt) {
        super(elt);
    }

    @objid ("a2926394-91de-47ed-b1e2-881904d81182")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createExecutionModel();
    }

    @objid ("f366b3ca-6901-4419-9362-e1e00a88ab51")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("34dd56e1-d3cb-48c6-99f2-5054091dcb52")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
