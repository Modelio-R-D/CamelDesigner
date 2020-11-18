/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.04

 * This file was generated on 11/9/20 11:45 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << MmsObject >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public abstract class MmsObject extends NamedElement {
    public static final String STEREOTYPE_NAME = "MmsObject";

    public static final String ID_TAGTYPE = "id";

    public static final String URI_TAGTYPE = "uri";

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
     * 
     * @return the ModelElement represented by this proxy, never null.
     */
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getId() {
        return this.elt.getTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getUri() {
        return this.elt.getTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setId(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setUri(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT, value);
    }

    protected MmsObject(final ModelElement elt) {
        super(elt);
    }

    /**
     * Tells whether a {@link MMSObject proxy} can be instantiated from a {@link MObject} checking it is a {@link } stereotyped << MMSObject>>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (
                ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME) ||
                ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME) ||
                ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME) ||
                ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME) ));
    }

    /**
     * Tries to instantiate a {@link MmsObject} proxy from a {@link ModelElement} stereotyped << MMSObject >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ModelElement
     * @return a {@link Feature} proxy or <i>null</i>.
     */
    public static MmsObject instantiate(final ModelElement obj) {
        if (MmsConcept.canInstantiate(obj)) {
            return MmsConcept.instantiate(obj);
        }else if (MmsConceptInstance.canInstantiate(obj)) {
            return MmsConceptInstance.instantiate(obj);
        }else if (MmsProperty.canInstantiate(obj)) {
            return MmsProperty.instantiate(obj);
        }else if (MmsPropertyInstance.canInstantiate(obj)) {
            return MmsPropertyInstance.instantiate(obj);
        }
        return null;
    }

    /**
     * Tries to instantiate a {@link MmsObject} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link MmsObject} proxy or <i>null</i>.
     */
    public static MmsObject safeinstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (MmsConcept.canInstantiate(obj)) {
            return MmsConcept.instantiate(obj);
        }else if (MmsConceptInstance.canInstantiate(obj)) {
            return MmsConceptInstance.instantiate(obj);
        }else if (MmsProperty.canInstantiate(obj)) {
            return MmsProperty.instantiate(obj);
        }else if (MmsPropertyInstance.canInstantiate(obj)) {
            return MmsPropertyInstance.instantiate(obj);
        }
        throw new IllegalArgumentException("FeaMmsObjectture: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ID_TAGTYPE_ELT;

        public static TagType URI_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "907f72a5-eb52-4908-953e-7f9a66b9939d");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a139c9cf-4b74-454a-b4cd-b0363a008c40");
            URI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5cff0fda-7e85-46ea-af8b-de500c800a21");
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
