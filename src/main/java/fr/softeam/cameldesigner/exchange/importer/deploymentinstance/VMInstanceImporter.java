package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.VMInstance;

public class VMInstanceImporter<T extends VMInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance> extends ComponentInstanceImporter<T,V> {

    public VMInstanceImporter() {

    }

    public VMInstanceImporter(T elt) {
        super(elt);
    }

}
