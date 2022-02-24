package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeaturePortExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("aa69172f-a913-48b5-87bb-b98c5c9b7deb")
public class CommunicationPortInstanceExporter<T extends CommunicationPortInstance> extends FeaturePortExporter<T> {
    @objid ("e8515e4a-27b6-4968-a0f2-a9e3e4ae7a7d")
    public CommunicationPortInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("bb3f9f45-0b1c-4b98-a41f-89c87cd50032")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createCommunicationInstance();
    }

    @objid ("b95b3d58-bff9-4298-887f-6a378aea2e45")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.CommunicationPortInstance) {
            camel.deployment.CommunicationPortInstance cpi = (camel.deployment.CommunicationPortInstance) elt;
            setType(cpi);
        }
    }

    @objid ("b7bdb9a4-16b3-4454-bcd6-d247cfb746fb")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("0bfae989-1221-4073-9bb7-16a2488e9803")
    private void setType(camel.deployment.CommunicationPortInstance cpi) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.deployment.CommunicationPort))
            cpi.setType((camel.deployment.CommunicationPort) type);
    }

}
