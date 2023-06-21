/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << ResourceRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2fe5307-a14d-44f3-b715-fa81339f2064")
public class ResourceRequirement extends HardRequirement {
    @objid ("69ab1259-00f3-4399-ae93-6f6e3c22756a")
    public static final String STEREOTYPE_NAME = "ResourceRequirement";

    /**
     * Tells whether a {@link ResourceRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca36086a-0edc-41a8-a4c6-53e494758e20")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ResourceRequirement >> then instantiate a {@link ResourceRequirement} proxy.
     * 
     * @return a {@link ResourceRequirement} proxy on the created {@link Class}.
     */
    @objid ("49a36091-f37a-4451-b2bc-2af0051ea466")
    public static ResourceRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME);
        return ResourceRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ResourceRequirement} proxy from a {@link Class} stereotyped << ResourceRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ResourceRequirement} proxy or <i>null</i>.
     */
    @objid ("140164f2-f640-4986-9897-1845c25e74f2")
    public static ResourceRequirement instantiate(final Class obj) {
        return ResourceRequirement.canInstantiate(obj) ? new ResourceRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceRequirement} proxy from a {@link Class} stereotyped << ResourceRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ResourceRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c1bd0f9c-1234-40cb-a2f4-180cab637135")
    public static ResourceRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ResourceRequirement.canInstantiate(obj))
        	return new ResourceRequirement(obj);
        else
        	throw new IllegalArgumentException("ResourceRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("56d6c203-2c38-414b-81ce-fccbff6315d4")
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
        ResourceRequirement other = (ResourceRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4fdad5a8-8e9e-450d-97e1-8d1600aec27c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("1c6d18e0-800f-4bf7-8996-b85a90975cd1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a38759c2-2c60-427c-9c58-7cb7f087b663")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("d960afab-8a4a-468f-a022-83545b0260aa")
    protected ResourceRequirement(final Class elt) {
        super(elt);
    }

    @objid ("c4f4ed2f-02b0-404f-90a5-c2cd9dcca0a9")
    public static final class MdaTypes {
        @objid ("45f14d14-f348-46af-ac1c-6ab95ded3081")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1768c5c4-0784-45b8-bab1-a053c1eb8ac8")
        private static Stereotype MDAASSOCDEP;

        @objid ("398f2f4d-7857-467d-94c7-c93758434dda")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4007a3f-a4e9-40b3-8b80-571a472c148e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4e76597a-e007-4596-abfe-591ce920815d");
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
