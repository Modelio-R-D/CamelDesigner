package fr.softeam.cameldesigner.conversion.process.generate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

@objid ("c54de0ff-4938-4ad5-96bc-51b8c06625ab")
public class GenerateProcessDataInstance extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("2e44900e-00d1-426e-bf08-35b8cf8fe0f0")
    public GenerateProcessDataInstance(CDOObject camelElementParent) {
        super(camelElementParent);
    }

    @objid ("9c48f32b-7083-421b-afee-2d0be68e266a")
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

    @objid ("7a74314d-32cd-4ec4-8a18-0f6fc39c16f0")
    private CDOObject generate(Package umlPackage) {
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
        return null;
    }

    @objid ("491f665e-df9c-4574-9ebb-f6db594046f9")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("787a23ad-aa3c-404b-a706-abb6a6163bf6")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("f3722e25-ba76-4954-bbaa-5339a0528dfd")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
