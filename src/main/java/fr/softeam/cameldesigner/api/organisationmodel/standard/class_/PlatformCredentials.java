/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("0681ba2d-7d52-4dec-b2b8-5609726182d2")
    public static final String STEREOTYPE_NAME = "PlatformCredentials";

    @objid ("8917e84b-c658-4262-8552-08298bccaf51")
    public static final String PASSWORD_TAGTYPE = "password";

    /**
     * Tells whether a {@link PlatformCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PlatformCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("49717772-b094-4d06-8e99-0e94ff5ccff1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PlatformCredentials >> then instantiate a {@link PlatformCredentials} proxy.
     * 
     * @return a {@link PlatformCredentials} proxy on the created {@link Class}.
     */
    @objid ("7933b51e-ca99-49c2-bff7-15238b764ae4")
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
    @objid ("15617b43-6ff8-49fd-8b85-de3aedcb4cc9")
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
    @objid ("dc51a72d-842f-4add-84b8-d91ad14a66f7")
    public static PlatformCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PlatformCredentials.canInstantiate(obj))
        	return new PlatformCredentials(obj);
        else
        	throw new IllegalArgumentException("PlatformCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a67acf4b-0fb0-44c0-af1e-5b201f224eeb")
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
    @objid ("55fea6c9-ccdb-4c1c-8a80-4ef5121be1ac")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0847e500-2cf9-40fc-a7fb-59508acad8c2")
    public String getPassword() {
        return this.elt.getTagValue(PlatformCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    @objid ("abf18b64-9117-4afd-938d-a28a12923986")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e2c628ce-0471-4503-b791-436eb50f1aef")
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

    @objid ("a09626f5-4687-4c1c-9d64-01d7cda85eae")
    protected PlatformCredentials(final Class elt) {
        super(elt);
    }

    @objid ("92fe8b7b-826a-496c-8b51-48154e382f82")
    public static final class MdaTypes {
        @objid ("bb33be03-2de1-4639-8e6a-7f19000ead0a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf31eabb-aaf7-4410-9b9d-d96d18175082")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("cc0e0b57-bcd9-400b-bb90-b485033d93eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("c8906b7b-99a6-478b-a4d0-17d5acc10e5e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31e0977b-fbf4-4ace-9749-2a2f68cfc5d9")
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
