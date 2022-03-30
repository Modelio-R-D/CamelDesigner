package fr.softeam.cameldesigner.handlers.tools.core;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f074bdd1-254a-4404-9169-fff405aa7a59")
public class CreateFeatureTool extends DefaultBoxTool {
    @objid ("bf06a6d2-6b97-441a-a4af-f9a475900ba6")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof ModelElement
                && ((ModelElement) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,  Feature.STEREOTYPE_NAME);
    }

    @objid ("18c13857-c8e1-4c5d-a28c-c2b369939fdc")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        
        try( ITransaction transaction = session.createTransaction ("Create Feature")){
            MObject owner = parent.getElement();
        
            if (owner instanceof AbstractDiagram) {
                owner = ((AbstractDiagram) owner).getOrigin();
            }
        
            if (owner instanceof ModelTree) {
        
                Feature feature = CamelFactory.createCamelFeature((ModelTree)owner);
        
                List<IDiagramGraphic> graph = diagramHandle.unmask(feature.getElement(), rect.x, rect.y);
        
                if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                    ((IDiagramNode)graph.get(0)).setBounds(rect);
        
                diagramHandle.save();
                diagramHandle.close();
            }
            transaction.commit ();
        
        }
    }

}
