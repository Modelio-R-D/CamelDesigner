package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bceb408d-ef41-4630-bd1c-b5da0e125bcb")
public class CauseExporter<T extends Cause> extends FeatureExporter<T> {
    @objid ("f32f0d7e-d650-431b-a9bb-fdf38dc9ae1e")
    public CauseExporter(T elt) {
        super(elt);
    }

    @objid ("2e1bf254-9429-4487-8231-f94f7113cde7")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createCause();
    }

    @objid ("a849b1d6-8666-43b6-9a74-0ad338d811c0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("b8cca764-6817-4478-b40d-8a9269ff1e14")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
