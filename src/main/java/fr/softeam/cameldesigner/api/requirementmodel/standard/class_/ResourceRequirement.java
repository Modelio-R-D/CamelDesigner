/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("0ce219dc-d6c9-490e-aad4-9e34786d2d15")
    public static final String STEREOTYPE_NAME = "ResourceRequirement";

    /**
     * Tells whether a {@link ResourceRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("62260628-d529-4380-b5e8-743a438c90e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ResourceRequirement >> then instantiate a {@link ResourceRequirement} proxy.
     * 
     * @return a {@link ResourceRequirement} proxy on the created {@link Class}.
     */
    @objid ("d5256e66-a4cb-44c8-991d-ac0e9fcb637b")
    public static ResourceRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME);
        return ResourceRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ResourceRequirement} proxy from a {@link Class} stereotyped << ResourceRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ResourceRequirement} proxy or <i>null</i>.
     */
    @objid ("e5de0cb3-a53a-4270-9a5e-538313bc80a3")
    public static ResourceRequirement instantiate(final Class obj) {
        return ResourceRequirement.canInstantiate(obj) ? new ResourceRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceRequirement} proxy from a {@link Class} stereotyped << ResourceRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ResourceRequirement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f92290c7-8909-415b-ac3c-dfbca9e1b36c")
    public static ResourceRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ResourceRequirement.canInstantiate(obj))
            return new ResourceRequirement(obj);
        else
            throw new IllegalArgumentException("ResourceRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eb4323ca-c46e-43d8-a60c-5f71d8537e86")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e8b9f953-df47-400b-a887-bbb0dc986ec8")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("87f218be-9be0-4dd5-9f4e-78106be0e9e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6da0c96c-7307-4789-beed-a8a5b944c4b4")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("b762881c-2adc-4df5-b875-0a3876c7c84b")
    protected ResourceRequirement(final Class elt) {
        super(elt);
    }

    @objid ("c4f4ed2f-02b0-404f-90a5-c2cd9dcca0a9")
    public static final class MdaTypes {
        @objid ("719aaabb-4370-4f4e-bc23-bbffa4715446")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c633b94-af63-4766-96b8-44a5edcc0188")
        private static Stereotype MDAASSOCDEP;

        @objid ("21645295-1853-4f60-bb32-b21524dda72c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("da58a58c-4b6c-44ed-93f7-13d9ea5c4c79")
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
