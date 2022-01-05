package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.deployment.Communication;
import camel.deployment.Configuration;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.ProvidedCommunication;
import camel.deployment.ProvidedHost;
import camel.deployment.RequiredCommunication;
import camel.deployment.RequirementSet;
import camel.deployment.SoftwareComponent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

@objid ("fed535fe-80ca-4103-9ee6-aae72029a711")
public class DeploymentTypeWalker extends AbstractCamelWalker {
    @objid ("27c8997b-be13-4835-9104-7a8c8401e94a")
    public DeploymentTypeWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

    @objid ("06c34b1c-ce33-4ef8-9430-180fd13035d9")
    @Override
    protected void walkChildren(Object processedElement, CamelElement resultedElement) {
        if(processedElement instanceof DeploymentTypeModel) {
        
            DeploymentTypeModel deploymentTypeModel = (DeploymentTypeModel) processedElement;
        
            for(SoftwareComponent softwareComponent : deploymentTypeModel.getSoftwareComponents()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(softwareComponent);
            }            
            //            for(VM vM : deploymentTypeModel.getVms()) {
            //                walk(vM);
            //            }            
            //            for(PaaS paaS : deploymentTypeModel.getPaases()) {
            //                walk(paaS);
            //            }            
            for(Communication communication : deploymentTypeModel.getCommunications()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(communication);
            }         
            //            for(Hosting hosting : deploymentTypeModel.getHostings()) {
            //                walk(hosting);
            //            }     
            //            if(deploymentTypeModel.getGlobalRequirementSet() != null) {
            //                walk(deploymentTypeModel.getGlobalRequirementSet());
            //            }
            for(RequirementSet requirementSet : deploymentTypeModel.getRequirementSets()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(requirementSet);
            }
            //            for(LocationCoupling locationCoupling : deploymentTypeModel.getLocationCouplings()) {
            //                walk(locationCoupling);
            //            }
            //            for(Container container : deploymentTypeModel.getContainers()) {
            //                walk(container);
            //            }
        
        
        } else if (processedElement instanceof SoftwareComponent) {
        
            SoftwareComponent softwareComponent = (SoftwareComponent) processedElement;
        
            this.reverseProcess.setUmlElementParent(resultedElement.getElement());
            walk(softwareComponent.getRequiredHost());
        
            for(ProvidedHost providedHost :  softwareComponent.getProvidedHosts()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(providedHost);
        
            }
        
            for(RequiredCommunication requiredCommunication :  softwareComponent.getRequiredCommunications()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(requiredCommunication);
        
            }
        
            for(ProvidedCommunication providedCommunication :  softwareComponent.getProvidedCommunications()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(providedCommunication);
        
            }
        
        
            for(Configuration configuration :  softwareComponent.getConfigurations()) {
                this.reverseProcess.setUmlElementParent(resultedElement.getElement());
                walk(configuration);
        
            }
        
        
        }
    }

}
