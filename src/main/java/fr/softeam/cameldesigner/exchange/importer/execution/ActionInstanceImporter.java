package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.ActionInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e10d16de-1b02-43cb-94e3-bb21e42f672d")
public class ActionInstanceImporter<T extends ActionInstance, V extends fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance> extends FeatureImporter<T,V> {
    @objid ("f5fc1c81-de3c-4393-b90c-e31cf78a06de")
    public ActionInstanceImporter() {
        super();
    }

    @objid ("4444b854-1b6d-4eb7-b4e2-8f7523782e8c")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance.create();
    }

    @objid ("df8d602a-621f-41b5-9e73-33b3b87c4b9a")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("ffa47d98-f767-405a-8a41-1a964dc6d09c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitActionInstance(this);
    }

}
