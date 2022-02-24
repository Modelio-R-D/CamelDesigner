package fr.softeam.cameldesigner.exchange.exporter.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction;
import fr.softeam.cameldesigner.exchange.exporter.core.ActionExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8da2b75c-e972-440f-bb49-ad8d772b1388")
public abstract class ScalingActionExporter<T extends ScalingAction> extends ActionExporter<T> {
    @objid ("eff9cead-97d5-458e-91d0-3cbac4234987")
    public ScalingActionExporter(T elt) {
        super(elt);
    }

    @objid ("e0b68541-61e5-4f8a-9fa6-57aaed8b5604")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("664eac81-ae8e-475e-91da-46437ade3a3a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("703c2fa2-4e7f-43f6-a722-1796ef381f6e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
