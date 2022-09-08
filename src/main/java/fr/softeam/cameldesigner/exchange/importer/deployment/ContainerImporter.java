package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.Container;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("22031973-9f19-44dc-9d55-cbe2cc996a06")
public class ContainerImporter<T extends Container, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container> extends CamelComponentImporter<T,V> {
    @objid ("63d3c9c6-b68b-446e-81ad-03a32d12662e")
    public ContainerImporter() {
        super();
    }

    @objid ("f75180e8-abed-4045-894d-55e28a852d29")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.create();
    }

    @objid ("41c1b073-91f5-4bd8-9451-42a653b7b42e")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addContainers(elt);
        else
            super.attach(elt, context);
    }

    @objid ("a28b4d78-5480-412c-ac22-f8fdd2c451da")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitContainer(this);
    }

}
