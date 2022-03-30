/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("66b61cf1-ff4b-4f32-8aba-65061cd77afe")
    public static final String STEREOTYPE_NAME = "PropertyDependency";

    /**
     * Tells whether a {@link PropertyDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << PropertyDependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0a70b8e0-5353-4e29-8725-4915379b3deb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << PropertyDependency >> then instantiate a {@link PropertyDependency} proxy.
     * 
     * @return a {@link PropertyDependency} proxy on the created {@link Dependency}.
     */
    @objid ("0ac52fe4-c3e0-42c5-8dcb-f29eff324ee8")
    public static PropertyDependency create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PropertyDependency.STEREOTYPE_NAME);
        return PropertyDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link PropertyDependency} proxy or <i>null</i>.
     */
    @objid ("fc69e911-6985-4aab-ac4a-78129f7950fd")
    public static PropertyDependency instantiate(final Dependency obj) {
        return PropertyDependency.canInstantiate(obj) ? new PropertyDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDependency} proxy from a {@link Dependency} stereotyped << PropertyDependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link PropertyDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("13447715-9022-43cf-91fb-2b4a8e96e3fb")
    public static PropertyDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (PropertyDependency.canInstantiate(obj))
        	return new PropertyDependency(obj);
        else
        	throw new IllegalArgumentException("PropertyDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f231e121-260c-4467-8382-dfd95cc9f713")
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
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("061c52d3-bee0-4b87-9fac-7861cc5ed1a9")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("00692b86-7b72-4c6e-a7df-5f2f069f782c")
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

    @objid ("e1c422a9-84a9-4e46-bbaa-cbe6d96d0a90")
    protected PropertyDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("ee885f54-f4e7-4fbc-9bb2-acd65bf59695")
    public static final class MdaTypes {
        @objid ("12a2023b-377d-4153-b91f-f511d3421509")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1380be16-f998-4d56-b3b7-dd10b21f43f8")
        private static Stereotype MDAASSOCDEP;

        @objid ("8863b371-6f56-4a20-b18c-2fa807b8afbf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de9caa5e-8298-43f6-8620-fea78dac0af0")
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
