/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << StringValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("108ceff7-c9cf-4dcb-8e30-e9a6e0322996")
public class StringValue extends Value {
    @objid ("9238e659-14d5-4935-ad24-168c3f783119")
    public static final String STEREOTYPE_NAME = "StringValue";

    @objid ("956bcdaf-098e-4c5c-a14e-b0991cfa0ba8")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link StringValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << StringValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a698ccc3-60eb-4fc4-9032-a70c90435350")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << StringValue >> then instantiate a {@link StringValue} proxy.
     * 
     * @return a {@link StringValue} proxy on the created {@link Class}.
     */
    @objid ("a9c4ec82-9b50-4f90-92c6-52e52ac475d6")
    public static StringValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME);
        return StringValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link StringValue} proxy from a {@link Class} stereotyped << StringValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link StringValue} proxy or <i>null</i>.
     */
    @objid ("58d8c674-d04e-4b1b-bb39-ac810e078636")
    public static StringValue instantiate(final Class obj) {
        return StringValue.canInstantiate(obj) ? new StringValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StringValue} proxy from a {@link Class} stereotyped << StringValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link StringValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("054d5a4b-c955-4a29-92aa-12fcdb81c8a8")
    public static StringValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (StringValue.canInstantiate(obj))
        	return new StringValue(obj);
        else
        	throw new IllegalArgumentException("StringValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b5142d50-1219-4050-aa8d-fbdee1f63f87")
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
        StringValue other = (StringValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7624bfde-d1d1-456f-8843-b6cbcd084400")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e54294e6-996c-4dd3-a552-47ec94f428d0")
    public String getValue() {
        return this.elt.getTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("7a839215-e4af-49cd-b246-52f204bdfb7d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c6952dff-6a73-47a8-b63d-06961d682a34")
    public void setValue(final String value) {
        this.elt.putTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("b030a629-993b-4356-8559-ff55678eb1b2")
    protected StringValue(final Class elt) {
        super(elt);
    }

    @objid ("9399a459-61a5-4415-942d-4d13e631e29a")
    public static final class MdaTypes {
        @objid ("19e1ca6c-b09b-4483-a4c0-3b1f0e0de2b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("44089a9e-7539-48a9-a6ac-a6b933fdd28b")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("261074cf-c8d6-4d3b-9c2e-9400d3c797a9")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a452dcd-0564-4136-9fa9-09d60692556e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("428245be-3b26-422b-a11e-ae227d0d614f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6150e77e-8a8a-40f6-9270-79aa182fc926");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dc99a44c-debc-43d9-a8f2-cf3b62a7138f");
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
