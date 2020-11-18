package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlDeploymentService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.uml.statik.Class;

public class CreateRequiredHost extends DefaultBoxTool {
    private UmlDeploymentService umlDeploymentService = new UmlDeploymentService();

    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME);
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        Rectangle newBounds = rect.getCopy();
        if(newBounds.height <= 0) {
            newBounds.height = 50;
        }
        if(newBounds.width <= 0) {
            newBounds.width = 300;
        }
        
        
        this.umlDeploymentService.createUmlRequiredHost(((Class) parent.getElement()), "RequiredHost", newBounds);
    }

}
