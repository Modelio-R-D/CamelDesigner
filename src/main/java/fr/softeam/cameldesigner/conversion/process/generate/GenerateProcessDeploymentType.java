package fr.softeam.cameldesigner.conversion.process.generate;

<<<<<<< HEAD
=======
import java.util.Map;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.ProvidedCommunication;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
<<<<<<< HEAD
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
=======
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.mapi.MObject;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213

@objid ("f334256e-e2e4-4371-a04f-ed274076e208")
public class GenerateProcessDeploymentType extends AbstractGenerateProcess {
    @objid ("74a5e7ec-5211-4906-858c-3216551224bd")
<<<<<<< HEAD
    public GenerateProcessDeploymentType(CDOObject camelElementParent) {
        super(camelElementParent);
=======
    public GenerateProcessDeploymentType(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    }

    @objid ("684bf8da-da25-49b1-beec-9c054b4b922a")
    @Override
    protected CDOObject switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement camelElement) {
        ModelElement element = camelElement.getElement();
        if (element instanceof Component) {
            Component umlComponent = (Component) element;
            if(umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME)) {
                return generate((SoftwareComponent.instantiate(umlComponent)));
            } else if (umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME)){
                return generate((Container.instantiate(umlComponent)));
            } else if (umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME)){
                return generate((PaaS.instantiate(umlComponent)));
            } else if (umlComponent.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME)){
                return generate((VM.instantiate(umlComponent)));
            }
        } else if (element instanceof Port) {
            Port umlPort = (Port) element;
            if (umlPort.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME)){
                return generate((HostingPort.instantiate(umlPort)));
            } else if (umlPort.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPort.STEREOTYPE_NAME)){
                return generate((CommunicationPort.instantiate(umlPort)));
            }
        } else if (element instanceof Artifact) {
            Artifact umlArtifact = (Artifact) element;
            if(umlArtifact.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScriptConfiguration.STEREOTYPE_NAME)) {
                return generate((ScriptConfiguration.instantiate(umlArtifact)));
            }
        } else if (element instanceof Class) {
            Class umlClass = (Class) element;
            if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME)) {
                return generate((RequirementSet.instantiate(umlClass)));
            }
        }
        return null;
    }

    @objid ("d4c22194-df76-429a-a6cd-98b79d1ba492")
    private CDOObject generate(CommunicationPort communicationPort) {
<<<<<<< HEAD
        //        if(communicationPort.getElement().getDirection().equals(PortOrientation.IN)) {
        //            camel.deployment.RequiredCommunication requiredCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createRequiredCommunication();
        //            requiredCommunication.setName(communicationPort.getElement().getName());
        //            if(communicationPort.getElement().getValue() != null) {
        //                requiredCommunication.setPortNumber(Integer.parseInt(communicationPort.getElement().getValue()));
        //            }
        //            if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
        //                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getRequiredCommunications().add(requiredCommunication);
        //            }
        //
        //
        //            /*
        //             * check for Communication Link
        //             */
        //            for(MObject umlChild : communicationPort.getElement().getCompositionChildren()) {
        //                if (umlChild instanceof ConnectorEnd) {
        //                    ConnectorEnd connectorEnd = (ConnectorEnd) umlChild;
        //
        //                    if (connectorEnd.getTarget() instanceof Port
        //                            && ((Port) connectorEnd.getTarget()).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
        //                                    CommunicationPort.STEREOTYPE_NAME)
        //                            && ((Port) connectorEnd.getTarget()).getDirection().equals(PortOrientation.OUT)) {
        //
        //                        Port toUmlPort = (Port) connectorEnd.getTarget();
        //                        camel.deployment.ProvidedCommunication providedCommunication = null;
        //                        if( this.processedUmlElements.containsKey(toUmlPort)) {
        //
        //                            providedCommunication = (ProvidedCommunication) this.processedUmlElements.get(toUmlPort);
        //                        } else {
        //
        //                            providedCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedCommunication();
        //                            providedCommunication.setName(toUmlPort.getName());
        //                            this.processedUmlElements.put(toUmlPort,providedCommunication);
        //
        //                        }
        //
        //                        if(providedCommunication != null) {
        //                            camel.deployment.Communication communication = null;
        //
        //                            if( this.processedUmlElements.containsKey(connectorEnd)) {
        //
        //                                communication = (camel.deployment.Communication) this.processedUmlElements.get(connectorEnd);
        //                            } else {
        //                                communication = camel.deployment.DeploymentFactory.eINSTANCE.createCommunication();
        //                                if(communicationPort.getElement().getCompositionOwner() != null && toUmlPort.getCompositionOwner() != null) {
        //                                    communication.setName(communicationPort.getElement().getCompositionOwner().getName() + "To" + toUmlPort.getCompositionOwner().getName() );
        //                                    communication.setProvidedCommunication(providedCommunication);
        //                                    communication.setRequiredCommunication(requiredCommunication);
        //                                }
        //                                this.processedUmlElements.put(connectorEnd,communication);
        //
        //                            }
        //
        //                            /*
        //                             * Add communication to parent : deploymentTypeModel
        //                             */
        //                            if(communication != null
        //                                    && communicationPort.getElement().getCompositionOwner() != null
        //                                    && communicationPort.getElement().getCompositionOwner().getCompositionOwner() != null) {
        //                                MObject umlDeploymentTypeModel = communicationPort.getElement().getCompositionOwner().getCompositionOwner();
        //                                if(this.processedUmlElements.containsKey(umlDeploymentTypeModel)) {
        //                                    camel.deployment.DeploymentTypeModel deploymentTypeModel = (DeploymentTypeModel) this.processedUmlElements.get(umlDeploymentTypeModel);
        //                                    deploymentTypeModel.getCommunications().add(communication);
        //                                }
        //                            }
        //                        }
        //                    }
        //                }
        //            }
        //            return requiredCommunication;
        //
        //        } else if (communicationPort.getElement().getDirection().equals(PortOrientation.OUT)) {
        //            camel.deployment.ProvidedCommunication providedCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedCommunication();
        //            providedCommunication.setName(communicationPort.getElement().getName());
        //            if(communicationPort.getElement().getValue() != null) {
        //                providedCommunication.setPortNumber(Integer.parseInt(communicationPort.getElement().getValue()));
        //            }
        //            if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
        //                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getProvidedCommunications().add(providedCommunication);
        //            }
        //            return providedCommunication;
        //        }
=======
        if(communicationPort.getElement().getDirection().equals(PortOrientation.IN)) {
            camel.deployment.RequiredCommunication requiredCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createRequiredCommunication();
            requiredCommunication.setName(communicationPort.getElement().getName());
            if(communicationPort.getElement().getValue() != null) {
                requiredCommunication.setPortNumber(Integer.parseInt(communicationPort.getElement().getValue()));
            }
            if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getRequiredCommunications().add(requiredCommunication);
            }
        
        
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
                        if( this.processedUmlElements.containsKey(toUmlPort)) {
        
                            providedCommunication = (ProvidedCommunication) this.processedUmlElements.get(toUmlPort);
                        } else {
        
                            providedCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedCommunication();
                            providedCommunication.setName(toUmlPort.getName());
                            this.processedUmlElements.put(toUmlPort,providedCommunication);
        
                        }
        
                        if(providedCommunication != null) {
                            camel.deployment.Communication communication = null;
        
                            if( this.processedUmlElements.containsKey(connectorEnd)) {
        
                                communication = (camel.deployment.Communication) this.processedUmlElements.get(connectorEnd);
                            } else {
                                communication = camel.deployment.DeploymentFactory.eINSTANCE.createCommunication();
                                if(communicationPort.getElement().getCompositionOwner() != null && toUmlPort.getCompositionOwner() != null) {
                                    communication.setName(communicationPort.getElement().getCompositionOwner().getName() + "To" + toUmlPort.getCompositionOwner().getName() );
                                    communication.setProvidedCommunication(providedCommunication);
                                    communication.setRequiredCommunication(requiredCommunication);
                                }
                                this.processedUmlElements.put(connectorEnd,communication);
        
                            }
        
                            /*
                             * Add communication to parent : deploymentTypeModel
                             */
                            if(communication != null
                                    && communicationPort.getElement().getCompositionOwner() != null
                                    && communicationPort.getElement().getCompositionOwner().getCompositionOwner() != null) {
                                MObject umlDeploymentTypeModel = communicationPort.getElement().getCompositionOwner().getCompositionOwner();
                                if(this.processedUmlElements.containsKey(umlDeploymentTypeModel)) {
                                    camel.deployment.DeploymentTypeModel deploymentTypeModel = (DeploymentTypeModel) this.processedUmlElements.get(umlDeploymentTypeModel);
                                    deploymentTypeModel.getCommunications().add(communication);
                                }
                            }
                        }
                    }
                }
            }
            return requiredCommunication;
        
        } else if (communicationPort.getElement().getDirection().equals(PortOrientation.OUT)) {
            camel.deployment.ProvidedCommunication providedCommunication = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedCommunication();
            providedCommunication.setName(communicationPort.getElement().getName());
            if(communicationPort.getElement().getValue() != null) {
                providedCommunication.setPortNumber(Integer.parseInt(communicationPort.getElement().getValue()));
            }
            if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getProvidedCommunications().add(providedCommunication);
            }
            return providedCommunication;
        }
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
        return null;
    }

    @objid ("3d2a3854-a85e-4ed3-b81e-dbc4b5e04c0a")
    private CDOObject generate(HostingPort hostingPortProxy) {
        if(hostingPortProxy.getElement().getDirection().equals(PortOrientation.IN)) {
            camel.deployment.RequiredHost requiredHost = camel.deployment.DeploymentFactory.eINSTANCE.createRequiredHost();
            requiredHost.setName(hostingPortProxy.getElement().getName());
            if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).setRequiredHost(requiredHost);
            }
            return requiredHost;
        } else if (hostingPortProxy.getElement().getDirection().equals(PortOrientation.OUT)) {
            camel.deployment.ProvidedHost providedHost = camel.deployment.DeploymentFactory.eINSTANCE.createProvidedHost();
            providedHost.setName(hostingPortProxy.getElement().getName());
            if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getProvidedHosts().add(providedHost);
            }
            return providedHost;
        }
        return null;
    }

    @objid ("8a38da90-2770-4305-b3d9-082f03fbb7aa")
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
        
        
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.Component) {
            ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getConfigurations().add(scriptConfiguration);
        }
        return scriptConfiguration;
    }

    @objid ("32e44a3c-ec34-4196-90ad-1b05fc459f48")
    private CDOObject generate(RequirementSet requirementSetProxy) {
        camel.deployment.RequirementSet requirementSet = camel.deployment.DeploymentFactory.eINSTANCE.createRequirementSet();
        requirementSet.setName(requirementSetProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel) {
            ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getRequirementSets().add(requirementSet);
        }
        
        /*
         * Retrieve requirements links
         */
        if(requirementSetProxy.getHorizontalScaleRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getHorizontalScaleRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.HorizontalScaleRequirement) {
                requirementSet.setHorizontalScaleRequirement((camel.requirement.HorizontalScaleRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getImageRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getImageRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.ImageRequirement) {
                requirementSet.setImageRequirement((camel.requirement.ImageRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getLocationRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getLocationRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.LocationRequirement) {
                requirementSet.setLocationRequirement((camel.requirement.LocationRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getOsRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getOsRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.OSRequirement) {
                requirementSet.setOsRequirement((camel.requirement.OSRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getPaasRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getPaasRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.PaaSRequirement) {
                requirementSet.setPaasRequirement((camel.requirement.PaaSRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getProviderRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getProviderRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.ProviderRequirement) {
                requirementSet.setProviderRequirement((camel.requirement.ProviderRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getResourceRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getResourceRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.ResourceRequirement) {
                requirementSet.setResourceRequirement((camel.requirement.ResourceRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getSecurityRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getSecurityRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.SecurityRequirement) {
                requirementSet.setSecurityRequirement((camel.requirement.SecurityRequirement) referencedRequirement);
            }
        }
        if(requirementSetProxy.getVerticalScaleRequirement() != null) {
            camel.requirement.Requirement referencedRequirement = retrieveReferencedRequirement(requirementSetProxy.getVerticalScaleRequirement());
            if(referencedRequirement != null && referencedRequirement instanceof camel.requirement.VerticalScaleRequirement) {
                requirementSet.setVerticalScaleRequirement((camel.requirement.VerticalScaleRequirement) referencedRequirement);
            }
        }
        return requirementSet;
    }

    @objid ("0bd5c125-42f6-4cb5-8db0-7cc0e85262b4")
    private CDOObject generate(VM vmProxy) {
        camel.deployment.VM vM = camel.deployment.DeploymentFactory.eINSTANCE.createVM();
        vM.setName(vmProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel) {
            ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getVms().add(vM);
        }
        return vM;
    }

    @objid ("4e2b626b-409f-4345-baba-29dc5b1c7320")
    private CDOObject generate(PaaS paaSProxy) {
        camel.deployment.PaaS paaS = camel.deployment.DeploymentFactory.eINSTANCE.createPaaS();
        paaS.setName(paaSProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel) {
            ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getPaases().add(paaS);
        }
        return paaS;
    }

    @objid ("3652cfcc-31d2-4306-be83-a065194ea399")
    private CDOObject generate(Container containerProxy) {
        camel.deployment.Container container = camel.deployment.DeploymentFactory.eINSTANCE.createContainer();
        container.setName(containerProxy.getElement().getName());
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel) {
            ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getContainers().add(container);
        }
        return container;
    }

    @objid ("14dfbd7c-06a6-490a-9fa5-b24292deaed8")
    private CDOObject generate(SoftwareComponent softwareComponentProxy) {
        camel.deployment.SoftwareComponent softwareComponent = camel.deployment.DeploymentFactory.eINSTANCE.createSoftwareComponent();
        softwareComponent.setName(softwareComponentProxy.getElement().getName());
        
        if(this.getCamelElementParent() != null && this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel) {
            ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getSoftwareComponents().add(softwareComponent);
        }
        if(softwareComponentProxy.getRequirementSet() != null) {
            camel.deployment.RequirementSet referencedRequirementSet = retrieveReferencedRequirementSet(softwareComponentProxy.getRequirementSet());
            if(referencedRequirementSet != null) {
                softwareComponent.setRequirementSet(referencedRequirementSet);
            }
        }
        return softwareComponent;
    }

    @objid ("8606ef48-b79f-4161-8e9c-d362d10087bf")
    private camel.deployment.RequirementSet retrieveReferencedRequirementSet(RequirementSet requirementSetProxy) {
        camel.deployment.RequirementSet referencedRequirementSet = null;
        //        if(this.processedUmlElements.containsKey(requirementSetProxy.getElement())) {
        //            referencedRequirementSet = (camel.deployment.RequirementSet) this.processedUmlElements.get(requirementSetProxy.getElement());
        //        } else {
        //            referencedRequirementSet = (camel.deployment.RequirementSet) (new GenerateProcessDeploymentType(null, this.processedUmlElements)).switchGenerate(requirementSetProxy);
        //            this.processedUmlElements.put(requirementSetProxy.getElement(), referencedRequirementSet);
        //        }
        return referencedRequirementSet;
    }

    @objid ("e5a640df-b126-4ef1-8ec9-4ffe79d1f8ba")
    private camel.requirement.Requirement retrieveReferencedRequirement(Requirement requirementProxy) {
        camel.requirement.Requirement referencedRequirement = null;
        //        if(this.processedUmlElements.containsKey(requirementProxy.getElement())) {
        //            referencedRequirement = (camel.requirement.Requirement) this.processedUmlElements.get(requirementProxy.getElement());
        //        } else {
        //            referencedRequirement = (camel.requirement.Requirement) (new GenerateProcessRequirement(null, this.processedUmlElements)).switchGenerate(requirementProxy);
        //            this.processedUmlElements.put(requirementProxy.getElement(), referencedRequirement);
        //        }
        return referencedRequirement;
    }

    @objid ("6260eba4-5b15-41ed-8b0d-85ed198d68a1")
    @Override
    protected void updateParent(CDOObject processedElement) {
        if(this.getCamelElementParent() instanceof camel.deployment.DeploymentTypeModel) {
            if(processedElement instanceof camel.deployment.SoftwareComponent) {
                ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getSoftwareComponents().add((camel.deployment.SoftwareComponent)processedElement);
            } else if(processedElement instanceof camel.deployment.RequirementSet) {
                ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getRequirementSets().add((camel.deployment.RequirementSet)processedElement);
            } else if(processedElement instanceof camel.deployment.VM) {
                ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getVms().add((camel.deployment.VM)processedElement);
            } else if(processedElement instanceof camel.deployment.PaaS) {
                ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getPaases().add((camel.deployment.PaaS)processedElement);
            } else if(processedElement instanceof camel.deployment.Container) {
                ((camel.deployment.DeploymentTypeModel)this.getCamelElementParent()).getContainers().add((camel.deployment.Container)processedElement);
            }
        } else if (this.getCamelElementParent() instanceof camel.deployment.SoftwareComponent) {
            if(processedElement instanceof camel.deployment.RequiredCommunication) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getRequiredCommunications().add((camel.deployment.RequiredCommunication) processedElement);
            } else if(processedElement instanceof camel.deployment.ProvidedCommunication) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getProvidedCommunications().add((camel.deployment.ProvidedCommunication) processedElement);
            } else if(processedElement instanceof camel.deployment.RequiredHost) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).setRequiredHost((camel.deployment.RequiredHost) processedElement);
            } else if(processedElement instanceof camel.deployment.RequiredHost) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getProvidedHosts().add((camel.deployment.ProvidedHost) processedElement);
            } else if(processedElement instanceof camel.deployment.ScriptConfiguration) {
                ((camel.deployment.SoftwareComponent)this.getCamelElementParent()).getConfigurations().add((camel.deployment.ScriptConfiguration) processedElement);
            }
        
        }
    }

}
