/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("d1839fce-d3b2-4666-ac10-effad3c72b0e")
    public static final String STEREOTYPE_NAME = "ResourceRequirement";

    /**
     * Tells whether a {@link ResourceRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("badc7b10-5323-479c-b836-fa124705427d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ResourceRequirement >> then instantiate a {@link ResourceRequirement} proxy.
     * 
     * @return a {@link ResourceRequirement} proxy on the created {@link Class}.
     */
    @objid ("1c192bca-cba2-4c29-8243-3ce03fc9776b")
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
    @objid ("3ce98606-bcbd-444d-8340-8d23d7184c62")
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
    @objid ("14f26158-63ea-43c7-a7c6-4cf3b91630b1")
    public static ResourceRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ResourceRequirement.canInstantiate(obj))
            return new ResourceRequirement(obj);
        else
            throw new IllegalArgumentException("ResourceRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d9e94329-f8d2-4af8-852c-c4bb747f4088")
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
    @objid ("9bfebb93-79ee-4082-b090-0dd1f419b942")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("b62d034f-ae0a-47ca-8928-6d522d808e2a")
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

    @objid ("d2aaf971-8ab0-4a0b-932f-3d3e64850698")
    protected ResourceRequirement(final Class elt) {
        super(elt);
    }

    @objid ("c4f4ed2f-02b0-404f-90a5-c2cd9dcca0a9")
    public static final class MdaTypes {
        @objid ("09c227c4-bb82-4afe-9607-ea2b7ced60bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d108f4d4-35b6-443c-98ff-39acbc12ea2b")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b7c4454-d5bc-4a9e-81ce-b8a23aaaa060")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75c5291a-48ba-4579-8713-2afd7f685378")
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
