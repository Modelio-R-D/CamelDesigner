package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1665cd63-efdf-4b92-bb4f-6bc8b543ed01")
public class HostingInstanceExporter<T extends HostingInstance> extends ComponentRelationInstanceExporter<T> {
    @objid ("6ee32d95-124c-45a6-86bc-3ec363158af4")
    public HostingInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("4d4dd9a0-833a-411e-958b-6983671dd425")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createHostingInstance();
    }

    @objid ("8041c03c-ce0c-46bf-8130-7c36ce8a956f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("c2d00f5b-50f1-43e9-96e0-e896c021551c")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
