/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("dfbc1ba3-3215-4118-8e53-469bc811278b")
    public static final String STEREOTYPE_NAME = "PlatformCredentials";

    @objid ("6fbd2629-3109-432a-98e4-5ffc6e22f2a3")
    public static final String PASSWORD_TAGTYPE = "password";

    /**
     * Tells whether a {@link PlatformCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PlatformCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("607924cd-d3eb-4f1f-b3c6-fed5d6dc668f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PlatformCredentials >> then instantiate a {@link PlatformCredentials} proxy.
     * 
     * @return a {@link PlatformCredentials} proxy on the created {@link Class}.
     */
    @objid ("69821ed6-66ad-4fe1-93e0-c284a4152847")
    public static PlatformCredentials create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME);
        return PlatformCredentials.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PlatformCredentials} proxy from a {@link Class} stereotyped << PlatformCredentials >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PlatformCredentials} proxy or <i>null</i>.
     */
    @objid ("e54e8914-8708-4f32-836d-b00e6a841907")
    public static PlatformCredentials instantiate(final Class obj) {
        return PlatformCredentials.canInstantiate(obj) ? new PlatformCredentials(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PlatformCredentials} proxy from a {@link Class} stereotyped << PlatformCredentials >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PlatformCredentials} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5ccf506d-31ab-4ccd-9904-54759e55c8e7")
    public static PlatformCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PlatformCredentials.canInstantiate(obj))
        	return new PlatformCredentials(obj);
        else
        	throw new IllegalArgumentException("PlatformCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dcb179e8-ad67-4e4c-b0b4-241bd40f0ff8")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4979cd28-01db-495d-91f2-098b012acc43")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("07b04fb5-1e36-472c-ba24-4fba67ec71e7")
    public String getPassword() {
        return this.elt.getTagValue(PlatformCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    @objid ("61866ee9-5c1e-4a30-be37-781a3a242602")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("804e9e83-1ee6-4c05-bd61-63b69ca152b6")
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

    @objid ("6a770772-c0e6-45a7-b48b-922b46a48e07")
    protected PlatformCredentials(final Class elt) {
        super(elt);
    }

    @objid ("92fe8b7b-826a-496c-8b51-48154e382f82")
    public static final class MdaTypes {
        @objid ("ac97283a-e629-45de-8801-08eaa0c98b99")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82eeb1b3-d05e-4bd7-beeb-bb2d1a18d9c4")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("0323dbec-82e0-4a0b-8c1c-77510e65c2c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("37e3a292-daa7-437d-8b37-a0ef8b5e7998")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0911441a-4a7e-4100-b3c5-802687341169")
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
