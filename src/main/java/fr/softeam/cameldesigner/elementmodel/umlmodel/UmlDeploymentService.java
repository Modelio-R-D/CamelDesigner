package fr.softeam.cameldesigner.elementmodel.umlmodel;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.elementmodel.properties.TagsManager;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.representation.diagrams.CamelDiagramsService;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

public class UmlDeploymentService {
    private CamelDiagramsService camelDiagramService = new CamelDiagramsService();

    private TagsManager tagsManager = new TagsManager();

    private UmlModelService umlModelService = new UmlModelService();

    private static IModuleContext MODULE_CONTEXT = CamelDesignerModule.getInstance().getModuleContext();

    private static IModelingSession MODELING_SESSION = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();

    public Class createUmlSoftwareComponent(Package umlDeploymentModel, String umlSoftwareComponentName, Rectangle bounds) {
        Class umlSoftwareComponent = null;
        
        //try( ITransaction transaction = MODELING_SESSION.createTransaction("TO MODIFY LATER")){
        
            // create class
            umlSoftwareComponent = MODELING_SESSION.getModel().createClass(umlSoftwareComponentName, umlDeploymentModel,
                    ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME);
        
            // Add default Named_Element.Name Tag
        //            this.tagsManager.createTag(umlSoftwareComponent, CamelDesignerTagTypes.NAME, umlSoftwareComponentName);
        
        
            // Unmask umlSoftwareComponent in Deployment Diagram
            for( MObject child : umlDeploymentModel.getCompositionChildren()) {
                if(child instanceof ClassDiagram
                        && ((ModelElement) child).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModelDiagram.STEREOTYPE_NAME)) {
        
                    ClassDiagram deploymentDiagram = (ClassDiagram) child;
        
                    this.camelDiagramService.unmaskModelElement(umlSoftwareComponent, MODULE_CONTEXT, deploymentDiagram, bounds);
        
                }
            }
        
        
            //transaction.commit ();
        //}
        return umlSoftwareComponent;
    }

    public Class createUmlRequiredHost(Class umlSoftwareComponentOwner, String requiredHostName, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, requiredHostName, HostingPort.STEREOTYPE_NAME, bounds);
    }

    public Class createUmlProvidedHost(Class umlSoftwareComponentOwner, String providedHostname, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, providedHostname, HostingPort.STEREOTYPE_NAME, bounds);
    }

    public Class createUmlRequiredCommunication(Class umlSoftwareComponentOwner, String requiredCommunicationName, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, requiredCommunicationName, CommunicationPort.STEREOTYPE_NAME, bounds);
    }

    public Class createUmlProvidedCommunication(Class umlSoftwareComponentOwner, String providedCommunicationname, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, providedCommunicationname, CommunicationPort.STEREOTYPE_NAME, bounds);
    }

    public Class createUmlScriptConfiguration(Class umlSoftwareComponentOwner, String scriptConfigurationName, Rectangle bounds) {
        return this.umlModelService.createUmlClass(umlSoftwareComponentOwner, scriptConfigurationName, ScriptConfiguration.STEREOTYPE_NAME, bounds);
    }

}
