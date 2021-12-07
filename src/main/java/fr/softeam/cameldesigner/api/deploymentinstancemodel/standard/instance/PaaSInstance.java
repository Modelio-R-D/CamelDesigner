/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << PaaSInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("dddfb99b-2d25-4bf8-a552-181e1549079a")
public class PaaSInstance extends ComponentInstance {
    @objid ("0c539036-f69c-49a4-91eb-439e7b4ff0f4")
    public static final String STEREOTYPE_NAME = "PaaSInstance";

    /**
     * Tells whether a {@link PaaSInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaaSInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("75bc2c86-37e5-414a-9815-61c66a5d8be5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaaSInstance >> then instantiate a {@link PaaSInstance} proxy.
     * 
     * @return a {@link PaaSInstance} proxy on the created {@link Instance}.
     */
    @objid ("a0af0418-1e21-4429-bef7-81539d55eecc")
    public static PaaSInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSInstance.STEREOTYPE_NAME);
        return PaaSInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link PaaSInstance} proxy from a {@link Instance} stereotyped << PaaSInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link PaaSInstance} proxy or <i>null</i>.
     */
    @objid ("b85b2c5f-98fa-4aee-80ef-fc3e3455d4fe")
    public static PaaSInstance instantiate(final Instance obj) {
        return PaaSInstance.canInstantiate(obj) ? new PaaSInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSInstance} proxy from a {@link Instance} stereotyped << PaaSInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link PaaSInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d07c27be-5958-4ab3-b3d0-62015b22a879")
    public static PaaSInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaaSInstance.canInstantiate(obj))
            return new PaaSInstance(obj);
        else
            throw new IllegalArgumentException("PaaSInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8d74bf09-f113-4a25-8165-5f6ad2d3ad13")
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
        PaaSInstance other = (PaaSInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("7fc7c974-be35-423a-bcbf-f244308caca2")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("7eb5064d-0920-4138-ad3b-27f15a46cffd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("67ac19ad-c5bb-4b75-af2d-f8ca30f3000e")
    protected PaaSInstance(final Instance elt) {
        super(elt);
    }

    @objid ("387fa399-3754-4069-9e53-4383d23163dc")
    public static final class MdaTypes {
        @objid ("9da3811c-a724-4e70-b593-8ced8c92487b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c5a190a-9659-4c31-a3c0-7dd5e16d83ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("57934e8f-0990-4f81-922c-5a21b18f13dd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd77c554-4440-4cdf-8c17-f705dcd80618")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8d6e2b24-ed30-4aad-9c44-39b18b4c76d8");
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
