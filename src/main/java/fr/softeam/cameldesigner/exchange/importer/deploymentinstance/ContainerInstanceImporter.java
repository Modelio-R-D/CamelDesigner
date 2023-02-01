package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.ContainerInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5a6cf5b0-6055-4112-904b-9a15cfa1e756")
public class ContainerInstanceImporter<T extends ContainerInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance> extends ComponentInstanceImporter<T,V> {
    @objid ("8564310f-ccb2-48de-9e67-97ba596e6d18")
    public ContainerInstanceImporter() {
        super();
    }

    @objid ("71bcb82d-5673-4bdb-9b99-af671669789a")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.create();
    }

    @objid ("9da12586-e247-4c65-b9e0-16e50e005643")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("2272ec05-49e7-4a74-9704-238412e6d0ec")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitContainerInstance(this);
    }

}
