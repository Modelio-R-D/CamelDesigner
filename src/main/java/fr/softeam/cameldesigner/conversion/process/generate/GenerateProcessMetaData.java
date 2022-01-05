package fr.softeam.cameldesigner.conversion.process.generate;

<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;

@objid ("1bf8b670-e777-43f9-b138-d0bf658c897c")
public class GenerateProcessMetaData extends AbstractGenerateProcess {
    @objid ("57a9fd7a-3a18-489f-959a-d125b8fa89c0")
<<<<<<< HEAD
    public GenerateProcessMetaData(CDOObject camelElementParent) {
        super(camelElementParent);
=======
    public GenerateProcessMetaData(CDOObject camelElementParent, Map<ModelElement, CDOObject> processedUmlElements) {
        super(camelElementParent, processedUmlElements);
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
    }

    @objid ("c299ce2c-053e-46ad-9f3f-be44e135cf02")
    @Override
    protected CDOObject switchGenerate(fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement camelElement) {
        ModelElement element = camelElement.getElement();
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

    @objid ("d6c6b19d-9977-4bb9-8929-a45ad2420e6f")
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

    @objid ("3ca28d9e-516c-48af-9b3d-b2a026c1462d")
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

    @objid ("cb1f5c3e-5d48-43ad-a24d-fde29dddda17")
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
