package fr.softeam.cameldesigner.handlers.commands.creatediagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataTypeModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9d2a7ed8-38f3-42b0-b437-f229c52b4b60")
public class CreateDataTypeDiagramCommand extends DiagramCreationStandardHandler {
    @objid ("aeec6c16-e7db-445e-a525-58f1f59daf89")
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        DataTypeModel subModel = (DataTypeModel) selectedElements.get(0);
        
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Data Type Diagram")){
        
            DataTypeModelDiagram diagram = DataTypeModelDiagram.create();
        
            subModel.getElement().getProduct().add(diagram.getElement());
        
            diagram.setDefaultName(subModel.getName() + " diagram");
        //            this.openDiagram(diagram.getElement());
        
            transaction.commit();
        }
    }

    @objid ("a8dfe20b-d6b4-47e2-a2b5-0c1fa0fdfebe")
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
