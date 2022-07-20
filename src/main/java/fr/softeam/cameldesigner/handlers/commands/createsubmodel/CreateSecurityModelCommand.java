package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("6f8ef23d-c073-4cf6-b049-334218adeda3")
public class CreateSecurityModelCommand extends CreateSubModelCommand {
    @objid ("32b2941e-cada-4463-835c-d8f49d5223a0")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Security Model")){
        
            SecurityModel subModel = SecurityModel.create();
            SecurityModelDiagram diagram = SecurityModelDiagram.create();
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
        
            subModel.setDefaultName("Security Model");
            diagram.setDefaultName(subModel.getName() + " diagram");
            this.openDiagram(diagram.getElement());
        
            transaction.commit();
        }
    }

}
