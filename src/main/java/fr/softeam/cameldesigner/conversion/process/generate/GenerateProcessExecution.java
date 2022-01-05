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

@objid ("7efe6de9-cb76-40d6-9549-b9e7d60389e2")
public class GenerateProcessExecution extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("d9141f82-dc06-4639-bb0e-a89789e2b026")
<<<<<<< HEAD
    public GenerateProcessExecution(CDOObject camelElementParent) {
        super(camelElementParent);
=======
    public GenerateProcessExecution(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    }

    @objid ("d66a59f4-726b-4628-a8dd-e1f40b8633a1")
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
        }
        return null;
    }

    @objid ("603e5ba8-f168-4dae-bcf8-e6cfafd84f44")
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

    @objid ("dbca31d2-fb96-4c01-b373-5af6e497f05a")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("d66ddde8-a2ee-49b0-810c-8470c6cff418")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("7a446e13-2af2-4edb-9d3a-99d4094be84d")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
