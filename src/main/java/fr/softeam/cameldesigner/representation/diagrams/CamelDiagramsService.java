package fr.softeam.cameldesigner.representation.diagrams;

import java.util.List;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * @author kchaabouni
 */
public class CamelDiagramsService {

    public void applyStyle(AbstractCamelDiagram diagram, String styleName) {

        IDiagramService diagramService = CamelDesignerModule.getInstance().getModuleContext().getModelioServices().getDiagramService();

        try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(diagram.getElement());){
            IDiagramDG diagramDG = diagramHandle.getDiagramNode();
            for (IStyleHandle camelStyle : diagramService.listStyles()){
                if (camelStyle.getName().equals(styleName)) {
                    diagramDG.setStyle(camelStyle);
                    break;
                }
            }
        }
    }

    public void unmaskModelElement(CamelElement camelElt, AbstractCamelDiagram camelDiagram, Rectangle bounds) {

        IDiagramService diagramService = CamelDesignerModule.getInstance().getModuleContext().getModelioServices().getDiagramService();
        ModelElement elt = camelElt.getElement();

        try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(camelDiagram.getElement());){

            List<IDiagramGraphic> diagramGraphics = diagramHandle.unmask(elt, 0, 0);

            if(bounds != null) {
                for (IDiagramGraphic diagramGraphic : diagramGraphics) {
                    if(diagramGraphic.getElement().equals(elt)){
                        ((IDiagramNode) diagramGraphic).setBounds(bounds);
                    }
                }
            }
            diagramHandle.save();
            diagramHandle.close();
        }
    }

    public ClassDiagram createSubModelDiagram(ModelElement subModel, String diagramStereotype, String deploymentModelDiagramName) {

        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        ClassDiagram subModelDiagram;
        MClass classDiagramMclass = moduleContext.getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class);

        // Create CamelModelDiagram and unmask CamelModel
        Stereotype camelModelDiagramStereotype = modelingSession.getMetamodelExtensions().getStereotype(ICamelDesignerPeerModule.MODULE_NAME, diagramStereotype, classDiagramMclass);
        subModelDiagram = modelingSession.getModel().createClassDiagram(deploymentModelDiagramName, subModel, camelModelDiagramStereotype);
        //unmaskModelElement(subModel, moduleContext, subModelDiagram, new Rectangle(300,200,200,100));
        return subModelDiagram;
    }

}
