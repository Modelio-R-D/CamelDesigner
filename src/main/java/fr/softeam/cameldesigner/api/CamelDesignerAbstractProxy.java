package fr.softeam.cameldesigner.api;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.class_.CompositeConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.class_.UnaryConstraint;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("c3658e2d-fc5c-464d-b712-717d91e8711f")
public class CamelDesignerAbstractProxy {
    @objid ("a44464ad-cc45-40a0-8e17-0b7cccaa0f04")
    public static List<CamelElement> getCamelElements() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("a1aa9003-620d-4567-95d4-790575c68bc7")
    public static List<ModelElement> getMetricContexts() {
        List<ModelElement> result = new ArrayList<>();
        
        //Composite Metric Context
        result.addAll(CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //Raw Metric Context
        result.addAll(RawMetricContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

    @objid ("80c2fd20-12c7-456e-b3e0-44dfd861d5fd")
    public static List<ModelElement> getMMSObject() {
        List<ModelElement> result = new ArrayList<>();
        
        //MmsConcept
        result.addAll(MmsConcept.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //MmsConcept
        result.addAll(MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //MmsConcept
        result.addAll(MmsProperty.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //MmsConcept
        result.addAll(MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

    @objid ("9c3a6b73-9dbd-4f40-b9b5-fa54a8eb2c65")
    public static Boolean isLocation(ModelElement elt) {
        //CloudLocation
        if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME)) {
            return true;
        }
        
        //GeographicalRegion
        if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME)) {
            return true;
        }
        return false;
    }

    @objid ("ba0c7f19-6d47-451c-992f-88a88677cf89")
    public static List<ModelElement> getComponents() {
        List<ModelElement> result = new ArrayList<>();
        
        //Software Component
        result.addAll(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //VM Component
        result.addAll(VM.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //Container Component
        result.addAll(Container.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //PaaS Component
        result.addAll(PaaS.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

    @objid ("0420a81c-5862-47d2-a410-ca8ed8e61b78")
    public static List<ModelElement> getUnits() {
        List<ModelElement> result = new ArrayList<>();
        
        //DimensionLess
        result.addAll(Dimensionless.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //Dimensioned Unit
        result.addAll(getDimensionedUnit());
        return result;
    }

    @objid ("44d4aca2-532f-4b73-b136-c2eccf4de685")
    public static List<ModelElement> getDimensionedUnit() {
        List<ModelElement> result = new ArrayList<>();
        
        //Single Unit
        result.addAll(SingleUnit.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //Composit eUnit
        result.addAll(CompositeUnit.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

    @objid ("dd3d27dd-e6f3-406b-bf2b-ea52adf263a0")
    public static List<ModelElement> getMetrics() {
        List<ModelElement> result = new ArrayList<>();
        
        //Composite Metric
        result.addAll(CompositeMetric.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //Raw Metric
        result.addAll(RawMetric.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        
        //Metric Variable
        result.addAll(MetricVariable.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

    @objid ("512af4a7-2bdd-44da-a509-a25409488f74")
    public static List<ModelElement> getValueTypes() {
        List<ModelElement> result = new ArrayList<>();
        
        //Range Unit
        result.addAll(Range.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        return result;
    }

    @objid ("6096ef38-222d-4790-9c23-294e6d14b22b")
    public static List<ModelElement> getLocations() {
        List<ModelElement> result = new ArrayList<>();
        
        //Cloud Location Unit
        result.addAll(CloudLocation.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //Geographical Location Unit
        result.addAll(GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        return result;
    }

    @objid ("182a8eb6-4aa7-472f-8a77-c2a3665054dc")
    public static List<ModelElement> getMeasurements() {
        List<ModelElement> result = new ArrayList<>();
        
        
        //CommunicationMeasurement
        result.addAll(CommunicationMeasurement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //VMMeasurement
        result.addAll(VMMeasurement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //PaasMeasurement
        result.addAll(PaaSMeasurement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //ContainerMeasurement
        result.addAll(ContainerMeasurement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //DataMeasurement
        result.addAll(DataMeasurement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //ApplicationMeasurement
        result.addAll(ApplicationMeasurement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //SoftwareComponentMeasurement
        result.addAll(SoftwareComponentMeasurement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        return result;
    }

    @objid ("501381a7-3e03-42e2-9d4d-96308e366998")
    public static List<ModelElement> getEventInstances() {
        List<ModelElement> result = new ArrayList<>();
        
        
        //FunctionalEventInstance
        result.addAll(FunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //NonFunctionalEventInstance
        result.addAll(NonFunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        return result;
    }

    @objid ("8b7c1ab2-3f9a-4652-aaf7-affa571a902d")
    public static List<ModelElement> getActions() {
        List<ModelElement> result = new ArrayList<>();
        
        
        //ScalingAction
        result.addAll(ScalingAction.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        return result;
    }

    @objid ("0d538cb7-51ed-4c95-bc24-3b3a3e5ccdcb")
    public static List<ModelElement> getEvents() {
        // TODO Auto-generated method stub
        List<ModelElement> result = new ArrayList<>();
        
        //EventPattern
        result.addAll(EventPattern.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //SingleEvent
        result.addAll(SingleEvent.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        return result;
    }

    @objid ("2290f4c4-182d-4cec-8dea-d2a9ef885a55")
    public static List<ModelElement> getConstraints() {
        // TODO Auto-generated method stub
        List<ModelElement> result = new ArrayList<>();
        
        //UnaryConstraint
        result.addAll(UnaryConstraint.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        
        //CompositeConstraint
        result.addAll(CompositeConstraint.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;
        return result;
    }

}
