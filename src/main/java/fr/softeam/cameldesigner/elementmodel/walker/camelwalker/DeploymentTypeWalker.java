package fr.softeam.cameldesigner.elementmodel.walker.camelwalker;

import camel.deployment.Communication;
import camel.deployment.Configuration;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.ProvidedCommunication;
import camel.deployment.ProvidedHost;
import camel.deployment.RequiredCommunication;
import camel.deployment.RequirementSet;
import camel.deployment.SoftwareComponent;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.process.reverse.AbstractReverseProcess;

public class DeploymentTypeWalker extends AbstractCamelWalker {
    public DeploymentTypeWalker(AbstractReverseProcess reverseProcess) {
        this.reverseProcess = reverseProcess;
    }

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
