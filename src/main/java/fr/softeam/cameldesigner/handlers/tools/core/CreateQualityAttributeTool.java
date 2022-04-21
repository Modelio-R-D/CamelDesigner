package fr.softeam.cameldesigner.handlers.tools.core;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("33aacf72-e60c-466d-aeb8-186c4e993a46")
public class CreateQualityAttributeTool extends DefaultBoxTool {
    @objid ("77f9f0c7-5bab-42c7-91f4-c13014b7d7a9")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject owner = targetNode.getElement();
        if (owner instanceof AbstractDiagram)
            owner = ((AbstractDiagram) owner).getOrigin();
        return (((owner instanceof Class)    || (owner instanceof org.modelio.metamodel.uml.statik.Package))
                && (((ModelElement)owner).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME)));
    }

    @objid ("bd6667e7-18c3-46a2-acf1-951d2549b122")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        
        try( ITransaction transaction = session.createTransaction ("Create Attribute")){
            MObject owner = parent.getElement();
        
            if (owner instanceof AbstractDiagram) {
                owner = ((AbstractDiagram) owner).getOrigin();
            }
        
            if (owner instanceof ModelElement) {
                CamelAttribute feature = CamelFactory.createQualityAttribute((ModelElement) owner);
        
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
