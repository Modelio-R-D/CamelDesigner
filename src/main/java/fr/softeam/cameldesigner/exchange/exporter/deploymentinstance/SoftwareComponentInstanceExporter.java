package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4401954c-a51b-4cfb-aab3-caf6ab79be47")
public class SoftwareComponentInstanceExporter<T extends SoftwareComponentInstance> extends ComponentInstanceExporter<T> {
    @objid ("fe5147bd-76a3-4571-b393-4291ce6516fb")
    public SoftwareComponentInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("ce2ef668-abde-4121-9972-9403a922cd19")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createSoftwareComponentInstance();
    }

    @objid ("6a1c2561-787a-4cdf-a205-b759ec54d447")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("5360edbd-3b2b-4f82-b37c-a79ba2fc359f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentInstanceModel) && (elt instanceof camel.deployment.SoftwareComponentInstance)) {
            ((camel.deployment.DeploymentInstanceModel) context).getSoftwareComponentInstances().add((camel.deployment.SoftwareComponentInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
