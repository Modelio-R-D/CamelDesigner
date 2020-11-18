package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlDeploymentService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

public class CreateSoftwareComponent extends DefaultBoxTool {
    private UmlDeploymentService umlDeploymentService = new UmlDeploymentService();

    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof ClassDiagram
                &&  ((ClassDiagram) targetNode.getElement()).getOrigin() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package)((ClassDiagram) targetNode.getElement()).getOrigin()).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME);
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        Rectangle newBounds = rect.getCopy();
        if(newBounds.height <= 0) {
            newBounds.height = 50;
        }
        if(newBounds.width <= 0) {
            newBounds.width = 400;
        }
        
        //Class softwareComponent = null;
        
        //this.umlDeploymentService.createUmlSoftwareComponent((Package) diagramHandle.getDiagram().getOrigin(), SoftwareComponent.STEREOTYPE_NAME, newBounds);
        
        SoftwareComponent proxySoftwareComponent = SoftwareComponent.create();
        Component softwareComponent = proxySoftwareComponent.getElement();
        softwareComponent.setName(SoftwareComponent.STEREOTYPE_NAME);
        softwareComponent.setOwner((Package) diagramHandle.getDiagram().getOrigin());
    }

}
