package fr.softeam.cameldesigner.handlers.commands.creatediagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a5ed181e-b101-46f0-9c38-0c5e7d7dc53b")
public class CreateDataInstanceDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("8d545ef9-7e11-4009-9e3a-178bee240607")
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        DataInstanceModel subModel = (DataInstanceModel) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Data Instance Diagram")){
        
            DataInstanceModelDiagram diagram = DataInstanceModelDiagram.create();
        
            subModel.getElement().getProduct().add(diagram.getElement());
        
            diagram.setDefaultName(subModel.getName() + " diagram");
        //            this.openDiagram(diagram.getElement());
        
            transaction.commit();
        }
    }

    @objid ("f5f24da3-f7bd-4e5f-ad29-f60e62777fc3")
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
