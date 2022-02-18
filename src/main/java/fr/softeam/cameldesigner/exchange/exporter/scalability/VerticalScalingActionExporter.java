package fr.softeam.cameldesigner.exchange.exporter.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.scalability.ScalabilityFactory;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction;

@objid ("520ee618-0962-4bd3-8c71-bf2f12418708")
public class VerticalScalingActionExporter<T extends VerticalScalingAction> extends ScalingActionExporter<T> {
    @objid ("ce00b897-1d2a-4f8b-844c-793a91fbc668")
    public VerticalScalingActionExporter(T elt) {
        super(elt);
    }

    @objid ("eabbd501-76e3-484e-ae2a-9e37be8288e9")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createVerticalScalingAction();
    }

    @objid ("c7db0efa-8d25-401e-bc3d-56cab013cbb0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("deb7fa97-26dc-4fc2-ae81-005b830e22fe")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
