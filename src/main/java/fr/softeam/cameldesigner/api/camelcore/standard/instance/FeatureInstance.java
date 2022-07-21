/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
 * Proxy class to handle a {@link Instance} with << Feature_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("026725c7-06a7-48a0-9a82-211b4a69fe6e")
public class FeatureInstance extends Feature {
    @objid ("f021b8a7-b186-473f-ba1d-89f3e3e594cf")
    public static final String STEREOTYPE_NAME = "Feature_Instance";

    /**
     * Tells whether a {@link FeatureInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Feature_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("42900191-e3a2-401c-9a39-f2cdfc302d79")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Feature_Instance >> then instantiate a {@link FeatureInstance} proxy.
     * 
     * @return a {@link FeatureInstance} proxy on the created {@link Instance}.
     */
    @objid ("7618e6a2-ae20-4d05-a4fa-1b525cf4a22a")
    public static FeatureInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME);
        return FeatureInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link FeatureInstance} proxy from a {@link Instance} stereotyped << Feature_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link FeatureInstance} proxy or <i>null</i>.
     */
    @objid ("7cf61e22-3de8-47ce-8e14-2cbf6357ca57")
    public static FeatureInstance instantiate(final Instance obj) {
        return FeatureInstance.canInstantiate(obj) ? new FeatureInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureInstance} proxy from a {@link Instance} stereotyped << Feature_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link FeatureInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bde60c32-2bd7-4fe0-a15d-968b37cbcee6")
    public static FeatureInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FeatureInstance.canInstantiate(obj))
        	return new FeatureInstance(obj);
        else
        	throw new IllegalArgumentException("FeatureInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a207b19-9803-4d30-8115-a0f00dca381e")
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
        FeatureInstance other = (FeatureInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("b6924aa0-fc98-4127-8d5f-dfe8a007f478")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("2581c4ae-1030-4a9f-8f7c-a13cbfaef4f8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("41f7ed54-2997-4eed-96b5-8994764096dd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("4453d585-d483-48b8-9c4e-9ad3821509e6")
    protected FeatureInstance(final Instance elt) {
        super(elt);
    }

    @objid ("bf9810f2-5a6a-44a1-8c28-e5122e59ab09")
    public static final class MdaTypes {
        @objid ("2adde2a9-451e-4e3a-b4e6-b6d6e473c9d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c3fda0a4-2459-4e58-a1e1-9e08a0323fb7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a9e67d5d-f65a-431e-a59d-fb7f61ac5884")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f51118cb-95a4-4d4d-8a87-8e1d02d2a9e6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "df209aca-1325-4c99-b383-ca2650224ff6");
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
