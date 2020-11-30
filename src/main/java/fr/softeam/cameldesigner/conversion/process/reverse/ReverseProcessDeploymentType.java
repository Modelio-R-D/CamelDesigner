package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.core.NamedElement;
import camel.deployment.BuildConfiguration;
import camel.deployment.ClusterConfiguration;
import camel.deployment.Communication;
import camel.deployment.CommunicationPort;
import camel.deployment.Container;
import camel.deployment.EventConfiguration;
import camel.deployment.Hosting;
import camel.deployment.HostingPort;
import camel.deployment.LocationCoupling;
import camel.deployment.PaaS;
import camel.deployment.PaaSConfiguration;
import camel.deployment.ProvidedCommunication;
import camel.deployment.ProvidedHost;
import camel.deployment.RequiredCommunication;
import camel.deployment.RequiredHost;
import camel.deployment.RequirementSet;
import camel.deployment.ScriptConfiguration;
import camel.deployment.ServerlessConfiguration;
import camel.deployment.SoftwareComponent;
import camel.deployment.VM;
import camel.requirement.Requirement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.PortOrientation;

public class ReverseProcessDeploymentType extends AbstractReverseProcess {
    public ReverseProcessDeploymentType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet reverse(RequirementSet element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet proxyRequirementSet = fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.create();
        
        
        if(element.getHorizontalScaleRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getHorizontalScaleRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setHorizontalScaleRequirement((HorizontalScaleRequirement) referencedRequirement);
            }
        }
        
        if(element.getImageRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getImageRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setImageRequirement( (ImageRequirement) referencedRequirement);
            }
        }
        
        if(element.getLocationRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getLocationRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setLocationRequirement((LocationRequirement) referencedRequirement);
            }
        }
        
        if(element.getOsRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getOsRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setOsRequirement((OSRequirement) referencedRequirement);
            }
        }
        
        
        if(element.getPaasRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getPaasRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setPaasRequirement((PaaSRequirement) referencedRequirement);
            }
        }
        
        if(element.getProviderRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getProviderRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setProviderRequirement((ProviderRequirement) referencedRequirement);
            }
        }
        
        if(element.getResourceRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getResourceRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setResourceRequirement((ResourceRequirement) referencedRequirement);
            }
        }
        
        if(element.getSecurityRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getSecurityRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setSecurityRequirement((SecurityRequirement) referencedRequirement);
            }
        }
        
        if(element.getVerticalScaleRequirement() != null) {
            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getVerticalScaleRequirement());
            if(referencedRequirement != null) {
                proxyRequirementSet.setVerticalScaleRequirement((VerticalScaleRequirement) referencedRequirement);
            }
        }
        return proxyRequirementSet;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling reverse(LocationCoupling element) {
        // TODO
        return null;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort reverse(ProvidedHost element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort providedHost = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
        providedHost.getElement().setDirection(PortOrientation.OUT);
        return providedHost;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort reverse(RequiredHost element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort requiredHost = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
        requiredHost.getElement().setDirection(PortOrientation.IN);
        return requiredHost;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration reverse(ServerlessConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration reverse(ScriptConfiguration element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration proxyScriptConfiguration = null;
        proxyScriptConfiguration = fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.create();
        if(proxyScriptConfiguration != null) {
            if(element.getDownloadCommand() != null) {
                proxyScriptConfiguration.setDownloadCommandNote(element.getDownloadCommand());
            }
            if(element.getUploadCommand() != null) {
                proxyScriptConfiguration.setUploadCommandNote(element.getUploadCommand());
            }
            if(element.getStartCommand() != null) {
                proxyScriptConfiguration.setStartCommandNote(element.getStartCommand());
            }
            if(element.getStopCommand() != null) {
                proxyScriptConfiguration.setStopCommandNote(element.getStopCommand());
            }
            if(element.getConfigureCommand() != null) {
                proxyScriptConfiguration.setConfigureCommandNote(element.getConfigureCommand());
            }
            if(element.getUpdateCommand() != null) {
                proxyScriptConfiguration.setUpdateCommandNote(element.getUpdateCommand());
            }
            if(element.getDevopsTool() != null) {
                proxyScriptConfiguration.setDevopsTool(element.getDevopsTool());
            }
            if(element.getOs() != null) {
                proxyScriptConfiguration.setOs(element.getOs());
            }
            if(element.getImageId() != null) {
                proxyScriptConfiguration.setImageId(element.getImageId());
            }
            return proxyScriptConfiguration;
        }
        return null;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration reverse(PaaSConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration reverse(EventConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration reverse(ClusterConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration reverse(BuildConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM reverse(VM element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent reverse(SoftwareComponent element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent softwareComponentProxy = fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.create();
        
        if(element.getRequirementSet() != null) {
            fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet referencedRequirementSet = retrieveReferencedRequirementSet(element.getRequirementSet());
            if(referencedRequirementSet != null) {
                softwareComponentProxy.setRequirementSet(referencedRequirementSet);
            }
        
        }
        return softwareComponentProxy;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS reverse(PaaS element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container reverse(Container element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.create();
    }

    @Override
    public CamelElement switchReverse(CDOObject element) {
        if (element instanceof Container){
            return reverse ((Container) element);
        }  else if (element instanceof PaaS){
            return reverse ((PaaS) element);
        }  else if (element instanceof SoftwareComponent){
            return reverse ((SoftwareComponent) element);
        } else if  (element instanceof VM){
            return reverse ((VM) element);
        }
        else if  (element instanceof Communication){
            return reverse ((Communication) element);
        }
        else if  (element instanceof BuildConfiguration){
            return reverse ((BuildConfiguration) element);
        }  else if (element instanceof ClusterConfiguration){
            return reverse ((ClusterConfiguration) element);
        }  else if (element instanceof EventConfiguration){
            return reverse ((EventConfiguration) element);
        } else if  (element instanceof PaaSConfiguration){
            return reverse ((PaaSConfiguration) element);
        }  else if (element instanceof ScriptConfiguration){
            return reverse ((ScriptConfiguration) element);
        }  else if (element instanceof ServerlessConfiguration){
            return reverse ((ServerlessConfiguration) element);
        } else if (element instanceof Hosting){
            return reverse ((Hosting) element);
        }  else if (element instanceof LocationCoupling){
            return reverse ((LocationCoupling) element);
        }  else if (element instanceof RequirementSet){
            return reverse ((RequirementSet) element);
        }
        else if  (element instanceof CommunicationPort){
            if(element instanceof ProvidedCommunication){
                return reverse ((ProvidedCommunication) element);
        
            } else if  (element instanceof RequiredCommunication){
                return reverse ((RequiredCommunication) element);
        
            }
        } else if  (element instanceof HostingPort){
            if(element instanceof RequiredHost){
                return reverse ((RequiredHost) element);
        
            } else if  (element instanceof ProvidedHost){
                return reverse ((ProvidedHost) element);
        
            }
        }
        return null;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort reverse(RequiredCommunication element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort requiredCommunication = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
        requiredCommunication.getElement().setDirection(PortOrientation.IN);
        requiredCommunication.getElement().setValue(Integer.toString(element.getPortNumber()));
        return requiredCommunication;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort reverse(ProvidedCommunication element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort providedCommunication = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
        providedCommunication.getElement().setDirection(PortOrientation.OUT);
        providedCommunication.getElement().setValue(Integer.toString(element.getPortNumber()));
        return providedCommunication;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort reverse(Hosting element) {
        //return fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.Hosting.create();
        return null;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication reverse(Communication communication) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort proxyProvidedCommunication = null;
        if(this.processedCamelElements.containsKey(communication.getProvidedCommunication())) {
            proxyProvidedCommunication =  (fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) this.processedCamelElements.get(communication.getProvidedCommunication());
        } else {
            proxyProvidedCommunication = reverse(communication.getProvidedCommunication());
            if(proxyProvidedCommunication != null) {
                proxyProvidedCommunication.getElement().setName(communication.getProvidedCommunication().getName());
                this.processedCamelElements.put(communication.getProvidedCommunication(), proxyProvidedCommunication);
            }
        }
        
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort proxyRequiredCommunication = null;
        if(this.processedCamelElements.containsKey(communication.getRequiredCommunication())) {
            proxyRequiredCommunication = (fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) this.processedCamelElements.get(communication.getRequiredCommunication());
        } else {
            proxyRequiredCommunication = reverse(communication.getRequiredCommunication());
            if(proxyRequiredCommunication != null) {
                proxyRequiredCommunication.getElement().setName(communication.getRequiredCommunication().getName());
                this.processedCamelElements.put(communication.getRequiredCommunication(), proxyProvidedCommunication);
            }
        }
        
        fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication proxyCommunication = fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.create();
        
        
        
        IUmlModel umlModel = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel();
        
        ConnectorEnd endSource = umlModel.createConnectorEnd();
        ConnectorEnd endTarget = umlModel.createConnectorEnd();
        
        
        
        
        endSource.setSource((Instance) proxyProvidedCommunication.getElement());
        endSource.setTarget((Instance) proxyRequiredCommunication.getElement());
        
        proxyCommunication.getElement().getLinkEnd().add(endTarget);
        
        proxyCommunication.getElement().getLinkEnd().add(endSource);
        
        endSource.setOpposite(endTarget);
        endTarget.setOpposite(endSource);
        
        endSource.setNavigable(false);
        endTarget.setNavigable(true);
        return proxyCommunication;
    }

    @Override
    protected void updateOwner(ModelElement reversedElement, CDOObject element) {
        if(element instanceof Communication) {
            ProvidedCommunication providedCommunication = ((Communication) element).getProvidedCommunication();
            CamelElement umlProvidedCommunication = null;
            if(this.processedCamelElements.containsKey(providedCommunication)) {
                umlProvidedCommunication = this.processedCamelElements.get(providedCommunication);
            } else {
                umlProvidedCommunication = reverse(providedCommunication);
                if(umlProvidedCommunication != null) {
                    if(element instanceof NamedElement) {
                        umlProvidedCommunication.getElement().setName(providedCommunication.getName());
                    }
                    this.processedCamelElements.put(providedCommunication, umlProvidedCommunication);
                }
            }
        
            this.setUmlElementParent(umlProvidedCommunication.getElement());
        }
        super.updateOwner(reversedElement, element);
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement retrieveReferencedRequirement(Requirement requirementElement) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = null;
        if(this.processedCamelElements.containsKey(requirementElement)) {
        
            referencedRequirement = (fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement) this.processedCamelElements.get(requirementElement);
        } else {
        
            referencedRequirement = (fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement) (new ReverseProcessRequirement(null, this.processedCamelElements)).switchReverse(requirementElement);
            referencedRequirement.getElement().setName(requirementElement.getName());
            this.processedCamelElements.put(requirementElement, referencedRequirement);
        }
        return referencedRequirement;
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet retrieveReferencedRequirementSet(RequirementSet requirementSet) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet referencedRequirementSet = null;
        if(this.processedCamelElements.containsKey(requirementSet)) {
        
            referencedRequirementSet = (fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet) this.processedCamelElements.get(requirementSet);
        } else {
        
            referencedRequirementSet = (fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet) this.switchReverse(requirementSet);
            referencedRequirementSet.getElement().setName(requirementSet.getName());
            this.processedCamelElements.put(requirementSet, referencedRequirementSet);
        }
        return referencedRequirementSet;
    }

}
