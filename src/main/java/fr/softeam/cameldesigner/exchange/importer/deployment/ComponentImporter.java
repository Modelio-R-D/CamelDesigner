package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.Component;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;

@objid ("99e007b7-d2fa-4062-9bfb-31e88f61077c")
public class ComponentImporter<T extends Component, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent> extends FeatureImporter<T,V> {
    @objid ("2ae2a5a1-1549-4451-9403-dcd1edad55d2")
    public ComponentImporter() {
    }

    @objid ("afab7f36-55f1-43b6-b7d9-dd7bc90b40a6")
    public ComponentImporter(T elt) {
        super(elt);
    }

}
