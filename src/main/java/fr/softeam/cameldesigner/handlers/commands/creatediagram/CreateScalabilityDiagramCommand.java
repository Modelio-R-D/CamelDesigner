package fr.softeam.cameldesigner.handlers.commands.creatediagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.handlers.commands.createsubmodel.CreateSubModelCommand;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("82de796e-8667-43e3-8017-833201506dfa")
public class CreateScalabilityDiagramCommand extends CreateSubModelCommand {
    @objid ("275b5670-9011-4813-bafa-a68c9d6f82cc")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        ScalabilityModel subModel = (ScalabilityModel) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Scalability Diagram")){
        
            ScalabilityModelDiagram diagram = ScalabilityModelDiagram.create();
        
            subModel.getElement().getProduct().add(diagram.getElement());
        
            diagram.setDefaultName(subModel.getName() + " diagram");
            this.openDiagram(diagram.getElement());
        
            transaction.commit();
        }
    }

}
