/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << BooleanValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("189044d4-f590-4d4b-94d6-f2503fd76c82")
public class BooleanValue extends Value {
    @objid ("6d7926c8-ceea-4395-882f-a51446126522")
    public static final String STEREOTYPE_NAME = "BooleanValue";

    @objid ("feb70620-2ffe-4f33-9418-d3ee2c2a8328")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link BooleanValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BooleanValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("354daad4-8a24-42f0-83ff-048ec9ce70e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BooleanValue >> then instantiate a {@link BooleanValue} proxy.
     * 
     * @return a {@link BooleanValue} proxy on the created {@link Class}.
     */
    @objid ("e4545821-b517-4f95-9cdb-39af00e3e5db")
    public static BooleanValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BooleanValue.STEREOTYPE_NAME);
        return BooleanValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link BooleanValue} proxy from a {@link Class} stereotyped << BooleanValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link BooleanValue} proxy or <i>null</i>.
     */
    @objid ("5c9340a7-b1ff-4260-9a6d-ea2b6bb4f596")
    public static BooleanValue instantiate(final Class obj) {
        return BooleanValue.canInstantiate(obj) ? new BooleanValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BooleanValue} proxy from a {@link Class} stereotyped << BooleanValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link BooleanValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e71b2e82-7da6-4089-8023-8a41d923e47d")
    public static BooleanValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BooleanValue.canInstantiate(obj))
        	return new BooleanValue(obj);
        else
        	throw new IllegalArgumentException("BooleanValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3198c5f8-1ff0-4dc9-b66b-5740da546b1b")
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
        BooleanValue other = (BooleanValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("aaa42857-7c1e-44bd-b42e-11ec4c76d704")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("1633d657-9897-4c96-93da-52f6441f4bae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("86bca03d-3ecb-44d9-b50a-4406f142c9bc")
    public boolean isValue() {
        return this.elt.isTagged(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("973858c0-47b7-4910-b673-d16b92379c31")
    public void setValue(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("e5c82111-c992-4c7e-b872-8cbac6d261d8")
    protected BooleanValue(final Class elt) {
        super(elt);
    }

    @objid ("2d228821-481c-49eb-a387-abae42f72daf")
    public static final class MdaTypes {
        @objid ("8f3606c1-291f-4bca-8810-bd35bf0a90eb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1f06852a-38a5-42e7-8c8a-79f7c773998c")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("9afc3127-1d52-492d-bb25-1da62385de1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("ffa321f9-fdbe-4d67-aac2-ecbbdf7a4e42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7996773-838b-4620-bbf4-2399f369c6f4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b4355a7e-9eca-4a9e-8c4c-d49344a0c9a5");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2fabd851-ad25-472c-927a-770ef9217dd9");
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
