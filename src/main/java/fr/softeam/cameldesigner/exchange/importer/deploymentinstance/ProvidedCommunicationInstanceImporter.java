package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.ProvidedCommunicationInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("59beab45-d6d7-4856-886e-d768fc81028e")
public class ProvidedCommunicationInstanceImporter<T extends ProvidedCommunicationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> extends CommunicationPortInstanceImporter<T,V> {
    @objid ("819609fe-6a3d-41a7-85e8-a4c8112737dd")
    public ProvidedCommunicationInstanceImporter() {
        super();
    }

    @objid ("9b0b72e7-49d2-4580-8c47-aeef059d58be")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance.create();
    }

    @objid ("6b0bf759-b86f-4e04-ac0e-490e01c93ed7")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("571635a7-28c4-4253-874f-7731d6fceba4")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitProvidedCommunicationInstance(this);
    }

    @objid ("547803d5-17da-4df7-9322-3cc8c2ac24b9")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

}
