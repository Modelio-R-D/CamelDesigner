package fr.softeam.cameldesigner.handlers.commands.creatediagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;

@objid ("47bc667d-3e55-43e6-aa17-2f253694a7dc")
public class CreateDeploymentInstanceDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("d15cb826-3511-4c5b-80ba-11b2156eb66a")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        DeploymentInstanceModel subModel = (DeploymentInstanceModel) selectedElements.get(0);

        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();

        try( ITransaction transaction = session.createTransaction("Create Deployment Instance Diagram")){

            DeploymentInstanceModelDiagram diagram = DeploymentInstanceModelDiagram.create();

            subModel.getElement().getProduct().add(diagram.getElement());

            diagram.setDefaultName(subModel.getName() + " diagram");
//            this.openDiagram(diagram.getElement());

            transaction.commit();
        }
    }

    @Override
    protected void postConfigureElement(final MObject newElement, final IModule module) {
        // This method is a hook called once the element is created and configured and before the transaction is committed.
        // The super method should be first called in most cases.
        // Sub classes may redefine this method to make additional modifications.

        // Call the super method
        super.postConfigureElement(newElement, module);

        if (newElement instanceof AbstractDiagram) {
            AbstractDiagram diagram = (AbstractDiagram) newElement;

            IModuleContext moduleContext = module.getModuleContext();
            moduleContext.getModelingSession().getModel().getDefaultNameService().setDefaultName(diagram, diagram.getOrigin().getName() + " diagram");
            moduleContext.getModelioServices().getEditionService().openEditor(diagram);
        }
    }

}
