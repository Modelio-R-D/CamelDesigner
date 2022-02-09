package fr.softeam.cameldesigner.exchange.exporter.execution;

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
    }

    @objid ("d489086d-6b2d-4bb8-949c-79d7792db136")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
