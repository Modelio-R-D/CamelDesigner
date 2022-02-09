package fr.softeam.cameldesigner.handlers.tools.metadata;

import java.util.List;
import camel.mms.MmsPropertyType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("b82c6687-0c1d-4c00-9ff6-a99ac40d6188")
public class MMSProperty extends DefaultBoxTool {
    @objid ("42dab16c-9d84-4615-8a41-28e2e4ad01d7")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        MObject owner = targetNode.getElement();
        
        if (owner instanceof AbstractDiagram) {
            owner = ((AbstractDiagram) owner).getOrigin();
        }
        return MmsConcept.canInstantiate(owner);
    }

    @objid ("d558e555-6338-4cea-b4f4-98f9699a1308")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        
        try( ITransaction transaction = session.createTransaction ("Create MmsConcept")){
            MObject owner = parent.getElement();
        
            if (owner instanceof AbstractDiagram) {
                owner = ((AbstractDiagram) owner).getOrigin();
            }
        
            if (MmsConcept.canInstantiate(owner)) {
                MmsProperty prop = MmsProperty.create();
                prop.setMmsPropertyType(MmsPropertyType.DATA_PROPERTY);
        
                MmsConcept concept = MmsConcept.instantiate((org.modelio.metamodel.uml.statik.Class) owner);
                concept.addProperty(prop);
        
        
                List<IDiagramGraphic> graph = diagramHandle.unmask(prop.getElement(), rect.x, rect.y);
        
                if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
                    ((IDiagramNode)graph.get(0)).setBounds(rect);
        
                diagramHandle.save();
                diagramHandle.close();
            }
            transaction.commit();
        }
    }

}
