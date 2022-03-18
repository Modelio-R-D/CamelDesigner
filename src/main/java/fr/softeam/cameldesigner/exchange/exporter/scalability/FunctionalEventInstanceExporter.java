package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a10f6757-d867-4ca0-b745-4db6896c5cd9")
public class FunctionalEventInstanceExporter<T extends FunctionalEventInstance> extends EventInstanceExporter<T> {
    @objid ("ce80df63-fa6e-4064-ae6d-1ecc02ad196f")
    public FunctionalEventInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("5e4b20c7-4d2a-4d11-b6ae-e79e01ca4f09")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createFunctionalEventInstance();
    }

    @objid ("cfc1b8df-70ab-44ef-8fc1-0bc1c7dff8b1")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.scalability.FunctionalEventInstance) {
            setComponentInstance((camel.scalability.FunctionalEventInstance) elt);
        }
    }

    @objid ("e85f3492-8056-440a-9272-59bbc8060f3f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("3ce9d21c-b27b-49e6-956e-6606fdc18794")
    private void setComponentInstance(camel.scalability.FunctionalEventInstance eventInstance) {
        CDOObject compInstance = this._process.getElement(this._element.getComponentInstance());
        if ((compInstance != null) &&  (compInstance instanceof camel.deployment.ComponentInstance))
            eventInstance.setComponentInstance((camel.deployment.ComponentInstance) compInstance);
    }

}
