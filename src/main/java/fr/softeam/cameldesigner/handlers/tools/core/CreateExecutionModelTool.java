package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.statik.Package;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;


@objid ("d55fbc99-67a6-48d4-8f38-e928d620d567")
public class CreateExecutionModelTool extends CreateSubModelTool {
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
    	
    	org.modelio.metamodel.uml.statik.Package packageOwner = (Package) parent.getElement();

        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();

        try( ITransaction transaction = session.createTransaction("Create Execution Model")){

            ExecutionModel subModel = ExecutionModel.create();
            ExecutionModelDiagram diagram = ExecutionModelDiagram.create();

            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());

            subModel.setDefaultName("Execution Model");
            diagram.setDefaultName("Execution Diagram");
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);

            transaction.commit();
        }
    }

    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
