package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.SoftwareComponentInstance;


public class SoftwareComponentInstanceImporter<T extends SoftwareComponentInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance> extends ComponentInstanceImporter<T,V> {

    public SoftwareComponentInstanceImporter() {

    }

    public SoftwareComponentInstanceImporter(T elt) {
        super(elt);
    }

}
