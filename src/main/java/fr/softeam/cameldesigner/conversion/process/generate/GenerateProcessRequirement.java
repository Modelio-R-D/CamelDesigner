package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.List;
import java.util.Map;
import camel.requirement.CloudType;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.utils.StringUtils;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Enumeration;

public class GenerateProcessRequirement extends AbstractGenerateProcess {
    public GenerateProcessRequirement(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
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
        if (element instanceof Class) {
            Class umlClass = (Class) element;
            if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    HorizontalScaleRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((HorizontalScaleRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    LocationRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((LocationRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    OSRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((OSRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    PaaSRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((PaaSRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ProviderRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((ProviderRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ResourceRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((ResourceRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    VerticalScaleRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((VerticalScaleRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    SecurityRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((SecurityRequirement.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ServiceLevelObjective.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((ServiceLevelObjective.instantiate(umlClass)));
            } else if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    OptimisationRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((OptimisationRequirement.instantiate(umlClass)));
            }
        } else if (element instanceof Enumeration) {
            Enumeration umlEnumeration = (Enumeration) element;
            if(umlEnumeration.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME,
                    ImageRequirement.STEREOTYPE_NAME)
                    && this.getCamelElementParent() instanceof camel.requirement.RequirementModel) {
                return generate((ImageRequirement.instantiate(umlEnumeration)));
            }
        }
        return null;
    }

    private CDOObject generate(ImageRequirement imageRequirementProxy) {
        camel.requirement.ImageRequirement imageRequirement = camel.requirement.RequirementFactory.eINSTANCE.createImageRequirement();
        imageRequirement.setName(imageRequirementProxy.getElement().getName());
        List<String> imagesList = imageRequirementProxy.getImages();
        if(imagesList != null) {
            for(String image : imagesList) {
                imageRequirement.getImages().add(image);
            }
        }
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(imageRequirement);
        return imageRequirement;
    }

    private CDOObject generate(OptimisationRequirement optimisationRequirementProxy) {
        camel.requirement.OptimisationRequirement optimisationRequirement = camel.requirement.RequirementFactory.eINSTANCE.createOptimisationRequirement();
        optimisationRequirement.setName(optimisationRequirementProxy.getElement().getName());
        if(optimisationRequirementProxy.getMetricContext() != null) {
            // TODO
            //optimisationRequirement.setMetricContext(optimisationRequirementProxy.getMetricContext());
        }
        if(optimisationRequirementProxy.getMetricVariable() != null) {
            // TODO
            //optimisationRequirement.setMetriVariable(optimisationRequirementProxy.getMetricVariable());
        }
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(optimisationRequirement);
        return optimisationRequirement;
    }

    private CDOObject generate(ServiceLevelObjective serviceLevelObjectiveProxy) {
        camel.requirement.ServiceLevelObjective serviceLevelObjective = camel.requirement.RequirementFactory.eINSTANCE.createServiceLevelObjective();
        serviceLevelObjective.setName(serviceLevelObjectiveProxy.getElement().getName());
        //TODO
        // set constrain & ViolatingEvent
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(serviceLevelObjective);
        return serviceLevelObjective;
    }

    private CDOObject generate(SecurityRequirement securityRequirementProxy) {
        camel.requirement.SecurityRequirement securityRequirement = camel.requirement.RequirementFactory.eINSTANCE.createSecurityRequirement();
        securityRequirement.setName(securityRequirementProxy.getElement().getName());
        // TODO set Security Control
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(securityRequirement);
        return securityRequirement;
    }

    private CDOObject generate(VerticalScaleRequirement verticalScaleRequirementProxy) {
        camel.requirement.VerticalScaleRequirement verticalScaleRequirement = camel.requirement.RequirementFactory.eINSTANCE.createVerticalScaleRequirement();
        verticalScaleRequirement.setName(verticalScaleRequirementProxy.getElement().getName());
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(verticalScaleRequirement);
        return verticalScaleRequirement;
    }

    private CDOObject generate(ResourceRequirement resourceRequirementProxy) {
        camel.requirement.ResourceRequirement resourceRequirement = camel.requirement.RequirementFactory.eINSTANCE.createResourceRequirement();
        resourceRequirement.setName(resourceRequirementProxy.getElement().getName());
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(resourceRequirement);
        return resourceRequirement;
    }

    private CDOObject generate(ProviderRequirement providerRequirementProxy) {
        camel.requirement.ProviderRequirement providerRequirement = camel.requirement.RequirementFactory.eINSTANCE.createProviderRequirement();
        providerRequirement.setName(providerRequirementProxy.getElement().getName());
        if(providerRequirementProxy.getCloudType() != null) {
            providerRequirement.setCloudType(CloudType.getByName(providerRequirementProxy.getCloudType()));
        }
        List<String> providerNamesList = providerRequirementProxy.getProviderNames();
        if(providerNamesList != null) {
            for(String providerName: providerNamesList) {
                providerRequirement.getProviderNames().add(providerName);
            }
        }
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(providerRequirement);
        return providerRequirement;
    }

    private CDOObject generate(PaaSRequirement paaSRequirementProxy) {
        camel.requirement.PaaSRequirement paaSRequirement = camel.requirement.RequirementFactory.eINSTANCE.createPaaSRequirement();
        paaSRequirement.setName(paaSRequirementProxy.getElement().getName());
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(paaSRequirement);
        return paaSRequirement;
    }

    private CDOObject generate(OSRequirement osRequirementProxy) {
        camel.requirement.OSRequirement osRequirement = camel.requirement.RequirementFactory.eINSTANCE.createOSRequirement();
        osRequirement.setName(osRequirementProxy.getElement().getName());
        if(osRequirementProxy.getOs() != null) {
            osRequirement.setOs(osRequirementProxy.getOs());
        }
        if(StringUtils.isBoolean(osRequirementProxy.getIs64os())) {
            osRequirement.setIs64os(Boolean.parseBoolean(osRequirementProxy.getIs64os()));
        }
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(osRequirement);
        return osRequirement;
    }

    private CDOObject generate(LocationRequirement locationRequirementProxy) {
        camel.requirement.LocationRequirement locationRequirement = camel.requirement.RequirementFactory.eINSTANCE.createLocationRequirement();
        locationRequirement.setName(locationRequirementProxy.getElement().getName());
        List<Location> locationsList = locationRequirementProxy.getLocations();
        if(locationsList!=null) {
            for(Location location: locationsList) {
                //TODO
                //locationRequirement.getLocations().add(locationElement)
            }
        }
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(locationRequirement);
        return locationRequirement;
    }

    private CDOObject generate(HorizontalScaleRequirement horizontalScaleRequirementProxy) {
        camel.requirement.HorizontalScaleRequirement horizontalScaleRequirement = camel.requirement.RequirementFactory.eINSTANCE.createHorizontalScaleRequirement();
        horizontalScaleRequirement.setName(horizontalScaleRequirementProxy.getElement().getName());
        if(horizontalScaleRequirementProxy.getMinInstances() != null
                && StringUtils.isNumeric(horizontalScaleRequirementProxy.getMinInstances())) {
            horizontalScaleRequirement.setMinInstances(Integer.parseInt(horizontalScaleRequirementProxy.getMinInstances()));
        }
        if(horizontalScaleRequirementProxy.getMaxInstances() != null
                && StringUtils.isNumeric(horizontalScaleRequirementProxy.getMaxInstances())) {
            horizontalScaleRequirement.setMaxInstances(Integer.parseInt(horizontalScaleRequirementProxy.getMaxInstances()));
        }
        ((camel.requirement.RequirementModel)this.getCamelElementParent()).getRequirements().add(horizontalScaleRequirement);
        return horizontalScaleRequirement;
    }

}
