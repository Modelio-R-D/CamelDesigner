package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.VMInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b00d673f-c7cc-42e1-9b46-8fae6369ab85")
public class VMInstanceImporter<T extends VMInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance> extends ComponentInstanceImporter<T,V> {
    @objid ("79acc31b-6984-4898-a471-000ffdc02937")
    public VMInstanceImporter() {
    }

    @objid ("e337992c-9973-43f5-a183-efe2557f97e0")
    public VMInstanceImporter(T elt) {
        super(elt);
    }

}
