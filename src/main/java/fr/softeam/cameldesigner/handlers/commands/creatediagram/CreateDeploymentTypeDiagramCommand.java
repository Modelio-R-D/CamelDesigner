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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentTypeModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;

@objid ("86e96feb-5fbe-4504-a7e2-a78f395e4c42")
public class CreateDeploymentTypeDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("7d780c16-d2cd-4911-abcd-f1e2fc5fa8fc")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        DeploymentTypeModel subModel = (DeploymentTypeModel) selectedElements.get(0);

        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();

        try( ITransaction transaction = session.createTransaction("Create Deployment Type Diagram")){

            DeploymentTypeModelDiagram diagram = DeploymentTypeModelDiagram.create();

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
