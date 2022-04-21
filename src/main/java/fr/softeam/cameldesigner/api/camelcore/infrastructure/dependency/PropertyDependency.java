/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency;

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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << PropertyDependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("66e1dd55-fc1a-4daa-b03e-a10778bf9f73")
public class PropertyDependency extends CamelElement {
    @objid ("ae9fde68-da7c-4297-adf8-776df1594a62")
    public static final String STEREOTYPE_NAME = "PropertyDependency";

    /**
     * Tells whether a {@link PropertyDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << PropertyDependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6691d50a-9c47-45a1-9d3c-c208b4852d94")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << PropertyDependency >> then instantiate a {@link PropertyDependency} proxy.
     * 
     * @return a {@link PropertyDependency} proxy on the created {@link Dependency}.
     */
    @objid ("42c2a61d-5ea5-4963-881e-657c77409b02")
    public static PropertyDependency create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME);
        return PropertyDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Dependency
     * @return a {@link PropertyDependency} proxy or <i>null</i>.
     */
    @objid ("5440567b-9e10-4fa0-9d25-0fe6feccdfc1")
    public static PropertyDependency instantiate(final Dependency obj) {
        return PropertyDependency.canInstantiate(obj) ? new PropertyDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Dependency}
     * @return a {@link PropertyDependency} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f203c824-44be-4d8e-9317-c859f9ea5182")
    public static PropertyDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (PropertyDependency.canInstantiate(obj))
            return new PropertyDependency(obj);
        else
            throw new IllegalArgumentException("PropertyDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7db64d9c-7246-4b1c-924d-a034b32b3c35")
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
        PropertyDependency other = (PropertyDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}.
     * 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("712eea4b-3756-4fd5-8207-3a6dce5f2b8f")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("d0fc82b1-e380-446c-857e-3dc52ba10970")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cf3e9910-f949-41ac-bcae-e3a97c13976d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("c4f32271-daee-4263-b05f-5520bedeb240")
    protected PropertyDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("ee885f54-f4e7-4fbc-9bb2-acd65bf59695")
    public static final class MdaTypes {
        @objid ("5a4ea156-1cd7-4e54-8ea3-472b184982e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("506f714c-fcd2-4cf4-aa4b-f7d5578ac81c")
        private static Stereotype MDAASSOCDEP;

        @objid ("62eb7a39-75a5-4360-a59b-3f24ac9cfb2f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dcc1f67d-6ad5-411a-affe-df2be8fff519")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "738c4b6c-0cf3-4276-b6d9-7fe4ec31ff01");
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
