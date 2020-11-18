package fr.softeam.cameldesigner.elementmodel.umlmodel;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * @author kchaabouni
 */
public class UmlModelService {
    private CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    private TagsManager tagsManager = new TagsManager();

    private static IModuleContext MODULE_CONTEXT = CamelDesignerModule.getInstance().getModuleContext();

    private static IModelingSession MODELING_SESSION = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();

    public Package createSubModel(Package camelModelOwner, String subModelName, String subModelStereotype, String subModelDiagramName, String subModelDiagramStereotype) {
        Package umlSubModel = null;
        
        switch(subModelStereotype) {
        case DeploymentTypeModel.STEREOTYPE_NAME:
            umlSubModel = DeploymentTypeModel.create().getElement();
            break;
        
        case RequirementModel.STEREOTYPE_NAME:
            umlSubModel = RequirementModel.create().getElement();
            break;
        
        case MetricTypeModel.STEREOTYPE_NAME:
            umlSubModel = MetricTypeModel.create().getElement();
            break;
        
        case MetaDataModel.STEREOTYPE_NAME:
            umlSubModel = MetaDataModel.create().getElement();
            break;
        
        case LocationModel.STEREOTYPE_NAME:
            umlSubModel = LocationModel.create().getElement();
            break;
        
        case SecurityModel.STEREOTYPE_NAME:
            umlSubModel = SecurityModel.create().getElement();
            break;
        
        case UnitModel.STEREOTYPE_NAME:
            umlSubModel = UnitModel.create().getElement();
            break;
        
        case ConstraintModel.STEREOTYPE_NAME:
            umlSubModel = ConstraintModel.create().getElement();
            break;
        
        case DataTypeModel.STEREOTYPE_NAME:
            umlSubModel = DataTypeModel.create().getElement();
            break;
        
        case OrganisationModel.STEREOTYPE_NAME:
            umlSubModel = OrganisationModel.create().getElement();
            break;
        
        case ScalabilityModel.STEREOTYPE_NAME:
            umlSubModel = ScalabilityModel.create().getElement();
            break;
        
        case DeploymentInstanceModel.STEREOTYPE_NAME:
            umlSubModel = DeploymentInstanceModel.create().getElement();
            break;
        
        case MetricInstanceModel.STEREOTYPE_NAME:
            umlSubModel = MetricInstanceModel.create().getElement();
            break;
        
        case DataInstanceModel.STEREOTYPE_NAME:
            umlSubModel = DataInstanceModel.create().getElement();
            break;
        
        case ExecutionModel.STEREOTYPE_NAME:
            umlSubModel = ExecutionModel.create().getElement();
            break;
        
        }
        
        if(umlSubModel != null) {
            umlSubModel.setName(subModelName);
            umlSubModel.setOwner(camelModelOwner);
        
            IModelingSession session = MODULE_CONTEXT.getModelingSession();
            MClass mclass = MODULE_CONTEXT.getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class);
            Stereotype ster = session.getMetamodelExtensions().getStereotype(subModelDiagramStereotype, mclass);
            AbstractDiagram diagram = session.getModel().createClassDiagram(subModelDiagramName, umlSubModel, ster);
            MODULE_CONTEXT.getModelioServices().getEditionService().openEditor(diagram);
        
        }
        return umlSubModel;
    }

    public Package createCamelModel(ModelElement packageOwner, String name) {
        Package camelUmlModel = null;
        
        CamelModel camelModelProxy = CamelModel.create();
        camelModelProxy.setApplicationName(name);
        
        
        camelUmlModel = camelModelProxy.getElement();
        camelUmlModel.setName(name);
        camelUmlModel.setOwner((ModelTree) packageOwner);
        
        CamelModelDiagram camelModelDiagramProxy = CamelModelDiagram.create();
        ClassDiagram camelModelDiagram = camelModelDiagramProxy.getElement();
        camelModelDiagram.setName(name + " Diagram");
        camelModelDiagram.setOrigin(camelUmlModel);
        
        IDiagramService diagramService = MODULE_CONTEXT.getModelioServices().getDiagramService();
        try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(camelModelDiagram);){
            IDiagramDG diagramDG = diagramHandle.getDiagramNode();
            this.camelDiagramService.applyCamelStyle(diagramDG);
            //List<IDiagramGraphic> diagramGraphics = diagramHandle.unmask(camelUmlModel, 200, 200);
            //for (IDiagramGraphic diagramGraphic : diagramGraphics) {
            //    if(diagramGraphic.getElement().equals(camelUmlModel)){
            //        ((IDiagramNode) diagramGraphic).setBounds(new Rectangle(300,200,200,100));
            //    }
            //}
            diagramHandle.save();
            diagramHandle.close();
        }
        
        MODULE_CONTEXT.getModelioServices().getEditionService().openEditor(camelModelDiagram);
        return camelUmlModel;
    }

    public Class createUmlClass(Class umlComponentOwner, String elementName, String elementStereotype, Rectangle bounds) {
        Class umlClazz = null;
        
        // create UML Class
        umlClazz = MODELING_SESSION.getModel().createClass(elementName, umlComponentOwner,
                ICamelDesignerPeerModule.MODULE_NAME, elementStereotype);
        
        // Unmask in Deployment Diagram
        for(  AbstractDiagram diagram : umlComponentOwner.getDiagramElement()) {
            if(diagram instanceof ClassDiagram
                    && ((ModelElement) diagram).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME)) {
        
                ClassDiagram deploymentDiagram = (ClassDiagram) diagram;
        
                this.camelDiagramService.unmaskModelElement(umlClazz, MODULE_CONTEXT, deploymentDiagram, bounds);
            }
        }
        return umlClazz;
    }

}
