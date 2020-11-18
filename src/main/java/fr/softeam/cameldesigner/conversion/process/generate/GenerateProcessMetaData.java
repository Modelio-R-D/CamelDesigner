package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import camel.core.CamelModel;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;

public class GenerateProcessMetaData extends AbstractGenerateProcess {
    public GenerateProcessMetaData(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
    }

    @Override
    public CDOObject process(ModelElement element) {
        CDOObject processedElement = null;
        
        
        if(this.processedUmlElements.containsKey(element)) {
            processedElement = this.processedUmlElements.get(element);
        } else {
            processedElement = switchGenerate (element);
            if(processedElement != null) {
        
                this.processedUmlElements.put(element, processedElement);
            }        
        }
        return processedElement;
    }

    private CDOObject switchGenerate(ModelElement element) {
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

    private CDOObject generate(Component umlComponent) {
        return null;
    }

    private CDOObject generate(Class umlClass) {
        return null;
    }

}
