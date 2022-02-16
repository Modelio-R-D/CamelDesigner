/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("a4846183-a651-4e7e-bcc1-9113af64ac76")
    public static final String STEREOTYPE_NAME = "Feature_Instance";

    /**
     * Tells whether a {@link FeatureInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Feature_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7da9d4c1-69bf-4b5b-b486-b1dfad1c6913")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Feature_Instance >> then instantiate a {@link FeatureInstance} proxy.
     * 
     * @return a {@link FeatureInstance} proxy on the created {@link Instance}.
     */
    @objid ("17f70b1b-8cc7-4c2a-abd4-25c136036688")
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
    @objid ("7393181a-16e0-45ef-949d-73ca0c92268c")
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
    @objid ("4fedc17f-fe66-46ef-b491-1a6d3d15f5e1")
    public static FeatureInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FeatureInstance.canInstantiate(obj))
        	return new FeatureInstance(obj);
        else
        	throw new IllegalArgumentException("FeatureInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e9962beb-95e2-43e7-bd42-343c579ae2f4")
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
    @objid ("9251ae21-fc92-4112-b69c-bba7e996cc20")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("8e3e44cb-7087-47f5-82d9-ac87a0674910")
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

    @objid ("482d09bd-b3af-4814-a89e-07cdc480d8cd")
    protected FeatureInstance(final Instance elt) {
        super(elt);
    }

    @objid ("bf9810f2-5a6a-44a1-8c28-e5122e59ab09")
    public static final class MdaTypes {
        @objid ("c6a4068c-b8f5-4b15-abb9-88ffb7d303ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3600cae2-9713-427d-9754-dae943e6aeb5")
        private static Stereotype MDAASSOCDEP;

        @objid ("b41c4cbb-44d6-4846-82d8-bd62c355a2bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5aabeebe-0f61-4823-8220-648b49280122")
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
