package fr.softeam.cameldesigner.conversion.process.generate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

@objid ("a76caa85-241f-4026-b46b-d76df8a05237")
public class GenerateProcessOrganisation extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("0256686c-eb64-4b2f-827e-30f846ce8ede")
    public GenerateProcessOrganisation(CDOObject camelElementParent) {
        super(camelElementParent);
    }

    @objid ("acad13fa-9c92-4d4c-990b-7bd6215f3b3e")
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

    @objid ("67f334dd-7b67-47cf-9780-a19494338fc8")
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

    @objid ("80b69ec1-2d59-40b4-8cf1-b0f6b418bf1f")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("71c8adfb-0367-4a89-a638-986b611c7a3b")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("e838d032-7d7a-4c60-b99f-56ae4024f47c")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
