package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import camel.core.CamelModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

@objid ("84b8fb9a-638c-4fcb-a21c-efc0d2aff125")
public class GenerateProcessScalability extends AbstractGenerateProcess<fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement,CDOObject> {
    @objid ("8c523f8b-c87e-4b92-b250-7a70f4a75d87")
    public GenerateProcessScalability(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
    }

    @objid ("ce23e61f-6c32-47bb-bf49-2fb2f01e3716")
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

    @objid ("33f2337f-4609-4e7f-b1be-2ffb22064a23")
    private CDOObject generate(Package umlPackage) {
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
        return null;
    }

    @objid ("a3a482bf-3f8d-4364-89e0-336efc20d87e")
    private CDOObject generate(Component umlComponent) {
        return null;
    }

    @objid ("42d7e9db-fe19-4843-afa8-c78d8de7ada0")
    private CDOObject generate(Class umlClass) {
        return null;
    }

    @objid ("86e735bf-b25d-4f5a-89e4-bc18d40447a6")
    @Override
    protected void updateParent(CDOObject processedElement) {
        // TODO Auto-generated method stub
    }

}
