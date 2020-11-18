package fr.softeam.cameldesigner.handlers.tools.coretools;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.uml.statik.Class;

public class CreateAttributeClassTool extends DefaultBoxTool {
    private UmlModelService umlModelService = new UmlModelService();

    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof Class
                && ((Class) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME);
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
        
        
        this.umlModelService.createUmlClass((Class) parent.getElement(),
                AttributeClass.STEREOTYPE_NAME,
                AttributeClass.STEREOTYPE_NAME,
                newBounds);
    }

}
