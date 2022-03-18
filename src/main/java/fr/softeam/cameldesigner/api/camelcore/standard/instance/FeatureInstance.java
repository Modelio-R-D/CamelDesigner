/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("bc3c3b79-1df2-4ddb-8b36-83445cfb2a56")
    public static final String STEREOTYPE_NAME = "Feature_Instance";

    /**
     * Tells whether a {@link FeatureInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Feature_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2ece3e63-f69d-46c5-8276-74708db93993")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Feature_Instance >> then instantiate a {@link FeatureInstance} proxy.
     * 
     * @return a {@link FeatureInstance} proxy on the created {@link Instance}.
     */
    @objid ("3502c167-f431-4435-838b-dbd5c99ea52e")
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
    @objid ("9da94e81-1386-4d48-ae68-05178355abca")
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
    @objid ("0d8e5b17-2fb9-4d89-9639-a2ad598bc77e")
    public static FeatureInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FeatureInstance.canInstantiate(obj))
        	return new FeatureInstance(obj);
        else
        	throw new IllegalArgumentException("FeatureInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("322f3f6e-e6e2-49b6-9d8f-43d1553e4b63")
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
    @objid ("3b4bf378-5c7d-48ef-9cfa-dac8f09862d6")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("561ba373-a669-4ec3-bfa3-31823ca19424")
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

    @objid ("bdc5ad39-42d5-401b-8a14-166afe068576")
    protected FeatureInstance(final Instance elt) {
        super(elt);
    }

    @objid ("bf9810f2-5a6a-44a1-8c28-e5122e59ab09")
    public static final class MdaTypes {
        @objid ("df22d80b-277e-4ba3-b6b8-47eb381e5aaa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db3f0ba2-ac1c-4cfc-ad76-9a5cb493f131")
        private static Stereotype MDAASSOCDEP;

        @objid ("055c40e7-1566-4b96-a95a-b86b400d12a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("078df477-5929-4db8-b027-77be921c81b8")
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
