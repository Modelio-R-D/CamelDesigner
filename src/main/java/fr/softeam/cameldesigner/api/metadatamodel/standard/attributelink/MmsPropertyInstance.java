/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
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
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AttributeLink} with << MmsPropertyInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("09e9e24f-9c1d-4cfb-b3bb-bf35bf56c7f5")
public class MmsPropertyInstance extends MmsObject {
    @objid ("e0b58870-5439-4c51-9d81-8b25dcb98e40")
    public static final String STEREOTYPE_NAME = "MmsPropertyInstance";

    @objid ("f4346013-c831-4a94-b7e8-8e5e14047ae5")
    public static final String PROPERTYVALUE_TAGTYPE = "propertyValue";

    /**
     * Tells whether a {@link MmsPropertyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link AttributeLink} stereotyped << MmsPropertyInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("356ad069-c715-4769-b0e8-6e437340ccb7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AttributeLink) && ((AttributeLink) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AttributeLink} stereotyped << MmsPropertyInstance >> then instantiate a {@link MmsPropertyInstance} proxy.
     * 
     * @return a {@link MmsPropertyInstance} proxy on the created {@link AttributeLink}.
     */
    @objid ("bc2aa51c-2429-4a09-8a1f-8f34dea3e451")
    public static MmsPropertyInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AttributeLink");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME);
        return MmsPropertyInstance.instantiate((AttributeLink)e);
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AttributeLink
     * @return a {@link MmsPropertyInstance} proxy or <i>null</i>.
     */
    @objid ("5ceaa2aa-5250-4081-9432-d88484f80da0")
    public static MmsPropertyInstance instantiate(final AttributeLink obj) {
        return MmsPropertyInstance.canInstantiate(obj) ? new MmsPropertyInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AttributeLink}
     * @return a {@link MmsPropertyInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6ff262be-1967-496e-ae42-8d6e35f26318")
    public static MmsPropertyInstance safeInstantiate(final AttributeLink obj) throws IllegalArgumentException {
        if (MmsPropertyInstance.canInstantiate(obj))
        	return new MmsPropertyInstance(obj);
        else
        	throw new IllegalArgumentException("MmsPropertyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a03a21b1-7797-4682-a38d-982ec229e6fe")
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
        MmsPropertyInstance other = (MmsPropertyInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9bbc9119-fd52-4411-b388-2967b046dff3")
    public MmsConceptInstance getConceptInstance() {
        return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(((AttributeLink) this.elt).getAttributed(), MmsConceptInstance.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link AttributeLink}. 
     * @return the AttributeLink represented by this proxy, never null.
     */
    @objid ("4a311247-c7ba-4cf3-8dfb-2a8a9ad90cc6")
    @Override
    public AttributeLink getElement() {
        return (AttributeLink)super.getElement();
    }

    /**
     * Get the value to the 'isA' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a80e7cce-72e6-4af9-a4f0-5a9a16052e66")
    public MmsProperty getIsA() {
        return (MmsProperty)CamelDesignerProxyFactory.instantiate(((AttributeLink) this.elt).getBase(), MmsProperty.STEREOTYPE_NAME);
    }

    /**
     * Getter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64e9de00-389e-49b7-b69b-19ee2d31150b")
    public String getPropertyValue() {
        return this.elt.getTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT);
    }

    @objid ("0d4e01f6-90c5-4be7-aca6-cec649726fce")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4f6f6df1-23fa-466a-af95-30cadd0207c7")
    public void setConceptInstance(final MmsConceptInstance obj) {
        ((AttributeLink) this.elt).setAttributed((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'isA' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fc6d1323-6bb9-4f40-a538-60479fc4477d")
    public void setIsA(final MmsProperty obj) {
        ((AttributeLink) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01451cff-5e2f-4b9a-a2a4-e3ecf65d2451")
    public void setPropertyValue(final String value) {
        this.elt.putTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT, value);
    }

    @objid ("cbd490b8-d3ef-4f08-b4d2-3424ae20fe80")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("da474b13-48cb-4be7-b625-84a26660b90c")
    protected MmsPropertyInstance(final AttributeLink elt) {
        super(elt);
    }

    @objid ("3974f7b7-9317-4102-aa68-17990b0b6b2f")
    public static final class MdaTypes {
        @objid ("ca793fd8-041f-474f-ad18-8f8e270e3122")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bd96948f-9137-48e1-ab52-e9a38d9c22a2")
        public static TagType PROPERTYVALUE_TAGTYPE_ELT;

        @objid ("d560ec8a-879a-4a72-b8d4-b3f80577dec2")
        private static Stereotype MDAASSOCDEP;

        @objid ("5bc1bb4c-6857-48f1-a63d-f42c191efc37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("840d58d4-0df1-4c2b-ba24-2c0c82b57ac7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f4953787-31fa-4eed-88df-83d5ad51d82e");
            PROPERTYVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1df65abe-3c98-4cde-9656-91b11230e762");
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
