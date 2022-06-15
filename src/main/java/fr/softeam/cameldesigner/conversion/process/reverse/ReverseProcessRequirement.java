package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;

@objid ("132a82a4-f75b-47ae-a545-35c15633a632")
public class ReverseProcessRequirement extends AbstractReverseProcess {
    @objid ("f56b1ab8-eb06-46d7-b19b-8fcbd1a84aaa")
    public ReverseProcessRequirement(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("5db5dda8-8320-42d7-8f30-c42855e7091f")
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

    @objid ("7e5f27a0-80ae-4366-8cc6-9e6cb91da275")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective reverse(camel.requirement.ServiceLevelObjective element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.create();
    }

    @objid ("ba1ebe7e-c410-4c35-b075-a5bb1fe27c3f")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement reverse(camel.requirement.SecurityRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.create();
    }

    @objid ("9f8776e0-9370-48ae-ad41-1abb8277ac2d")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement reverse(camel.requirement.VerticalScaleRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.create();
    }

    @objid ("c212d00d-80a0-4fa0-8122-be32408e6764")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement reverse(camel.requirement.HorizontalScaleRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement proxyHorizontalScaleRequirement =
                fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.create();
        proxyHorizontalScaleRequirement.setMinInstances(Integer.toString(element.getMinInstances()));
        proxyHorizontalScaleRequirement.setMaxInstances(Integer.toString(element.getMaxInstances()));
        return proxyHorizontalScaleRequirement;
    }

    @objid ("b250a518-e0c3-45e9-b222-e3b1e9526588")
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

    @objid ("9f3cc381-8d12-4668-9fbe-894f3e0c3117")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement reverse(camel.requirement.ProviderRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement proxyProviderRequirement
        = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.create();
        proxyProviderRequirement.setCloudType(element.getCloudType().getLiteral());
        return proxyProviderRequirement;
    }

    @objid ("f05bbd46-d4c9-445d-b780-aef9872c0862")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement reverse(camel.requirement.PaaSRequirement element) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.create();
    }

    @objid ("db2592e6-3b77-4227-852f-4124d59d1194")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement reverse(camel.requirement.OSRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement proxyOSRequirement
        = fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.create();
        
        proxyOSRequirement.setOs(element.getOs());
        proxyOSRequirement.setIs64os(proxyOSRequirement.isIs64os());
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

    @objid ("b96f88bb-51d3-4759-bb1f-3b2131901fcb")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement reverse(camel.requirement.LocationRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement proxyLocationRequirement =
                fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.create();
        //proxyLocationRequirement.s
        return proxyLocationRequirement;
    }

    @objid ("b3dee2f4-8af7-4f84-b96f-25801817b9f1")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement reverse(camel.requirement.ImageRequirement element) {
        fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement proxyImageRequirement = fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.create();
        List<String> values = new ArrayList<>();
        for (String image:element.getImages()) {
            values.add(image);
        }
        proxyImageRequirement.setImages(values);
        return proxyImageRequirement;
    }

    @objid ("aaa59fa3-6ec6-42d0-befe-25a14cfcb4c7")
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

    @objid ("fbe803b5-16d6-4291-ab4d-8c81584bc629")
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

    @objid ("2f65617b-9798-4d93-9411-841eb42c6239")
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

    @objid ("4f182f26-677c-4b74-9f0a-68c4b840160c")
    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
