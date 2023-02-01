package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.core.LayerType;
import camel.deployment.ComponentInstance;
import camel.scalability.FunctionalEventInstance;
import camel.scalability.SingleEvent;
import camel.scalability.StatusType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e4100672-f2c2-4033-9655-6ab4fa960ee3")
public class FunctionalEventInstanceImporter<T extends FunctionalEventInstance, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance> extends EventInstanceImporter<T,V> {
    @objid ("8560e6de-efe2-4186-9db2-6ab1fe98bf4a")
    public FunctionalEventInstanceImporter() {
    }

    @objid ("c2e20792-b77e-499f-8ecc-dbac4bfafbbd")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitFunctionalEventInstance(this);
    }

    @objid ("15218b6c-0070-4e3c-be33-934f7af13881")
    public FunctionalEventInstanceImporter(T elt) {
        super(elt);
    }

    @objid ("46e51381-0e91-47cd-8bff-2e65965314d7")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance.create();
    }

    @objid ("bb61024b-da28-4868-b10f-5bbf7745cca5")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("22cbf278-37da-44d7-84f9-694b3dec363b")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setComponentInstance(elt);
    }

    @objid ("68fa7faf-5aeb-4530-8d97-85deba3e1b2d")
    private void setComponentInstance(V elt) {
        ComponentInstance value = this._element.getComponentInstance();
        if (value != null) {
            elt.setComponentInstance((fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance) value);
        }
    }

}
