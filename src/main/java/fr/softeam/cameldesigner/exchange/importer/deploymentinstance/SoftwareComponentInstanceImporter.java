package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.SoftwareComponentInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f7925368-95b5-433d-b4be-bfce8edd0e09")
public class SoftwareComponentInstanceImporter<T extends SoftwareComponentInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance> extends ComponentInstanceImporter<T,V> {
    @objid ("470889cc-b118-4afd-825a-f71ca57bf53a")
    public SoftwareComponentInstanceImporter() {
    }

    @objid ("b9a39d3d-0b6b-43db-a9cf-4af4d5d1bd2d")
    public SoftwareComponentInstanceImporter(T elt) {
        super(elt);
    }

}
