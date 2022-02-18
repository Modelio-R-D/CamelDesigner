/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("6880e955-d601-4ef2-8276-5525fa656b9f")
    public static final String STEREOTYPE_NAME = "ResourceRequirement";

    /**
     * Tells whether a {@link ResourceRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("288aea9c-f40c-43de-8ba9-48a2155ad46b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ResourceRequirement >> then instantiate a {@link ResourceRequirement} proxy.
     * 
     * @return a {@link ResourceRequirement} proxy on the created {@link Class}.
     */
    @objid ("3a5c4265-aa51-4cb1-ac87-8ceae2bf283e")
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
    @objid ("dd3e8fe6-af20-41fa-84d5-47cb31608a1c")
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
    @objid ("6e3c49f9-c287-4be9-9cd4-4f0bb6dbcd90")
    public static ResourceRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ResourceRequirement.canInstantiate(obj))
        	return new ResourceRequirement(obj);
        else
        	throw new IllegalArgumentException("ResourceRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1aea96b5-f6c1-42c4-806b-d1aa01cd5651")
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
    @objid ("64c27698-cb6a-45c5-9341-36cb4fd8e1fd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("ca7f4715-5bf2-49db-b4be-65cf08c15396")
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

    @objid ("b37da753-f832-4b3b-839b-5956f7900a92")
    protected ResourceRequirement(final Class elt) {
        super(elt);
    }

    @objid ("c4f4ed2f-02b0-404f-90a5-c2cd9dcca0a9")
    public static final class MdaTypes {
        @objid ("42d449d0-bb29-4c3f-9f48-c209c9028e47")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3331e46f-acd9-463c-9d9f-661b28cf7551")
        private static Stereotype MDAASSOCDEP;

        @objid ("01b2fd97-18ed-4734-88a8-f7e0d900c64e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef7177c6-90dd-429d-b485-44d435b32b12")
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
