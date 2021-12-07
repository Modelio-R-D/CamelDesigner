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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("5c7d0fea-5720-4505-9709-5bcfaec4af3e")
public class ReverseProcessDeploymentType extends AbstractReverseProcess {
    @objid ("413e1104-a89f-46c0-a8e5-b02d7b8a2222")
    public ReverseProcessDeploymentType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("749ed05e-d253-4563-ab86-1f1a98d1ed50")
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

    @objid ("5e0d3ec1-fb5b-4d42-b79d-e7f8feff40df")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling reverse(LocationCoupling element) {
        // TODO
        return null;
    }

    @objid ("486d927b-0830-4c5a-8a3b-029f586d3cbb")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort reverse(ProvidedHost element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort providedHost = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
        providedHost.getElement().setDirection(PortOrientation.OUT);
        return providedHost;
    }

    @objid ("d8c78443-2729-498a-b70f-67e505c05870")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort reverse(RequiredHost element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort requiredHost = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
        requiredHost.getElement().setDirection(PortOrientation.IN);
        return requiredHost;
    }

    @objid ("6159c34c-40e4-447f-be89-26f422f22293")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration reverse(ServerlessConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.create();
    }

    @objid ("7b0c99c4-18e7-4428-b543-a8721adb17c4")
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

    @objid ("72e487b2-ee25-4fca-bd67-9015cdb6c84d")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration reverse(PaaSConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.create();
    }

    @objid ("205d61ed-290b-459b-a351-c420b8ad511c")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration reverse(EventConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.create();
    }

    @objid ("a76dbf27-6d93-4942-8357-c13bdc822b64")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration reverse(ClusterConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.create();
    }

    @objid ("b66e9b4c-82a8-49b9-948b-aff42b0d568a")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration reverse(BuildConfiguration element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.create();
    }

    @objid ("dff4b391-3e21-4f47-a8df-be310e4c900e")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM reverse(VM element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.create();
    }

    @objid ("33fe6234-1942-4bfe-92c9-e8baf82a696d")
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

    @objid ("5bc17562-b2e4-43e4-add0-1622d8ac2a8e")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS reverse(PaaS element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.create();
    }

    @objid ("4c14aa15-29f2-4b19-8602-f69dbf86a67b")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container reverse(Container element) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.create();
    }

    @objid ("bdc5b341-0005-467b-8d53-6e7d8399374b")
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

    @objid ("c32f9be8-1e64-4777-8f2e-4f54e476c0b7")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort reverse(RequiredCommunication element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort requiredCommunication = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
        requiredCommunication.getElement().setDirection(PortOrientation.IN);
        requiredCommunication.getElement().setValue(Integer.toString(element.getPortNumber()));
        requiredCommunication.setIsMandatory(requiredCommunication.isIsMandatory());
        return requiredCommunication;
    }

    @objid ("c198498f-c869-4d6e-b451-c23b3377163a")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort reverse(ProvidedCommunication element) {
        fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort providedCommunication = fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
        providedCommunication.getElement().setDirection(PortOrientation.OUT);
        providedCommunication.getElement().setValue(Integer.toString(element.getPortNumber()));
        return providedCommunication;
    }

    @objid ("9797b513-fa61-46b2-af8b-f3b72f6116e0")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort reverse(Hosting element) {
        //return fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.Hosting.create();
        return null;
    }

    @objid ("09fda022-85ff-4b32-8de1-098c0bb8e989")
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

    @objid ("88931e9e-83f5-433d-b8aa-781e3fd777c7")
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

    @objid ("13ff5233-2025-4b3d-993b-9cf182947bf2")
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

    @objid ("99d53fae-8566-445e-abca-06806f88e74d")
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
