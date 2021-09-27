package fr.softeam.cameldesigner.api;

import java.util.ArrayList;
import java.util.List;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
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
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;

public class CamelDesignerAbstractProxy {
    public static List<CamelElement> getCamelElements() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }



    public static List<ModelElement> getValueTypes() {
        List<ModelElement> result = new ArrayList<>();

        //Range Unit
        result.addAll(Range.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;

        return result;
    }

    public static List<ModelElement> getLocations() {
        List<ModelElement> result = new ArrayList<>();

        //Cloud Location Unit
        result.addAll(CloudLocation.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;

        //Geographical Location Unit
        result.addAll(GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;

        return result;
    }

    public static List<ModelElement> getMetricContexts() {
        List<ModelElement> result = new ArrayList<>();

        //Composite Metric Context
        result.addAll(CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;

        //Raw Metric Context
        result.addAll(RawMetricContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

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


    public static List<ModelElement> getUnits() {
        List<ModelElement> result = new ArrayList<>();

        //DimensionLess
        result.addAll(Dimensionless.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;

        //Dimensioned Unit
        result.addAll(getDimensionedUnit());

        return result;
    }

    public static List<ModelElement> getDimensionedUnit() {
        List<ModelElement> result = new ArrayList<>();

        //Single Unit
        result.addAll(SingleUnit.MdaTypes.STEREOTYPE_ELT.getExtendedElement()) ;

        //Composit eUnit
        result.addAll(CompositeUnit.MdaTypes.STEREOTYPE_ELT.getExtendedElement());
        return result;
    }

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

}
