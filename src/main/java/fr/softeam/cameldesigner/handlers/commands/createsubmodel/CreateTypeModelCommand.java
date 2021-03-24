package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import java.util.List;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;

public class CreateTypeModelCommand extends CreateSubModelCommand{

    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {

        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);

        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();

        try( ITransaction transaction = session.createTransaction("Create Type Model")){

            TypeModel subModel = TypeModel.create();
            TypeModelDiagram diagram = TypeModelDiagram.create();

            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());

            subModel.setDefaultName("Type Model");
            diagram.setDefaultName("Type Model Diagram");
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);

            transaction.commit();
        }

    }

}
