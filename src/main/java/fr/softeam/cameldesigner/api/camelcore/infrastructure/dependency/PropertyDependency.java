/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("7b0c3faa-d05e-4e80-85e3-11b2f6cfe944")
    public static final String STEREOTYPE_NAME = "PropertyDependency";

    /**
     * Tells whether a {@link PropertyDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << PropertyDependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d629c3da-2518-49fc-9a35-8545c438feb2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << PropertyDependency >> then instantiate a {@link PropertyDependency} proxy.
     * 
     * @return a {@link PropertyDependency} proxy on the created {@link Dependency}.
     */
    @objid ("3827bac9-ad2e-4f74-99fe-789b6baf7588")
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
    @objid ("e6056c8f-74d3-4bb3-a825-f717fbb92065")
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
    @objid ("916b0873-dd9d-484a-a8df-e62ea650f9f6")
    public static PropertyDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (PropertyDependency.canInstantiate(obj))
            return new PropertyDependency(obj);
        else
            throw new IllegalArgumentException("PropertyDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8c38345a-1c2f-4498-bdf0-5fcfccdf7629")
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
    @objid ("a356a7fd-bed7-4ec5-aa71-0b9c83977761")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("527cfc02-21f8-44e2-9f88-1c2483c76ab2")
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

    @objid ("d28912bf-b80e-48f2-84df-59c03328848b")
    protected PropertyDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("ee885f54-f4e7-4fbc-9bb2-acd65bf59695")
    public static final class MdaTypes {
        @objid ("bebb031e-4448-4cba-8ef9-3c4d71e60daf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bcc0fc60-35d1-448a-91d2-f02d7a9b33e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("ceb75a4e-09ab-45c6-b0ce-1a11c49efaf9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9db81218-fc47-4158-a9b2-9fc4653170e7")
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
