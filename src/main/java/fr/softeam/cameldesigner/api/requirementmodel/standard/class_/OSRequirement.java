/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
 * Proxy class to handle a {@link Class} with << OSRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class OSRequirement extends HardRequirement {
    public static final String STEREOTYPE_NAME = "OSRequirement";

    public static final String IS64OS_TAGTYPE = "is64os";

    public static final String OS_TAGTYPE = "os";

    /**
     * Tells whether a {@link OSRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OSRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OSRequirement >> then instantiate a {@link OSRequirement} proxy.
     * 
     * @return a {@link OSRequirement} proxy on the created {@link Class}.
     */
    public static OSRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OSRequirement.STEREOTYPE_NAME);
        return OSRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link OSRequirement} proxy from a {@link Class} stereotyped << OSRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link OSRequirement} proxy or <i>null</i>.
     */
    public static OSRequirement instantiate(final Class obj) {
        return OSRequirement.canInstantiate(obj) ? new OSRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OSRequirement} proxy from a {@link Class} stereotyped << OSRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link OSRequirement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static OSRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OSRequirement.canInstantiate(obj))
            return new OSRequirement(obj);
        else
            throw new IllegalArgumentException("OSRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        OSRequirement other = (OSRequirement) obj;
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
     * Getter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getIs64os() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getOs() {
        return this.elt.getTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'is64os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setIs64os(final String value) {
        this.elt.putTagValue(OSRequirement.MdaTypes.IS64OS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'os'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setOs(final String value) {
        this.elt.putTagValue(OSRequirement.MdaTypes.OS_TAGTYPE_ELT, value);
    }

    protected OSRequirement(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType OS_TAGTYPE_ELT;

        public static TagType IS64OS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "64f95ec3-043c-4955-bfcb-9aabe91d54fe");
            OS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49d0562e-ffa2-4b4a-868d-9912389113a8");
            IS64OS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1fd5f98d-5994-42d1-8b1f-e0de7d51fb9b");
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
