package fr.softeam.cameldesigner.elementmodel.umlmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;
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

/**
 * @author kchaabouni
 */
@objid ("eb17cdb2-e6e0-40cb-8425-d0955e892705")
public class UmlModelService {
    @objid ("5d7e868f-3c2c-47ff-92e0-84b0991348f0")
    private static IModuleContext MODULE_CONTEXT = CamelDesignerModule.getInstance().getModuleContext();

    @objid ("d07920e8-0d49-4d47-a732-7722f80df82e")
    private CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    @objid ("3a184ba4-c42e-4e50-9f1f-d408ee628d0a")
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

    @objid ("b810438a-1af6-4621-ba12-7bc7efc9b8d9")
    public AbstractDiagram createCamelDiagram(ModelElement umlSubModel, String subModelDiagramName, String subModelDiagramStereotype) {
        IModelingSession session = MODULE_CONTEXT.getModelingSession();
        MClass mclass = MODULE_CONTEXT.getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class);
        Stereotype ster = session.getMetamodelExtensions().getStereotype(subModelDiagramStereotype, mclass);
        AbstractDiagram diagram = session.getModel().createClassDiagram(subModelDiagramName, umlSubModel, ster);
        MODULE_CONTEXT.getModelioServices().getEditionService().openEditor(diagram);
        return diagram;
    }

}
