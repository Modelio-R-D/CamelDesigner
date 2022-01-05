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

@objid ("a2807bba-03e4-44ad-9711-1073dcaf6052")
public class GenerateProcessLocation extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("5c924258-4fda-43d8-a033-b04d88c0e318")
<<<<<<< HEAD
    public GenerateProcessLocation(CDOObject camelElementParent) {
        super(camelElementParent);
=======
    public GenerateProcessLocation(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    }

    @objid ("d254e97f-34ca-46ff-b696-8a7853025ec4")
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

    @objid ("36fe50ff-abd6-4106-822e-1dad48ff679a")
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

    @objid ("4f991643-433d-420d-9e42-69401664b18d")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("5515dfbc-775d-4dba-94cb-938011eab1d9")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("a98ef7ef-9169-47a6-9539-add404e89204")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
