package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import java.util.List;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;

public class CreateDataInstanceModelCommand extends CreateSubModelCommand{

    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {

        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) selectedElements.get(0);

        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();

        try( ITransaction transaction = session.createTransaction("Create Data Instance Model")){

            DataInstanceModel subModel = DataInstanceModel.create();
            DataInstanceModelDiagram diagram = DataInstanceModelDiagram.create();

            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());

            subModel.setDefaultName("Data Instance Model");
            diagram.setDefaultName("Data Instance Diagram");
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);

            transaction.commit();
        }

    }



}
