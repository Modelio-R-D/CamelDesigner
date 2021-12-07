package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("461f0f84-1040-4158-9432-b4278762de61")
public class CreateUnitModelCommand extends CreateSubModelCommand {
    @objid ("2f6c6692-a6a1-45db-afdc-11de92f823df")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Unit Model")){
        
            UnitModel subModel = UnitModel.create();
            UnitModelDiagram diagram = UnitModelDiagram.create();
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
        
            subModel.setDefaultName("Unit Model");
            diagram.setDefaultName("Unit Model Diagram");
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);
        
            transaction.commit();
        }
    }

}
