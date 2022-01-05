package fr.softeam.cameldesigner.exchange.exporter.execution;

import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import org.eclipse.emf.cdo.CDOObject;

@objid ("42354cea-a0e5-487c-af81-2864d05b4038")
public class SLOViolationExporter<T extends SLOViolation> extends CauseExporter<T> {
    @objid ("2f1e1c3a-eda8-4b77-891f-5eefb567fbc5")
    public SLOViolationExporter(T elt) {
        super(elt);
    }

    @objid ("813965cc-3d63-4ee1-aed5-e353ece3267e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createSLOViolation();
    }

    @objid ("f7c68c77-622a-43eb-98e0-9a83139cc77e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("134706f5-6d99-4572-bb93-d6f6958b4ae2")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
