/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("e0d656d8-2555-4c17-9d2e-48dcceae21f4")
    public static final String STEREOTYPE_NAME = "Feature_Instance";

    /**
     * Tells whether a {@link FeatureInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Feature_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("717bbcab-17eb-4776-b684-a5427478741e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Feature_Instance >> then instantiate a {@link FeatureInstance} proxy.
     * 
     * @return a {@link FeatureInstance} proxy on the created {@link Instance}.
     */
    @objid ("74ad4720-f01b-43f2-a0b9-f08b52e668f4")
    public static FeatureInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureInstance.STEREOTYPE_NAME);
        return FeatureInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link FeatureInstance} proxy from a {@link Instance} stereotyped << Feature_Instance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link FeatureInstance} proxy or <i>null</i>.
     */
    @objid ("fdec6d62-b2d2-4fa1-b1ae-58dd91700b20")
    public static FeatureInstance instantiate(final Instance obj) {
        return FeatureInstance.canInstantiate(obj) ? new FeatureInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureInstance} proxy from a {@link Instance} stereotyped << Feature_Instance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link FeatureInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3549f71f-6529-4fa0-8d34-3070de0f880f")
    public static FeatureInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FeatureInstance.canInstantiate(obj))
            return new FeatureInstance(obj);
        else
            throw new IllegalArgumentException("FeatureInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("22ce77d9-1f60-460b-959e-e3e712f5ab4b")
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
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("191ec980-0577-41ee-9b9f-d55684e68a2d")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("442482f4-7d10-46f3-9de6-1c077cf94426")
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

    @objid ("87835eb6-72c2-4de0-8427-bb44fbcad06f")
    protected FeatureInstance(final Instance elt) {
        super(elt);
    }

    @objid ("bf9810f2-5a6a-44a1-8c28-e5122e59ab09")
    public static final class MdaTypes {
        @objid ("b43df253-5a94-4e6b-99e8-88311137d10e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("81d29d51-819d-496f-9092-e0464d781717")
        private static Stereotype MDAASSOCDEP;

        @objid ("ace6dbc8-4b01-481a-8374-c89fe4aa37a1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dab2f102-c34c-4440-8c58-6a1e74562d3a")
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
