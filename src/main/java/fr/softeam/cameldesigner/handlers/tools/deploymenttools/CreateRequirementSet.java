package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CreateRequirementSet extends DefaultBoxTool {
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof ClassDiagram
                &&  ((ClassDiagram) targetNode.getElement()).getOrigin() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package)((ClassDiagram) targetNode.getElement()).getOrigin())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME);
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        Class softwareComponent = null;
        
        try( ITransaction transaction = modelingSession.createTransaction("TO MODIFY LATER")){
        
            MObject rootParent = diagramHandle.getDiagram().getOrigin().getCompositionOwner();
        
            // create stereotyped Attack Class
            softwareComponent = modelingSession.getModel().createClass(
                    "RequirementSet",
                    (NameSpace) rootParent,
                    ICamelDesignerPeerModule.MODULE_NAME,
                    RequirementSet.STEREOTYPE_NAME);
        
        
            // unmask Attack and save diagram
            diagramHandle.unmask(softwareComponent, rect.x, rect.y);
        
            diagramHandle.save();
            diagramHandle.close();
        
            softwareComponent.setOwner((ModelTree) parent.getElement().getCompositionOwner());
        
            modelingSession.getModel().getDefaultNameService()
            .setDefaultName(softwareComponent, "RequirementSet");
        
        
        
        
            transaction.commit ();
        }
    }

}
