/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Organisation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class Organisation extends Entity {
    public static final String STEREOTYPE_NAME = "Organisation";

    public static final String EMAIL_TAGTYPE = "email";

    public static final String POSTALADDRESS_TAGTYPE = "postalAddress";

    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link Organisation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Organisation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Organisation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Organisation >> then instantiate a {@link Organisation} proxy.
     * 
     * @return a {@link Organisation} proxy on the created {@link Class}.
     */
    public static Organisation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Organisation.STEREOTYPE_NAME);
        return Organisation.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Organisation} proxy from a {@link Class} stereotyped << Organisation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Organisation} proxy or <i>null</i>.
     */
    public static Organisation instantiate(final Class obj) {
        return Organisation.canInstantiate(obj) ? new Organisation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Organisation} proxy from a {@link Class} stereotyped << Organisation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Organisation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static Organisation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Organisation.canInstantiate(obj))
            return new Organisation(obj);
        else
            throw new IllegalArgumentException("Organisation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        Organisation other = (Organisation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getEmail() {
        return this.elt.getTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getPostalAddress() {
        return this.elt.getTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getWww() {
        return this.elt.getTagValue(Organisation.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setEmail(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setPostalAddress(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setWww(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.WWW_TAGTYPE_ELT, value);
    }

    protected Organisation(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType WWW_TAGTYPE_ELT;

        public static TagType POSTALADDRESS_TAGTYPE_ELT;

        public static TagType EMAIL_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fa6ac57f-ab05-4b55-81ec-f129e360b94d");
            WWW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "79c63438-ac0f-42ea-aead-1ff7c9210f58");
            POSTALADDRESS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc93ca-abc2-46b7-954e-feedaadfd214");
            EMAIL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6cb9f211-07e7-4de9-b4b1-4da86857332f");
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
