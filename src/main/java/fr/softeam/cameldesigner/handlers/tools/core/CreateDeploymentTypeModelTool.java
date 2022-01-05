package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
<<<<<<< HEAD
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentTypeModelDiagram;
=======
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;

/**
 * @author kchaabouni
 */
@objid ("4d2ef1b6-f5ad-4f7e-b24d-5f5123f597a1")
public class CreateDeploymentTypeModelTool extends CreateSubModelTool {
    @objid ("8800fa32-dcec-4d46-b150-2b46ef7c312b")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        ClassDiagram diag = (ClassDiagram) parent.getElement();
        org.modelio.metamodel.uml.statik.Package packageOwner = (org.modelio.metamodel.uml.statik.Package) diag.getOrigin();
        
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession session = moduleContext.getModelingSession();
        
        try( ITransaction transaction = session.createTransaction("Create Deployment Type Model")){
        
            DeploymentTypeModel subModel = DeploymentTypeModel.create();
<<<<<<< HEAD
            DeploymentTypeModelDiagram diagram = DeploymentTypeModelDiagram.create();
=======
            DataModelDiagram diagram = DataModelDiagram.create();
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        
            packageOwner.getOwnedElement().add(subModel.getElement());
            subModel.getElement().getProduct().add(diagram.getElement());
            diagramHandle.unmask(subModel.getElement(), rect.x, rect.y);
            subModel.setDefaultName("Deployment Type Model");
            diagram.setDefaultName("Deployment Type Diagram");
<<<<<<< HEAD
        
=======
            
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
            this.openDiagram(diagram, moduleContext.getModelioServices(), ICamelDesignerPeerModule.CAMEL_STYLE);
        
            transaction.commit();
        }
    }

    @objid ("7b9b5b2b-7bc4-4989-92a7-464508dbec4f")
    @Override
    public boolean acceptElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return super.acceptElement(arg1);
    }

}
