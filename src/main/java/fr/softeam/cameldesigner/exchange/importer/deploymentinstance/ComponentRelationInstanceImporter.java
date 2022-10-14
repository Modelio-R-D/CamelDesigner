package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.ComponentRelationInstance;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;


public class ComponentRelationInstanceImporter<T extends ComponentRelationInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance> extends FeatureImporter<T,V> {

    public ComponentRelationInstanceImporter() {
        super();
    }


    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance.create();
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitComponentRelationInstance(this);
    }

}
