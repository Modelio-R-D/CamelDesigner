/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("c133224f-3100-4b0e-9f48-08d9a2c6b9f8")
    public static final String STEREOTYPE_NAME = "StringValue";

    @objid ("69479197-1c7c-4586-bd37-48be4cd81913")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link StringValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << StringValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("57e7fc7f-2b71-4ba6-9661-c52255c93240")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << StringValue >> then instantiate a {@link StringValue} proxy.
     * 
     * @return a {@link StringValue} proxy on the created {@link Class}.
     */
    @objid ("ace50acb-61cf-4abb-b064-93d09810f8bf")
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
    @objid ("bdf2b9fb-3ad9-49e1-a03b-de93d9b756ac")
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
    @objid ("852718f6-e7f3-4d74-b9bd-2fe062246dcd")
    public static StringValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (StringValue.canInstantiate(obj))
        	return new StringValue(obj);
        else
        	throw new IllegalArgumentException("StringValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("610cc16a-9d60-46ba-9c45-c429324ffad2")
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
    @objid ("45241fce-a939-4b8b-9524-f030c384680c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c1a73f43-92f0-4e9c-b89d-126aaebc7e86")
    public String getValue() {
        return this.elt.getTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("2883c489-f5e3-45df-99ae-2e3ed15d2f33")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("857abfe3-3620-4019-ba43-555072f1b63e")
    public void setValue(final String value) {
        this.elt.putTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("44df32d1-d75c-40c7-85dd-34637b22250d")
    protected StringValue(final Class elt) {
        super(elt);
    }

    @objid ("9399a459-61a5-4415-942d-4d13e631e29a")
    public static final class MdaTypes {
        @objid ("c27720b3-9b81-4860-8800-f066ec530401")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bf1937dd-ed34-41a7-a368-0e81dffdd2a4")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("21d7d7ce-545c-43fb-b6ee-bea43c60ed8b")
        private static Stereotype MDAASSOCDEP;

        @objid ("12f53761-ab72-4587-9ea7-6bc693a01b1b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c4d4eed7-4197-46eb-875b-8dafb01ee8e6")
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
