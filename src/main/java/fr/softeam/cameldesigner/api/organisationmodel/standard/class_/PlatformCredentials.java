/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << PlatformCredentials >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("071d211c-2384-4a4a-8cac-c38f32bd4c25")
public class PlatformCredentials extends Credentials {
    @objid ("ce2a74ad-966b-4b80-8367-e242965bf0e4")
    public static final String STEREOTYPE_NAME = "PlatformCredentials";

    @objid ("bd17a947-2ed6-4adb-90c5-c33c30e824ac")
    public static final String PASSWORD_TAGTYPE = "password";

    /**
     * Tells whether a {@link PlatformCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PlatformCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("31890b78-d7cc-460c-ba5c-eb9c24827db6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PlatformCredentials >> then instantiate a {@link PlatformCredentials} proxy.
     * 
     * @return a {@link PlatformCredentials} proxy on the created {@link Class}.
     */
    @objid ("6f93a3b0-21a7-4d9b-9103-ccb87b0d534f")
    public static PlatformCredentials create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME);
        return PlatformCredentials.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PlatformCredentials} proxy from a {@link Class} stereotyped << PlatformCredentials >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link PlatformCredentials} proxy or <i>null</i>.
     */
    @objid ("842ebc94-82e2-4b8a-b82b-155998b3ffb7")
    public static PlatformCredentials instantiate(final Class obj) {
        return PlatformCredentials.canInstantiate(obj) ? new PlatformCredentials(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PlatformCredentials} proxy from a {@link Class} stereotyped << PlatformCredentials >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link PlatformCredentials} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ff7b8b65-c27a-411a-b9d3-b2420ed20054")
    public static PlatformCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PlatformCredentials.canInstantiate(obj))
            return new PlatformCredentials(obj);
        else
            throw new IllegalArgumentException("PlatformCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b27d8442-b097-4b46-bddf-041f13270732")
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
        PlatformCredentials other = (PlatformCredentials) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("11072f79-39eb-4031-af68-73e9a8537404")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5212fd0f-d757-43d1-a147-8d47861ea4be")
    public String getPassword() {
        return this.elt.getTagValue(PlatformCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    @objid ("a1dfe57b-6e1a-4cdc-acb7-ce7d0775b526")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8adebbf5-071e-468a-ab6c-01137bb13d20")
    public void setPassword(final String value) {
        this.elt.putTagValue(PlatformCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT, value);
    }

    @objid ("21e68a0d-4120-4982-8d10-e16982a3d89f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("653cb7ef-8fc0-4c36-ad46-6e228d7960c5")
    protected PlatformCredentials(final Class elt) {
        super(elt);
    }

    @objid ("92fe8b7b-826a-496c-8b51-48154e382f82")
    public static final class MdaTypes {
        @objid ("54133c04-5439-436d-8087-507f581e77a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("28b18abe-dd1a-4657-9c07-c7c1ac3cdd6e")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("3da798f3-ccb9-4f88-8a4f-a6ce5d090e17")
        private static Stereotype MDAASSOCDEP;

        @objid ("870c2d6d-0495-4f38-a2e8-fcd6105f5c77")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1203a056-8d18-472f-9a01-fb9969ec6831")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "18028ade-34c8-4575-802c-163035bf0bb0");
            PASSWORD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "82175de9-34de-4e30-ba3e-d13cdf0653d1");
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
