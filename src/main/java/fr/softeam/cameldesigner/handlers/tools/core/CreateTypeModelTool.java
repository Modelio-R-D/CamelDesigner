package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;

@objid ("aa36bedd-de25-43c3-bd20-f3fca0d80292")
public class CreateTypeModelTool extends CreateSubModelTool {
    @objid ("2ecb6fb6-59b7-4587-8632-39198718897b")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        ClassDiagram diag = (ClassDiagram) parent.getElement();
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag.getOrigin();
        
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Type Model")){
        
            TypeModel subModel = TypeModel.create();
            TypeModelDiagram diagram = TypeModelDiagram.create();
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
            diagramHandle.unmask(subModel.getElement(), rect.x, rect.y);
            subModel.setDefaultName("Type Model");
            diagram.setDefaultName("Type Diagram");
            
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);
        
            transaction.commit();
        }
    }

    @objid ("60916b7d-39cf-42f9-b952-0080ec8d1c7f")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
