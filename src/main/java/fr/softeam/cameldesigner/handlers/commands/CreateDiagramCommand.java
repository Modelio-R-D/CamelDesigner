package fr.softeam.cameldesigner.handlers.commands;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("fe97c0c4-f5c2-4d0f-a091-6aa0134de816")
public class CreateDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("250651f6-75cb-4e73-9fb9-13dc5fdb3741")
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
