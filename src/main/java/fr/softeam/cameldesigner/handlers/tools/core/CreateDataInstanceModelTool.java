//package fr.softeam.cameldesigner.handlers.tools.core;
//
//import com.modeliosoft.modelio.javadesigner.annotations.objid;
//import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
//import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
//import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
//import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
//import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
//import fr.softeam.cameldesigner.impl.CamelDesignerModule;
//import org.eclipse.draw2d.geometry.Rectangle;
//import org.modelio.api.modelio.diagram.IDiagramGraphic;
//import org.modelio.api.modelio.diagram.IDiagramHandle;
//import org.modelio.api.modelio.model.IModelingSession;
//import org.modelio.api.modelio.model.ITransaction;
//import org.modelio.api.module.context.IModuleContext;
//import org.modelio.metamodel.diagrams.ClassDiagram;
//
//public class CreateDataInstanceModelTool extends CreateSubModelTool {
//    @Override
//    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
//        ClassDiagram diag = (ClassDiagram) parent.getElement();
//        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag.getOrigin();
//        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
//        IModelingSession session = moduleContext.getModelingSession();
//
//
//        try( ITransaction transaction = session.createTransaction("Create Data Instance Model")){
//
//            DataInstanceModel subModel = DataInstanceModel.create();
//            DataInstanceModelDiagram diagram = DataInstanceModelDiagram.create();
//
//            packageOwner.getOwnedElement().add(subModel.getElement());
//            subModel.getElement().getProduct().add(diagram.getElement());
//            diagramHandle.unmask(subModel.getElement(), rect.x, rect.y);
//            subModel.setDefaultName("Data Instance Model");
//            diagram.setDefaultName("Data Instance Diagram");
//
//            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);
//
//            transaction.commit();
//
//        }
//    }
//
//    @Override
//    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
//        return super.acceptElement(arg1);
//    }
//
//}
package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;

@objid ("56c23558-ea03-48b2-bdb0-8f5b5ee750f7")
public class CreateDataInstanceModelTool extends CreateSubModelTool {
    @objid ("fefdbe9c-98b8-4434-84c4-82c019305d14")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        ClassDiagram diag = (ClassDiagram) parent.getElement();
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag.getOrigin();
        
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Data Instance Model")){
        
            DataInstanceModel subModel = DataInstanceModel.create();
            DataInstanceModelDiagram diagram = DataInstanceModelDiagram.create();
            
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
            diagramHandle.unmask(subModel.getElement(), rect.x, rect.y);
            subModel.setDefaultName("Data Instance Model");
            diagram.setDefaultName("Data Instance Diagram");
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);
        
            transaction.commit();
        }
    }

    @objid ("c03be97d-3725-4acf-9ff1-afa5d89ee23d")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
