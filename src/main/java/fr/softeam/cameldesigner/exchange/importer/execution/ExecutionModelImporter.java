package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.ExecutionModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3288b766-e97f-4abd-abed-e43d78bb210d")
public class ExecutionModelImporter<T extends ExecutionModel, V extends fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel> extends SubModelImporter<T,V> {
    @objid ("5f1b6b72-10d8-4bb1-87f8-3af9cb0749f1")
    public ExecutionModelImporter() {
        super();
    }

    @objid ("9b23ed03-84b1-4197-a423-b6f552b47da0")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.create();
    }

    @objid ("bb1746d8-2bc3-4985-96e9-216ac0bf1186")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addExecutionModels(elt);
    }

    @objid ("6d9a22ee-9e24-4037-b9c0-ea2f27d14b46")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitExecutionModel(this);
    }

}
