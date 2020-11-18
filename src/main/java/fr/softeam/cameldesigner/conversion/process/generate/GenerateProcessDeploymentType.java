package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.ProvidedCommunication;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.mapi.MObject;

public class GenerateProcessDeploymentType extends AbstractGenerateProcess {
    public GenerateProcessDeploymentType(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
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

    public CDOObject switchGenerate(ModelElement element) {
        if (element instanceof Component) {
            Component umlComponent = (Component) element;
            if(umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    SoftwareComponent.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel) {
                return generate((SoftwareComponent.instantiate(umlComponent)));
        
            } else if (umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    Container.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel){
                return generate((Container.instantiate(umlComponent)));
        
            } else if (umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    PaaS.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel){
                return generate((PaaS.instantiate(umlComponent)));
        
        
            } else if (umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    VM.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel){
                return generate((VM.instantiate(umlComponent)));
            }
        
        } else if (element instanceof Port) {
        
            Port umlPort = (Port) element;
        
            if (umlPort.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    HostingPort.STEREOTYPE_NAME)){
                return generate((HostingPort.instantiate(umlPort)));
        
            } else if (umlPort.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    CommunicationPort.STEREOTYPE_NAME)){
                return generate((CommunicationPort.instantiate(umlPort)));
            }
        
        } else if (element instanceof Artifact) {
            Artifact umlArtifact = (Artifact) element;
            if(umlArtifact.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ScriptConfiguration.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.deployment.Component) {
                return generate((ScriptConfiguration.instantiate(umlArtifact)));
        
            }
        
        } else if (element instanceof Class) {
            Class umlClass = (Class) element;
            if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    RequirementSet.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.deployment.DeploymentModel) {
                return generate((RequirementSet.instantiate(umlClass)));
        
            }
        }
        return null;
    }

    private CDOObject generate(CommunicationPort communicationPort) {
        if(communicationPort.getElement().getDirection().equals(PortOrientation.IN)
                && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
            camel.deployment.RequiredCommunication requiredCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createRequiredCommunication();
            requiredCommunication.setName(communicationPort.getElement().getName());
            if(communicationPort.getElement().getValue() != null) {
                requiredCommunication.setPortNumber(Integer.parseInt(communicationPort.getElement().getValue()));
            }
            ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getRequiredCommunications().add(requiredCommunication);
        
        
        
            /*
             * check for Communication Link
             */
            for(MObject umlChild : communicationPort.getElement().getCompositionChildren()) {
                if (umlChild instanceof ConnectorEnd) {
                    ConnectorEnd connectorEnd = (ConnectorEnd) umlChild;
        
                    if (connectorEnd.getTarget() instanceof Port
                            && ((Port) connectorEnd.getTarget()).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                                    CommunicationPort.STEREOTYPE_NAME)
                            && ((Port) connectorEnd.getTarget()).getDirection().equals(PortOrientation.OUT)) {
        
                        Port toUmlPort = (Port) connectorEnd.getTarget();
                        camel.deployment.ProvidedCommunication providedCommunication = null;
                        if( processedUmlElements.containsKey(toUmlPort)) {
        
                            providedCommunication = (ProvidedCommunication) processedUmlElements.get(toUmlPort);
                        } else {
        
                            providedCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedCommunication();
                            providedCommunication.setName(toUmlPort.getName());
                            processedUmlElements.put(toUmlPort,providedCommunication);
        
                        }
        
                        if(providedCommunication != null) {
                            camel.deployment.Communication communication = null;
        
                            if( processedUmlElements.containsKey(connectorEnd)) {
        
                                communication = (camel.deployment.Communication) processedUmlElements.get(connectorEnd);
                            } else {
                                communication = camel.deployment.DeploymentFactory.eINSTANCE.createCommunication();
                                if(communicationPort.getElement().getCompositionOwner() != null && toUmlPort.getCompositionOwner() != null) {
                                    communication.setName(communicationPort.getElement().getCompositionOwner().getName() + "To" + toUmlPort.getCompositionOwner().getName() );
                                    communication.setProvidedCommunication(providedCommunication);
                                    communication.setRequiredCommunication(requiredCommunication);
                                }
                                processedUmlElements.put(connectorEnd,communication);
        
                            }
        
                            /*
                             * Add communication to parent : deploymentTypeModel
                             */
                            if(communication != null
                                    && communicationPort.getElement().getCompositionOwner() != null
                                    && communicationPort.getElement().getCompositionOwner().getCompositionOwner() != null) {
                                MObject umlDeploymentTypeModel = communicationPort.getElement().getCompositionOwner().getCompositionOwner();
                                if(processedUmlElements.containsKey(umlDeploymentTypeModel)) {
                                    camel.deployment.DeploymentTypeModel deploymentTypeModel = (DeploymentTypeModel) processedUmlElements.get(umlDeploymentTypeModel);
                                    deploymentTypeModel.getCommunications().add(communication);
                                }
                            }
                        }
                    }
                }
            }
            return requiredCommunication;
        
        } else if (communicationPort.getElement().getDirection().equals(PortOrientation.OUT)
                && this.getCamelElementParent() instanceof camel.deployment.Component) {
            camel.deployment.ProvidedCommunication providedCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedCommunication();
            providedCommunication.setName(communicationPort.getElement().getName());
            if(communicationPort.getElement().getValue() != null) {
                providedCommunication.setPortNumber(Integer.parseInt(communicationPort.getElement().getValue()));
            }
            ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getProvidedCommunications().add(providedCommunication);
            return providedCommunication;
        }
        return null;
    }

    private CDOObject generate(HostingPort hostingPortProxy) {
        if(hostingPortProxy.getElement().getDirection().equals(PortOrientation.IN)
                && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
            camel.deployment.RequiredHost requiredHost = camel.deployment.DeploymentFactory.eINSTANCE.createRequiredHost();
            requiredHost.setName(hostingPortProxy.getElement().getName());
            ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).setRequiredHost(requiredHost);
        
            return requiredHost;
        } else if (hostingPortProxy.getElement().getDirection().equals(PortOrientation.OUT)
                && this.getCamelElementParent() instanceof camel.deployment.Component) {
            camel.deployment.ProvidedHost providedHost = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedHost();
            providedHost.setName(hostingPortProxy.getElement().getName());
            ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getProvidedHosts().add(providedHost);
            return providedHost;
        }
        return null;
    }

    private CDOObject generate(ScriptConfiguration scriptConfigurationProxy) {
        camel.deployment.ScriptConfiguration scriptConfiguration = camel.deployment.DeploymentFactory.eINSTANCE.createScriptConfiguration();
        scriptConfiguration.setName(scriptConfigurationProxy.getElement().getName());
        
        if(scriptConfigurationProxy.getDownloadCommandNote() != null) {
            scriptConfiguration.setDownloadCommand(scriptConfigurationProxy.getDownloadCommandNote());
        }
        if(scriptConfigurationProxy.getUploadCommandNote() != null) {
            scriptConfiguration.setUploadCommand(scriptConfigurationProxy.getUploadCommandNote());
        }
        if(scriptConfigurationProxy.getStartCommandNote() != null) {
            scriptConfiguration.setStartCommand(scriptConfigurationProxy.getStartCommandNote());
        }
        if(scriptConfigurationProxy.getStopCommandNote() != null) {
            scriptConfiguration.setStopCommand(scriptConfigurationProxy.getStopCommandNote());
        }
        if(scriptConfigurationProxy.getUpdateCommandNote() != null) {
            scriptConfiguration.setUpdateCommand(scriptConfigurationProxy.getUpdateCommandNote());
        }
        if(scriptConfigurationProxy.getDevopsTool() != null) {
            scriptConfiguration.setDevopsTool(scriptConfigurationProxy.getDevopsTool());
        }
        if(scriptConfigurationProxy.getImageId() != null) {
            scriptConfiguration.setImageId(scriptConfigurationProxy.getImageId());
        }
        if(scriptConfigurationProxy.getDownloadCommandNote() != null) {
            scriptConfiguration.setDownloadCommand(scriptConfigurationProxy.getDownloadCommandNote());
        }
        
        ((camel.deployment.Component)this.getCamelElementParent()).getConfigurations().add(scriptConfiguration);
        return scriptConfiguration;
    }

    private CDOObject generate(RequirementSet requirementSetProxy) {
        camel.deployment.RequirementSet requirementSet = camel.deployment.DeploymentFactory.eINSTANCE.createRequirementSet();
        requirementSet.setName(requirementSetProxy.getElement().getName());
        ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getRequirementSets().add(requirementSet);
        
        /*
         * Retrieve requirements links
         */
        //        if(requirementSetProxy.getHorizontalScaleRequirement() != null) {
        //            fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement referencedRequirement = retrieveReferencedRequirement(element.getHorizontalScaleRequirement());
        //            if(referencedRequirement != null) {
        //                proxyRequirementSet.setHorizontalScaleRequirement((HorizontalScaleRequirement) referencedRequirement);
        //            }
        //        }
        return requirementSet;
    }

    private CDOObject generate(VM vmProxy) {
        camel.deployment.VM vM = camel.deployment.DeploymentFactory.eINSTANCE.createVM();
        vM.setName(vmProxy.getElement().getName());
        ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getVms().add(vM);
        return vM;
    }

    private CDOObject generate(PaaS paaSProxy) {
        camel.deployment.PaaS paaS = camel.deployment.DeploymentFactory.eINSTANCE.createPaaS();
        paaS.setName(paaSProxy.getElement().getName());
        ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getPaases().add(paaS);
        return paaS;
    }

    private CDOObject generate(Container containerProxy) {
        camel.deployment.Container container = camel.deployment.DeploymentFactory.eINSTANCE.createContainer();
        container.setName(containerProxy.getElement().getName());
        ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getContainers().add(container);
        return container;
    }

    private CDOObject generate(SoftwareComponent softwareComponentProxy) {
        camel.deployment.SoftwareComponent softwareComponent = camel.deployment.DeploymentFactory.eINSTANCE.createSoftwareComponent();
        softwareComponent.setName(softwareComponentProxy.getElement().getName());
        ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getSoftwareComponents().add(softwareComponent);
        
        if(softwareComponentProxy.getRequirementSet() != null) {
            camel.deployment.RequirementSet referencedRequirementSet = retrieveReferencedRequirementSet(softwareComponentProxy.getRequirementSet());
            if(referencedRequirementSet != null) {
                softwareComponent.setRequirementSet(referencedRequirementSet);
            }
        }
        return softwareComponent;
    }

    private camel.deployment.RequirementSet retrieveReferencedRequirementSet(RequirementSet requirementSet) {
        camel.deployment.RequirementSet referencedRequirementSet = null;
        if(this.processedUmlElements.containsKey(requirementSet.getElement())) {
            referencedRequirementSet = (camel.deployment.RequirementSet) this.processedUmlElements.get(requirementSet.getElement());
        } else {
            referencedRequirementSet = (camel.deployment.RequirementSet) this.switchGenerate(requirementSet.getElement());
            this.processedUmlElements.put(requirementSet.getElement(), referencedRequirementSet);
        }
        return referencedRequirementSet;
    }

}
