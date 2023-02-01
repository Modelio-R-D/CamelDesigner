package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.ComponentInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;

@objid ("653dc37f-8679-4fbf-a0e9-67f6e4f1bf6e")
public class ComponentInstanceImporter<T extends ComponentInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance> extends FeatureImporter<T,V> {
    @objid ("0c70b316-69c2-4cfe-b674-3e4b17c522a6")
    public ComponentInstanceImporter() {
    }

    @objid ("bd74acfe-3102-4d3d-8022-66826452b201")
    public ComponentInstanceImporter(T elt) {
        super(elt);
    }

}
