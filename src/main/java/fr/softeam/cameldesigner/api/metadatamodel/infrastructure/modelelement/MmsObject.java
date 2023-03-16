/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << MmsObject >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5b8e0066-83d4-4b26-bada-7dcae35d5e7d")
public abstract class MmsObject extends NamedElement {
    @objid ("54c9a126-1af9-45cc-962f-56e57f352340")
    public static final String STEREOTYPE_NAME = "MmsObject";

    @objid ("576d4620-311f-4597-8d5f-4480ba17865d")
    public static final String ID_TAGTYPE = "id";

    @objid ("96db24d9-cbcc-47a3-af15-4291a345b387")
    public static final String IMPLEMENTED_TAGTYPE = "implemented";

    @objid ("b5e05ddd-de59-4af8-97fb-f9316e33d97d")
    public static final String URI_TAGTYPE = "uri";

    /**
     * Tells whether a {@link MmsObject proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MmsObject >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ee32edf1-d306-4437-bce8-e08260b18e47")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME));
    }

    @objid ("279386c6-8a35-498a-9c8a-980cd5eb2e29")
    public static MmsObject instantiate(final ModelElement obj) {
        return MmsProperty.canInstantiate(obj) ?  MmsProperty.instantiate((Attribute)obj) :
            MmsConcept.canInstantiate(obj) ?  MmsConcept.instantiate((Class)obj) :
                MmsConceptInstance.canInstantiate(obj) ?  MmsConceptInstance.instantiate((Instance)obj) :
                    MmsPropertyInstance.canInstantiate(obj) ?  MmsPropertyInstance.instantiate((AttributeLink)obj) : null;
    }

    @objid ("eb0be126-97a9-4f25-bf83-88469bd70106")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MmsObject other = (MmsObject) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("63c1173f-5d36-4d34-af9c-5d395da5bb05")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0edd4000-f3cf-4373-aa39-c30ff41ab779")
    public String getId() {
        return this.elt.getTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("957f19ba-4d4b-429d-a3bc-014287e11835")
    public String getUri() {
        return this.elt.getTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT);
    }

    @objid ("b702f89d-b09b-4570-b242-89cec5369612")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'implemented'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("909a4b98-9cb9-4a10-9610-d8e50b8d32a0")
    public boolean isImplemented() {
        return this.elt.isTagged(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e701b5f9-1971-467f-9f9b-b2e67d6292aa")
    public void setId(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'implemented'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("829b9e61-b77e-48ec-b10e-df7798a5bdba")
    public void setImplemented(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0d704a01-65c1-4f21-bb1b-bd4c2bdc4956")
    public void setUri(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT, value);
    }

    @objid ("eba83ee7-f370-4b14-8163-eb080b29b872")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9eabc7e5-375e-48bd-9a93-e7be843058b7")
    protected MmsObject(final ModelElement elt) {
        super(elt);
    }

    @objid ("2f90ab01-c906-4902-9288-e931e22fb14d")
    public static final class MdaTypes {
        @objid ("0ce2ec8f-9762-4f68-af9b-1c3fb78bc7b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3ff0d143-9a4b-4e9f-a4a0-6f05b30ce0c7")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("b8fb5e14-6e1a-4fbf-b7b9-1f9ab2f3eccd")
        public static TagType URI_TAGTYPE_ELT;

        @objid ("0f3bad81-ffa4-4fda-b0d8-a31bb8e85f7b")
        public static TagType IMPLEMENTED_TAGTYPE_ELT;

        @objid ("a73708f9-efc3-4ae8-8e8d-61d7fe7b72f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("559b2e98-bdc9-4a0d-ab6b-cb7f83e7e8bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8a0c40e-2b63-443b-8d73-fab0fdbdc937")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "907f72a5-eb52-4908-953e-7f9a66b9939d");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a139c9cf-4b74-454a-b4cd-b0363a008c40");
            URI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5cff0fda-7e85-46ea-af8b-de500c800a21");
            IMPLEMENTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ab13b830-a142-4532-b79b-6d25b71242e0");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
