package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.ComponentRelationInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2380fcb0-f820-4f56-a4f5-d2fcb9d771d5")
public class ComponentRelationInstanceImporter<T extends ComponentRelationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance> extends FeatureImporter<T,V> {
    @objid ("b746185e-7c49-491b-8522-c0375626bd3c")
    public ComponentRelationInstanceImporter() {
        super();
    }

    @objid ("d5a239cc-d158-457b-b8b2-46fdaf3b6b11")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance.create();
    }

    @objid ("14d7206d-bb91-47fb-a712-de4a0e8c87ef")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitComponentRelationInstance(this);
    }

}
