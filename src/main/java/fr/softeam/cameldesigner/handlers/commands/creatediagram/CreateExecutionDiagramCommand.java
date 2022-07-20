package fr.softeam.cameldesigner.handlers.commands.creatediagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.handlers.commands.createsubmodel.CreateSubModelCommand;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a86eabca-4356-45c2-8e43-e1aae9a6d6da")
public class CreateExecutionDiagramCommand extends CreateSubModelCommand {
    @objid ("869b26d7-984d-4354-9f08-491e4a96c9b2")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        ExecutionModel subModel = (ExecutionModel) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Execution Diagram")){
        
            ExecutionModelDiagram diagram = ExecutionModelDiagram.create();
        
            subModel.getElement().getProduct().add(diagram.getElement());
        
            diagram.setDefaultName(subModel.getName() + " diagram");
            this.openDiagram(diagram.getElement());
        
            transaction.commit();
        }
    }

}
