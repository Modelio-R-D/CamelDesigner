/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("263990fb-14e8-4410-84f4-767e137ad37b")
    public static final String STEREOTYPE_NAME = "PlatformCredentials";

    @objid ("ed6587dc-1c64-4256-b41c-4b18e1af7f1a")
    public static final String PASSWORD_TAGTYPE = "password";

    /**
     * Tells whether a {@link PlatformCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PlatformCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a59b69ec-3b29-4676-9e84-d3315e91faf5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PlatformCredentials >> then instantiate a {@link PlatformCredentials} proxy.
     * 
     * @return a {@link PlatformCredentials} proxy on the created {@link Class}.
     */
    @objid ("97c3587f-d454-456f-830d-5bcb79bed3ab")
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
    @objid ("025e0a8e-67c8-40c4-9e5d-ac8d79a344c3")
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
    @objid ("f758b8d2-2337-4996-8824-f21f2e82d814")
    public static PlatformCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PlatformCredentials.canInstantiate(obj))
            return new PlatformCredentials(obj);
        else
            throw new IllegalArgumentException("PlatformCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6b4b9e5e-2433-4d10-b943-68ac2f83bc14")
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
    @objid ("43f0ed2c-ad69-4caa-87ce-c15b26f580e3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02cf8c1f-e1b9-4fed-915d-9e92fe55cbd6")
    public String getPassword() {
        return this.elt.getTagValue(PlatformCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    @objid ("2ba61f0f-920f-4485-866b-c5e9825a9673")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5695d130-a511-4de2-9e1f-b666e923eb57")
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

    @objid ("f8604c0d-b32d-4074-bcf3-14e3a8fd951a")
    protected PlatformCredentials(final Class elt) {
        super(elt);
    }

    @objid ("92fe8b7b-826a-496c-8b51-48154e382f82")
    public static final class MdaTypes {
        @objid ("3896cde7-8965-4f6d-80af-e8b0e3efc77e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("68116a21-6365-42f2-8095-5ba6335a24fa")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("4faa91e6-dc75-47f1-b135-2d4d01187907")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac0b4504-68fc-49b2-9747-0b2a10b785f5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9fe5a0b0-1337-43f5-bc17-a00ea024c204")
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
