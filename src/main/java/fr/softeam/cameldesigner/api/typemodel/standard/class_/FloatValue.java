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
 * Proxy class to handle a {@link Class} with << FloatValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c564a192-5f95-43db-852f-76f717dcdaa6")
public class FloatValue extends NumericValue {
    @objid ("51e1189a-f21d-45c9-94b0-379fa085ecc6")
    public static final String STEREOTYPE_NAME = "FloatValue";

    @objid ("b8093673-45db-4b21-af78-1a33f4cbb997")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link FloatValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FloatValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f500a396-00a5-41a9-929b-24c4b6c0e34d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FloatValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FloatValue >> then instantiate a {@link FloatValue} proxy.
     * 
     * @return a {@link FloatValue} proxy on the created {@link Class}.
     */
    @objid ("83732237-bc9d-4968-976a-44ef46430b4c")
    public static FloatValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FloatValue.STEREOTYPE_NAME);
        return FloatValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FloatValue} proxy from a {@link Class} stereotyped << FloatValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FloatValue} proxy or <i>null</i>.
     */
    @objid ("76c0f84d-7ac7-4665-a5a3-4e5f549f6a86")
    public static FloatValue instantiate(final Class obj) {
        return FloatValue.canInstantiate(obj) ? new FloatValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FloatValue} proxy from a {@link Class} stereotyped << FloatValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FloatValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("08671fcb-9903-406a-8363-6c386a61f797")
    public static FloatValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FloatValue.canInstantiate(obj))
        	return new FloatValue(obj);
        else
        	throw new IllegalArgumentException("FloatValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("76b815f3-c91d-4790-8ee2-49f8d99a2f5e")
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
        FloatValue other = (FloatValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a5e3112b-51dd-41d2-b710-7d5352aab16b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("204e179a-f30d-4bb6-bc51-a916e504a5eb")
    public String getValue() {
        return this.elt.getTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("4ec4c568-bc29-47d6-bfcd-3a5cc9ec4ef0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("07d668f3-7421-4355-ba2c-9021462a9919")
    public void setValue(final String value) {
        this.elt.putTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("1c398f10-f8f9-443b-b520-e848aa44c474")
    protected FloatValue(final Class elt) {
        super(elt);
    }

    @objid ("95a225c8-f353-4ac6-a77b-c22f2f7d009e")
    public static final class MdaTypes {
        @objid ("52410e06-ee86-4a9f-ab5f-60b37cdb173d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7a7c70dc-2331-48fd-b8dc-932dd060a3bb")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("e6547cda-06bc-4831-b711-f8b67b2affbb")
        private static Stereotype MDAASSOCDEP;

        @objid ("564001ac-ca6b-416e-b37f-6dac67773514")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8241b3e7-1722-4f43-aa4b-e4d85dcff004")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b1f1ce0e-5329-4ea6-ad29-efcecf0e3fd3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39512df5-0c85-431c-a6e2-bda678216414");
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
