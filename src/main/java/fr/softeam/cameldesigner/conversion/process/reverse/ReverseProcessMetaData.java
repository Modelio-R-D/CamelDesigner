package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.mms.MmsConcept;
import camel.mms.MmsProperty;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("104404a1-1c4c-4de7-9c51-f1739f69052d")
public class ReverseProcessMetaData extends AbstractReverseProcess {
    @objid ("695d1667-fac4-4f0c-891f-a906178c1f1f")
    public ReverseProcessMetaData(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("3f8f1312-6d19-45b5-93c5-f28bb6e1826f")
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

    @objid ("f9ee1ff5-9ec5-41b5-afce-0b7da1d2a263")
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

    @objid ("8c5fdae0-c585-4b5a-8638-6f20310a95d9")
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

    @objid ("7193d004-e893-4539-b628-e36e5ec03e40")
    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
