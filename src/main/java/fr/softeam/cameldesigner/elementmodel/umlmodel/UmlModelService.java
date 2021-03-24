package fr.softeam.cameldesigner.elementmodel.umlmodel;

import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MClass;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;

/**
 * @author kchaabouni
 */
public class UmlModelService {

    private CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    private static IModuleContext MODULE_CONTEXT = CamelDesignerModule.getInstance().getModuleContext();

    public AbstractDiagram createCamelDiagram(ModelElement umlSubModel, String subModelDiagramName, String subModelDiagramStereotype) {

        IModelingSession session = MODULE_CONTEXT.getModelingSession();
        MClass mclass = MODULE_CONTEXT.getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class);
        Stereotype ster = session.getMetamodelExtensions().getStereotype(subModelDiagramStereotype, mclass);
        AbstractDiagram diagram = session.getModel().createClassDiagram(subModelDiagramName, umlSubModel, ster);
        MODULE_CONTEXT.getModelioServices().getEditionService().openEditor(diagram);
        return diagram;
    }

    public Package createCamelModel(ModelElement packageOwner, String name) {

        Package camelUmlModel = null;

        CamelModel camelModelProxy = CamelModel.create();
        camelModelProxy.setApplicationName(name);

        camelUmlModel = camelModelProxy.getElement();
        camelUmlModel.setName(name);
        camelUmlModel.setOwner((ModelTree) packageOwner);

        CamelModelDiagram camelModelDiagram = CamelModelDiagram.create();
        camelModelDiagram.getElement().setName(name + " Diagram");
        camelModelDiagram.getElement().setOrigin(camelUmlModel);

        IDiagramService diagramService = MODULE_CONTEXT.getModelioServices().getDiagramService();
        try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(camelModelDiagram.getElement());){
            this.camelDiagramService.applyStyle(camelModelDiagram, ICamelDesignerPeerModule.CAMEL_STYLE);

            diagramHandle.save();
            diagramHandle.close();
        }

        MODULE_CONTEXT.getModelioServices().getEditionService().openEditor(camelModelDiagram.getElement());
        return camelUmlModel;
    }


}
