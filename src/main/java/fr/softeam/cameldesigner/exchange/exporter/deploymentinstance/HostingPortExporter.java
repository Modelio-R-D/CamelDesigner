package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.exchange.exporter.core.FeaturePortExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8fa9f13f-72e1-4777-bce8-a2b89392d46c")
public abstract class HostingPortExporter<T extends HostingPort> extends FeaturePortExporter<T> {
    @objid ("8d689e72-9958-499d-b449-7758267a1434")
    public HostingPortExporter(T elt) {
        super(elt);
    }

    @objid ("9b729901-c37a-4bb1-8dfe-405971314a03")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createProvidedHost();
    }

    @objid ("60767f2e-a75f-4d2b-b51e-823f651761da")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3d2388a8-0a0e-4622-ae4e-a0f1819a7c09")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
