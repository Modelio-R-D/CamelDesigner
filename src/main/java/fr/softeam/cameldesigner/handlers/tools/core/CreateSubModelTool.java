package fr.softeam.cameldesigner.handlers.tools.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import org.modelio.api.modelio.IModelioServices;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;

/**
 * @author kchaabouni
 */
@objid ("bc88f7ef-e788-4de4-aeec-8a42935e60d8")
public abstract class CreateSubModelTool extends DefaultBoxTool {
    @objid ("af2b339a-4f9c-4d67-b8f7-5ca301eb6362")
    public boolean acceptElement(final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof ClassDiagram
                && ((ClassDiagram) targetNode.getElement())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME);
    }

    @objid ("dc1132f9-5d33-4af3-93ec-ac73e3848732")
    protected void openDiagram(AbstractCamelDiagram diag, IModelioServices modelioServices, final String styleName) {
        AbstractDiagram diagram = diag.getElement();
        IDiagramService ds = modelioServices.getDiagramService();
        
        try(  IDiagramHandle handler = ds.getDiagramHandle(diagram);){
            IDiagramDG dg = handler.getDiagramNode();
        
            for (IStyleHandle style : ds.listStyles()){
                if (style.getName().equals(styleName)){
                    dg.setStyle(style);
                    break;
                }
            }
        
            handler.save();
            handler.close();
        
            modelioServices.getEditionService().openEditor(diagram);
        }
    }

}
