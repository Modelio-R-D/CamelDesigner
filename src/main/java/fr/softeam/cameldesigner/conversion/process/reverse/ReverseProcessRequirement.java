package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import camel.core.Attribute;
import camel.requirement.HorizontalScaleRequirement;
import camel.requirement.ImageRequirement;
import camel.requirement.LocationRequirement;
import camel.requirement.OSRequirement;
import camel.requirement.OptimisationRequirement;
import camel.requirement.PaaSRequirement;
import camel.requirement.ProviderRequirement;
import camel.requirement.ResourceRequirement;
import camel.requirement.SecurityRequirement;
import camel.requirement.ServiceLevelObjective;
import camel.requirement.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcessRequirement extends AbstractReverseProcess {
    public ReverseProcessRequirement(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement reverse(OptimisationRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective reverse(ServiceLevelObjective element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement reverse(SecurityRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement reverse(VerticalScaleRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement reverse(HorizontalScaleRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement proxyHorizontalScaleRequirement = 
                fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.create();
        proxyHorizontalScaleRequirement.setMinInstances(Integer.toString(element.getMinInstances()));
        proxyHorizontalScaleRequirement.setMaxInstances(Integer.toString(element.getMaxInstances()));
        return proxyHorizontalScaleRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement reverse(ResourceRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement proxy = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.create();
        //        Class umlResourceRequirement = proxy.getElement();
        //        
        //        for(Feature feature : element.getSubFeatures()) {
        //            //CamelElement umlFeature = ReverseUtils.reverse(feature, processedCamelElements);
        //            //umlFeature.setCompositionOwner(
        //        }
        return proxy;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement reverse(ProviderRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement proxyProviderRequirement 
        = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.create();
        proxyProviderRequirement.setCloudType(element.getCloudType().getLiteral());
        return proxyProviderRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement reverse(PaaSRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement reverse(OSRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement proxyOSRequirement 
        = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.create();
        
        proxyOSRequirement.setOs(element.getOs());
        proxyOSRequirement.setIs64os(proxyOSRequirement.getIs64os());
        //proxyOSRequirement.
        IUmlModel umlModel = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel(); 
        
        for(Attribute attribute: element.getAttributes()) {
            org.modelio.metamodel.uml.statik.Attribute umlAttribute = umlModel.createAttribute();
            umlAttribute.setName(attribute.getName());
            umlAttribute.setValue(attribute.getValue().toString());
            umlAttribute.setOwner(proxyOSRequirement.getElement());
        }
        return proxyOSRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement reverse(LocationRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement proxyLocationRequirement = 
                fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.create();
        //proxyLocationRequirement.s
        return proxyLocationRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement reverse(ImageRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement proxyImageRequirement = fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.create();
        List<String> values = new ArrayList<>();
        for (String image:element.getImages()) {
            values.add(image);
        }
        proxyImageRequirement.setImages(values);
        return proxyImageRequirement;
    }

    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if (element instanceof ImageRequirement) {
            return reverse((ImageRequirement) element);
        } else if (element instanceof LocationRequirement) {
            return reverse((LocationRequirement) element);
        } else if (element instanceof OSRequirement) {
            return reverse((OSRequirement) element);
        } else if (element instanceof PaaSRequirement) {
            return reverse((PaaSRequirement) element);
        } else if (element instanceof ProviderRequirement) {
            return reverse((ProviderRequirement) element);
        } else if (element instanceof ResourceRequirement) {
            return reverse((ResourceRequirement) element);
        } else if (element instanceof HorizontalScaleRequirement) {
            return reverse((HorizontalScaleRequirement) element);
        } else if (element instanceof VerticalScaleRequirement) {
            return reverse((VerticalScaleRequirement) element);
        } else if (element instanceof SecurityRequirement) {
            return reverse((SecurityRequirement) element);
        } else if (element instanceof ServiceLevelObjective) {
            return reverse((ServiceLevelObjective) element);
        } else if (element instanceof OptimisationRequirement) {
            return reverse((OptimisationRequirement) element);
        }
        return null;
    }

}
