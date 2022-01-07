package fr.softeam.cameldesigner.conversion.process.generate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

@objid ("aa1968c7-ae1b-485a-9b39-abbc7e89a0f4")
public class GenerateProcessConstraint extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("59d852ab-9c3a-4c6f-8705-882cdba91215")
    public GenerateProcessConstraint(CDOObject camelElementParent) {
        super(camelElementParent);
    }

    @objid ("cabc5520-bfd3-4dda-8bc0-26e04d99307a")
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

    @objid ("2661fa64-99e5-4b8f-ab3f-5a7a8826f0c3")
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

    @objid ("fc40a606-14a9-4687-bf77-ad31d5f6c22e")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("c43584dd-9a97-4af9-a353-dfe04c5a384c")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("f5abd8b6-8475-43a7-a9ce-afc5af3c5181")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
