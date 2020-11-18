package fr.softeam.cameldesigner.api;

import java.util.ArrayList;
import java.util.List;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class CamelDesignerAbstractProxy {
    public static List<CamelElement> getCamelElements() {
        List<CamelElement> result = new ArrayList<>();
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

}
