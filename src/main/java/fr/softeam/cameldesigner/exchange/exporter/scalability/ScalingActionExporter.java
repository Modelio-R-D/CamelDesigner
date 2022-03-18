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
        if (elt instanceof camel.scalability.ScalingAction) {
            setSoftwareComponent((camel.scalability.ScalingAction) elt);
        }
    }

    @objid ("703c2fa2-4e7f-43f6-a722-1796ef381f6e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.scalability.ScalabilityModel) && (elt instanceof camel.scalability.ScalingAction)) {
            ((camel.scalability.ScalabilityModel) context).getActions().add((camel.scalability.ScalingAction) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("254e615b-6157-4aa1-8458-568765dcf50c")
    private void setSoftwareComponent(camel.scalability.ScalingAction action) {
        CDOObject comp = this._process.getElement(this._element.getSoftwareComponent());
        if ((comp != null) &&  (comp instanceof camel.deployment.SoftwareComponent))
            action.setSoftwareComponent((camel.deployment.SoftwareComponent) comp);
    }

}
