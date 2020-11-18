package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.mms.MmsConcept;
import camel.mms.MmsProperty;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcessMetaData extends AbstractReverseProcess {
    public ReverseProcessMetaData(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    private fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty reverse(MmsProperty element) {
        fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty proxyMmsProperty = fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.create();
        if(element.getId()!=null) {
            proxyMmsProperty.setId(element.getId());
        }
        if(element.getUri()!=null) {
            proxyMmsProperty.setUri(element.getUri());
        }
        if(element.getRangeUri()!=null) {
            proxyMmsProperty.setRangeUri(element.getRangeUri());
        }
        return proxyMmsProperty;
    }

    private fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept reverse(MmsConcept element) {
        fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept proxyMmsConcept = fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.create();
        if(element.getId()!=null) {
            proxyMmsConcept.setId(element.getId());
        }
        if(element.getUri()!=null) {
            proxyMmsConcept.setUri(element.getUri());
        }
        return  proxyMmsConcept;
    }

    @Override
    public CamelElement switchReverse(CDOObject element) {
        if(element instanceof MmsConcept) {
            return reverse((MmsConcept) element);
        }
        else if(element instanceof MmsProperty) {
            return reverse((MmsProperty) element);
        }
        return null;
    }

}
