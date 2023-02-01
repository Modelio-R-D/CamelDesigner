package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.HostingInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c7a864f1-09c9-4440-ae85-af9490a136d9")
public class HostingInstanceImporter<T extends HostingInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance> extends ComponentRelationInstanceImporter<T,V> {
    @objid ("2ffc3db2-f7d4-4785-b77f-c30e77b1fd9b")
    public HostingInstanceImporter() {
        super();
    }

    @objid ("6c121a28-62b5-4f62-b8f9-a1bc439dbc51")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.create();
    }

    @objid ("5ec7d039-e0b8-4581-9753-db663448d1e2")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("a1f75bef-0905-4984-8bf3-6091244079d8")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHostingInstance(this);
    }

    @objid ("010b2bcf-3699-4e6b-a9e5-59fa035ec661")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

}
