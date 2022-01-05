package fr.softeam.cameldesigner.conversion.process.generate;

<<<<<<< HEAD
import com.modeliosoft.modelio.javadesigner.annotations.objid;
=======
import java.util.Map;
import camel.core.CamelModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

@objid ("92fec618-de4f-424b-8b28-61cb78b749e0")
public class GenerateProcessDeploymentInstance extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("89ec6d41-f6e7-4366-b79b-42c829987fe8")
<<<<<<< HEAD
    public GenerateProcessDeploymentInstance(CDOObject camelElementParent) {
        super(camelElementParent);
=======
    public GenerateProcessDeploymentInstance(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    }

    @objid ("e928ab70-7487-4bd7-a258-64c77f54fac2")
    @Override
    protected CDOObject switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement camelElement) {
        ModelElement element = camelElement.getElement();
        if (element instanceof Package) {
            return generate ((Package) element);
        }
        else if (element instanceof Component) {
            return generate ((Component) element);
        }
        else if (element instanceof Class) {
            return generate ((Class) element);
        
        
            //if(((ModelElement) packageElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.)) {
            //    return generateCamelModel(packageElement);
            //}
        }
        return null;
    }

    @objid ("9b567e6e-d73e-49ea-93bc-2794ec92d2cb")
    private CDOObject generate(Package umlPackage) {
<<<<<<< HEAD
        //        if(this.processedUmlElements.containsKey(umlPackage)) {
        //            return this.processedUmlElements.get(umlPackage);
        //        } else {
        //            if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                    DeploymentTypeModel.STEREOTYPE_NAME)) {
        //                // factory
        //                camel.deployment.DeploymentTypeModel deploymentTypeModel = camel.deployment.DeploymentFactory.eINSTANCE.createDeploymentTypeModel();
        //                // set name
        //                deploymentTypeModel.setName(umlPackage.getName());
        //                // update parent
        //                CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
        //                camelModelParent.getDeploymentModels().add(deploymentTypeModel);
        //                //
        //                return deploymentTypeModel;
        //            }
        //
        //        }
=======
        if(this.processedUmlElements.containsKey(umlPackage)) {
            return this.processedUmlElements.get(umlPackage);
        } else {
            if(umlPackage.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    DeploymentTypeModel.STEREOTYPE_NAME)) {
                // factory
                camel.deployment.DeploymentTypeModel deploymentTypeModel = camel.deployment.DeploymentFactory.eINSTANCE.createDeploymentTypeModel();
                // set name
                deploymentTypeModel.setName(umlPackage.getName());
                // update parent
                CamelModel camelModelParent = (CamelModel) this.getCamelElementParent();
                camelModelParent.getDeploymentModels().add(deploymentTypeModel);
                //
                return deploymentTypeModel;
            }
        
        }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        return null;
    }

    @objid ("4f80a046-f179-4b54-a07e-0ce89685ff7d")
    private CDOObject generate(Component umlComponent) {
        //      if(this.processedUmlElements.containsKey(umlComponent)) {
        //          return this.processedUmlElements.get(umlComponent);
        //      } else {
        //          camel.deployment.DeploymentFactory.eINSTANCE.crea
        //          CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
        //          camelModel.setName(umlPackage.getName());
        //          return camelModel;
        //      }
        return null;
    }

    @objid ("35b62588-cc4d-4ceb-8f7b-d7faac8a4232")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("799afe8d-1afd-493d-ac82-9e80d595546d")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
