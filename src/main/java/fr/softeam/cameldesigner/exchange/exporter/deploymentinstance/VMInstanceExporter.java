package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d59bf8b8-9a2e-4d0d-82e5-8281a66aa235")
public class VMInstanceExporter<T extends VMInstance> extends ComponentInstanceExporter<T> {
    @objid ("3326e1de-116a-41a5-86df-bd0f735ea0d5")
    public VMInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("4603b41b-1abd-4f6c-900b-b69a515e736e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createVMInstance();
    }

    @objid ("af4fb2be-3681-4658-8c0a-dec81790f0f6")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("db094711-5f6a-412c-be71-7eb82518f59d")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
