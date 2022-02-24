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
        if (elt instanceof camel.deployment.HostingInstance) {
            camel.deployment.HostingInstance hi = (camel.deployment.HostingInstance) elt;
            setType(hi);
        }
    }

    @objid ("c2d00f5b-50f1-43e9-96e0-e896c021551c")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentInstanceModel) && (elt instanceof camel.deployment.HostingInstance)) {
            ((camel.deployment.DeploymentInstanceModel) context).getHostingInstances().add((camel.deployment.HostingInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("8f154c18-6a65-46d0-a7a3-dfae57f69b9b")
    private void setType(camel.deployment.HostingInstance hi) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.deployment.Hosting))
            hi.setType((camel.deployment.Hosting) type);
    }

}
