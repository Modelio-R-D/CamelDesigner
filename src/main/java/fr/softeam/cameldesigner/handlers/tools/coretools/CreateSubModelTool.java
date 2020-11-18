package fr.softeam.cameldesigner.handlers.tools.coretools;

import java.util.List;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public abstract class CreateSubModelTool extends DefaultBoxTool {
    private String subModelName;

    private String subModelStereotype;

    private String subModelDiagramName;

    private String subModelDiagramStereotype;

    private UmlModelService elementModelService = new UmlModelService();

    public CreateSubModelTool(String subModelName, String subModelStereotype, String subModelDiagramName, String subModelDiagramStereotype) {
        super();
        this.subModelName = subModelName;
        this.subModelStereotype = subModelStereotype;
        this.subModelDiagramName = subModelDiagramName;
        this.subModelDiagramStereotype = subModelDiagramStereotype;
    }

    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return
                targetNode.getElement() instanceof ClassDiagram
                &&  ((ClassDiagram) targetNode.getElement()).getOrigin() instanceof org.modelio.metamodel.uml.statik.Package
                && ((org.modelio.metamodel.uml.statik.Package)((ClassDiagram) targetNode.getElement()).getOrigin())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME);
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        ModelElement classOwner = diagramHandle.getDiagram().getOrigin();
        org.modelio.metamodel.uml.statik.Package subModel = this.elementModelService.createSubModel((org.modelio.metamodel.uml.statik.Package) classOwner, this.subModelName, this.subModelStereotype, this.subModelDiagramName, this.subModelDiagramStereotype);
        
        List<IDiagramGraphic> graph = diagramHandle.unmask (subModel, rect.x, rect.y);
        
        if((graph != null) &&  (graph.size() > 0) && (graph.get(0) instanceof IDiagramNode))
            ((IDiagramNode)graph.get(0)).setBounds(rect);
        
        diagramHandle.save();
        diagramHandle.close();
    }

}
