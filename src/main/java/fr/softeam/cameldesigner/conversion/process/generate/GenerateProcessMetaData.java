package fr.softeam.cameldesigner.conversion.process.generate;

import java.util.Map;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;

public class GenerateProcessMetaData extends AbstractGenerateProcess {
    public GenerateProcessMetaData(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
    }

    @Override
    protected CDOObject switchGenerate(ModelElement element) {
        if (element instanceof Class) {
            Class umlClass = (Class) element;
            if(umlClass.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME)) {
                return generate((MmsConcept.instantiate(umlClass)));
            }
        } else if (element instanceof Attribute) {
            Attribute umlAttribute = (Attribute) element;
            if(umlAttribute.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME)) {
                return generate((MmsProperty.instantiate(umlAttribute)));
            }
        }
        return null;
    }

    private CDOObject generate(MmsProperty mmsPropertyProxy) {
        camel.mms.MmsProperty mmsProperty = camel.mms.MmsFactory.eINSTANCE.createMmsProperty();
        mmsProperty.setName(mmsPropertyProxy.getElement().getName());
        if(mmsPropertyProxy.getId()!=null) {
            mmsProperty.setId(mmsPropertyProxy.getId());
        }
        if(mmsPropertyProxy.getUri()!=null) {
            mmsProperty.setUri(mmsPropertyProxy.getUri());
        }
        if(mmsPropertyProxy.getRangeUri()!=null) {
            mmsProperty.setRangeUri(mmsPropertyProxy.getRangeUri());
        }
        if(this.getCamelElementParent() != null) {
            if(this.getCamelElementParent() instanceof camel.mms.MmsConcept) {
                ((camel.mms.MmsConcept)this.getCamelElementParent()).getProperty().add(mmsProperty);
            } else if(this.getCamelElementParent() instanceof camel.mms.MetaDataModel) {
                ((camel.mms.MetaDataModel)this.getCamelElementParent()).getMetadataElements().add(mmsProperty);
            }
        }
        return mmsProperty;
    }

    private CDOObject generate(MmsConcept mmsConceptProxy) {
        camel.mms.MmsConcept mmsConcept = camel.mms.MmsFactory.eINSTANCE.createMmsConcept();
        mmsConcept.setName(mmsConceptProxy.getElement().getName());
        if(mmsConceptProxy.getId()!=null) {
            mmsConcept.setId(mmsConceptProxy.getId());
        }
        if(mmsConceptProxy.getUri()!=null) {
            mmsConcept.setUri(mmsConceptProxy.getUri());
        }
        if(this.getCamelElementParent() != null) { 
            if(this.getCamelElementParent() instanceof camel.mms.MmsConcept) {
                ((camel.mms.MmsConcept)this.getCamelElementParent()).getConcept().add(mmsConcept);
            } else if(this.getCamelElementParent() instanceof camel.mms.MetaDataModel) {
                ((camel.mms.MetaDataModel)this.getCamelElementParent()).getMetadataElements().add(mmsConcept);
            }
        }
        return mmsConcept;
    }

    @Override
    protected void updateParent(CDOObject processedElement) {
        if(this.getCamelElementParent() instanceof camel.mms.MmsConcept) {
            if(processedElement instanceof camel.mms.MmsConcept) {
                ((camel.mms.MmsConcept)this.getCamelElementParent()).getConcept().add((camel.mms.MmsConcept)processedElement);
            } else if (processedElement instanceof camel.mms.MmsProperty) {
                ((camel.mms.MmsConcept)this.getCamelElementParent()).getProperty().add((camel.mms.MmsProperty)processedElement);
            }
        } else if(this.getCamelElementParent() instanceof camel.mms.MetaDataModel) {
            if(processedElement instanceof camel.mms.MmsConcept) {
                ((camel.mms.MetaDataModel)this.getCamelElementParent()).getMetadataElements().add((camel.mms.MmsConcept)processedElement);
            } else if (processedElement instanceof camel.mms.MmsProperty) {
                ((camel.mms.MetaDataModel)this.getCamelElementParent()).getMetadataElements().add((camel.mms.MmsProperty)processedElement);
            }
        }
    }

}
