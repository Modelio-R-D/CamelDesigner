package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;

public class ReverseProcessRequirement extends AbstractReverseProcess {
    public ReverseProcessRequirement(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement reverse(camel.requirement.OptimisationRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement optimizationRequirementProxy = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.create();
        
        optimizationRequirementProxy.setMinimise(element.isMinimise());
        if(element.getMetricContext() != null) {
            MetricContext referencedMetricContext = retrievReferencedMetricContext(element.getMetricContext());
            if(referencedMetricContext != null) {
                optimizationRequirementProxy.setMetricContext(referencedMetricContext);
            }
        }
        if(element.getMetricVariable() != null) {
            MetricVariable referencedMetricVariable = retrievReferencedMetricVariable(element.getMetricVariable());
            if(referencedMetricVariable != null) {
                optimizationRequirementProxy.setMetricVariable(referencedMetricVariable);
            }
        }
        
        optimizationRequirementProxy.setPriority(Double.toString(element.getPriority()));
        return optimizationRequirementProxy;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective reverse(camel.requirement.ServiceLevelObjective element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement reverse(camel.requirement.SecurityRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement reverse(camel.requirement.VerticalScaleRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement reverse(camel.requirement.HorizontalScaleRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement proxyHorizontalScaleRequirement =
                fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.create();
        proxyHorizontalScaleRequirement.setMinInstances(Integer.toString(element.getMinInstances()));
        proxyHorizontalScaleRequirement.setMaxInstances(Integer.toString(element.getMaxInstances()));
        return proxyHorizontalScaleRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement reverse(camel.requirement.ResourceRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement resourceRequirementProxy = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.create();
        
        
        for(camel.core.Feature feature : element.getSubFeatures()) {
            FeatureClass featureClassProxy = FeatureClass.create();
            Class featureClass = featureClassProxy.getElement();
            featureClass.setName(feature.getName());
            featureClass.setOwner(resourceRequirementProxy.getElement());
        
            for(camel.core.Attribute attribute : feature.getAttributes()) {
                AttributeAttribute attributeProxy = AttributeAttribute.create();
                Attribute attributeAttribute = attributeProxy.getElement();
                attributeAttribute.setName(attribute.getName());
                attributeAttribute.setOwner(featureClass);
                if(attribute.getValue() != null) {
                    attributeAttribute.setValue(attribute.getValue().toString());
                }
            }
        
        }
        return resourceRequirementProxy;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement reverse(camel.requirement.ProviderRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement proxyProviderRequirement
        = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.create();
        proxyProviderRequirement.setCloudType(element.getCloudType().getLiteral());
        return proxyProviderRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement reverse(camel.requirement.PaaSRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.create();
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement reverse(camel.requirement.OSRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement proxyOSRequirement
        = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.create();
        
        proxyOSRequirement.setOs(element.getOs());
        proxyOSRequirement.setIs64os(proxyOSRequirement.getIs64os());
        //proxyOSRequirement.
        //IUmlModel umlModel = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel();
        
        for( camel.core.Attribute attribute: element.getAttributes()) {
            //org.modelio.metamodel.uml.statik.Attribute umlAttribute = umlModel.createAttribute();
            AttributeAttribute attributeProxy = AttributeAttribute.create();
        
            attributeProxy.getElement().setName(attribute.getName());
            //ValueType test = attribute.getValueType();
            //String test10 = test.getName();
            //String test3 = test.getPrimitiveType().getLiteral();
            //String test4 = test.getPrimitiveType().getName();
            //int test5 = test.getPrimitiveType().getValue();
            //umlAttribute.setValue(attribute.getValueType().toString());
            //umlAttribute.setValue(attribute.getValue().toString());
            attributeProxy.getElement().setOwner(proxyOSRequirement.getElement());
        }
        return proxyOSRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement reverse(camel.requirement.LocationRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement proxyLocationRequirement =
                fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.create();
        //proxyLocationRequirement.s
        return proxyLocationRequirement;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement reverse(camel.requirement.ImageRequirement element) {
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
        if (element instanceof camel.requirement.ImageRequirement) {
            return reverse((camel.requirement.ImageRequirement) element);
        } else if (element instanceof camel.requirement.LocationRequirement) {
            return reverse((camel.requirement.LocationRequirement) element);
        } else if (element instanceof camel.requirement.OSRequirement) {
            return reverse((camel.requirement.OSRequirement) element);
        } else if (element instanceof camel.requirement.PaaSRequirement) {
            return reverse((camel.requirement.PaaSRequirement) element);
        } else if (element instanceof camel.requirement.ProviderRequirement) {
            return reverse((camel.requirement.ProviderRequirement) element);
        } else if (element instanceof camel.requirement.ResourceRequirement) {
            return reverse((camel.requirement.ResourceRequirement) element);
        } else if (element instanceof camel.requirement.HorizontalScaleRequirement) {
            return reverse((camel.requirement.HorizontalScaleRequirement) element);
        } else if (element instanceof camel.requirement.VerticalScaleRequirement) {
            return reverse((camel.requirement.VerticalScaleRequirement) element);
        } else if (element instanceof camel.requirement.SecurityRequirement) {
            return reverse((camel.requirement.SecurityRequirement) element);
        } else if (element instanceof camel.requirement.ServiceLevelObjective) {
            return reverse((camel.requirement.ServiceLevelObjective) element);
        } else if (element instanceof camel.requirement.OptimisationRequirement) {
            return reverse((camel.requirement.OptimisationRequirement) element);
        }
        return null;
    }

    private MetricVariable retrievReferencedMetricVariable(camel.metric.MetricVariable metricVariable) {
        MetricVariable referencedMetricVariable = null;
        if(this.processedCamelElements.containsKey(metricVariable)) {
        
            referencedMetricVariable = (MetricVariable) this.processedCamelElements.get(metricVariable);
        } else {
        
            referencedMetricVariable = (MetricVariable) (new ReverseProcessMetricType(null, this.processedCamelElements)).switchReverse(metricVariable);
            referencedMetricVariable.getElement().setName(metricVariable.getName());
            this.processedCamelElements.put(metricVariable, referencedMetricVariable);
        }
        return referencedMetricVariable;
    }

    private MetricContext retrievReferencedMetricContext(camel.metric.MetricContext metricContext) {
        MetricContext referencedMetricContext = null;
        if(this.processedCamelElements.containsKey(metricContext)) {
        
            referencedMetricContext = (MetricContext) this.processedCamelElements.get(metricContext);
        } else {
        
            referencedMetricContext = (MetricContext) (new ReverseProcessMetricType(null, this.processedCamelElements)).switchReverse(metricContext);
            referencedMetricContext.getElement().setName(metricContext.getName());
            this.processedCamelElements.put(metricContext, referencedMetricContext);
        }
        return referencedMetricContext;
    }

}
