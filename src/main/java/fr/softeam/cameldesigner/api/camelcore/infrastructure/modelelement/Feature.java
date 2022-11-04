/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
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
 * Proxy class to handle a {@link ModelElement} with << Feature >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a5eb4aa4-b3c3-4bce-b713-24ce0ac2b84e")
public abstract class Feature extends ExpendableElement {
    @objid ("5522c4f3-fdb8-436a-9320-a92384d87a66")
    public static final String STEREOTYPE_NAME = "Feature";

    /**
     * Tells whether a {@link Feature proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Feature >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("65609099-7181-4cc0-aadb-a6fd852f3304")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME));
    }

    /**
     * Tries to instantiate a {@link Feature} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FeatureClass} proxy or <i>null</i>.
     */
    @objid ("3833b4f3-fe19-4d28-b47b-a536bc8aae03")
    public static Feature instantiate(final ModelElement obj) {
        if (FeatureClass.canInstantiate(obj)) {
            return FeatureClass.instantiate(obj);
        }else if (FeatureInstance.canInstantiate(obj)) {
            return FeatureInstance.instantiate(obj);
        }else if (FeaturePort.canInstantiate(obj)) {
            return FeaturePort.instantiate(obj);
        }
        return null;
    }

    /**
     * Tries to instantiate a {@link Feature} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FeatureClass} proxy or <i>null</i>.
     */
    @objid ("1a3fd495-5268-407f-a439-a619cc00e495")
    public static Feature safeinstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (FeatureClass.canInstantiate(obj)) {
            return FeatureClass.instantiate(obj);
        }else if (FeatureInstance.canInstantiate(obj)) {
            return FeatureInstance.instantiate(obj);
        }else if (FeaturePort.canInstantiate(obj)) {
            return FeaturePort.instantiate(obj);
        }
        throw new IllegalArgumentException("Feature: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4c8304e9-223e-4031-8fb7-193e3b90af8a")
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
        Feature other = (Feature) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("a5a4066b-6cc4-43cb-9ce4-974976609873")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("0ee0a479-491f-4219-b9ac-64b5ee259577")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("53100f14-5a9f-4f64-9ff2-dfe3c26bbcfe")
    protected Feature(final ModelElement elt) {
        super(elt);
    }

    @objid ("0cb56ef2-b57c-49c0-afb4-c4b5f234e49b")
    public static final class MdaTypes {
        @objid ("d0200245-4438-4b25-9027-ab59a90b5165")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e32f7285-d7e5-46cb-a0e9-4778c0a8a119")
        private static Stereotype MDAASSOCDEP;

        @objid ("56932352-0dc5-4aef-8393-c2c9137038ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("01b81537-bf50-48e3-abee-8d5bcbb97c24")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1ff10997-aa56-4f9b-b413-f32fadcc29bb");
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
