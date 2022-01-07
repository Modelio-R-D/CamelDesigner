package fr.softeam.cameldesigner.conversion.process.generate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

@objid ("d9525362-2dd9-4c59-82f9-9d081a9b1f84")
public class GenerateProcessType extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("251003e1-116b-4be6-825f-681e800050ab")
    public GenerateProcessType(CDOObject camelElementParent) {
        super(camelElementParent);
    }

    @objid ("d4273002-8f70-4ebb-9408-f6a001307026")
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

    @objid ("5693f843-5293-4604-8f6c-7d9e506113a4")
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

    @objid ("72c81b9e-b596-486e-917f-b696869edb00")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("6d104e33-ebbb-41b7-a727-cc32c2f2df07")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("dbfa9277-7cad-4d6c-bde9-db47cf2dceb4")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
