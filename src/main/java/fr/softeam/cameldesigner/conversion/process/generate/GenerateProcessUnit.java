package fr.softeam.cameldesigner.conversion.process.generate;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

@objid ("2d71dfa5-bb2c-48a3-a82b-911ec3916eab")
public class GenerateProcessUnit extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("b1a1c420-5ac3-400c-8f60-8dd9d427d9de")
    public GenerateProcessUnit(CDOObject camelElementParent) {
        super(camelElementParent);
    }

    @objid ("d3a4fe9a-2e2f-4b74-91c4-f72052e933fb")
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

    @objid ("031f274e-2f64-42b1-ac1a-41dea692733f")
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

    @objid ("8cba1d78-3c79-4c10-b928-b55fdc3d88b9")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("3b20e8dc-c121-4c51-9134-b981c26f559b")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("fdb65a72-3d44-4dea-a35d-de9f4400a79b")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
