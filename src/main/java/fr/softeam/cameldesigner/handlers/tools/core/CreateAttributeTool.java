package fr.softeam.cameldesigner.handlers.tools.core;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.utils.CamelFactory;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("88d6022c-3726-4601-85b7-dfd3b2819139")
public class CreateAttributeTool extends DefaultBoxTool {
    @objid ("da0fd434-b2a5-440b-aca3-d54043964185")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof Class
                && ((Class) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME);
    }

    @objid ("23026732-a672-4d05-b991-1bc6d38de270")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        
        try( ITransaction transaction = session.createTransaction ("Create Attribute")){
            MObject owner = parent.getElement();
        
            if (owner instanceof AbstractDiagram) {
                owner = ((AbstractDiagram) owner).getOrigin();
            }
        
            if (owner instanceof ModelElement) {
                AttributeAttribute feature = CamelFactory.createCamelAttribute((ModelElement)owner);
        
                List<IDiagramGraphic> graph = diagramHandle.unmask(feature.getElement(), rect.x, rect.y);
        
                if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                    ((IDiagramNode)graph.get(0)).setBounds(rect);
        
                diagramHandle.save();
                diagramHandle.close();
            }
            transaction.commit();
        }
    }

}
