package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import java.sql.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureInstanceExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("18ecb454-803d-4407-b414-9bb6da83d8a4")
public abstract class ComponentInstanceExporter<T extends ComponentInstance> extends FeatureInstanceExporter<T> {
    @objid ("ff502510-3422-4069-992e-9bda59328d0c")
    public ComponentInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("61a2bf12-5a66-4eab-b7c6-a5600e07ea14")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("4307a4d6-e7b1-4e60-9bc7-2c9d2b40196a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.ComponentInstance) {
            camel.deployment.ComponentInstance ci = (camel.deployment.ComponentInstance) elt;
            setType(ci);
            setInstantiatedOn(ci);
            setDestroyedOn(ci);
        }
    }

    @objid ("307996a4-4f61-415f-80e8-145000251274")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("1b5cbdc7-f367-4ce7-9e0f-c25f958da5d2")
    private void setDestroyedOn(camel.deployment.ComponentInstance ci) {
        String content = this._element.getDestroyedOn();
        if (content != null)
            ci.setDestroyedOn(Date.valueOf(content));
    }

    @objid ("5e17ad5b-b469-4c57-a710-90ac74fb3a6e")
    private void setInstantiatedOn(camel.deployment.ComponentInstance ci) {
        String content = this._element.getInstantiatedOn();
        if (content != null)
            ci.setInstantiatedOn(Date.valueOf(content));
    }

    @objid ("d86dbe53-307e-4f6b-bfb1-1a4d9b0a2507")
    private void setType(camel.deployment.ComponentInstance ci) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.deployment.Component))
            ci.setType((camel.deployment.Component) type);
    }

}
