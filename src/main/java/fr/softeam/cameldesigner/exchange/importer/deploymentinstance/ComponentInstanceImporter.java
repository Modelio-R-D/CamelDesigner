package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.ComponentInstance;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;


public class ComponentInstanceImporter<T extends ComponentInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance> extends FeatureImporter<T,V> {

    public ComponentInstanceImporter() {

    }

    public ComponentInstanceImporter(T elt) {
        super(elt);
    }

}
