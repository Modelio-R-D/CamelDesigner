/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("3d9e767a-5621-44ba-a30a-bd9ab7e18d54")
    public static final String STEREOTYPE_NAME = "FloatValue";

    @objid ("9c8cf05a-1111-49fa-a603-f3f0b33e99db")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link FloatValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FloatValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("591bbc34-71f8-4fdf-9f1b-b7421209ae37")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FloatValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FloatValue >> then instantiate a {@link FloatValue} proxy.
     * 
     * @return a {@link FloatValue} proxy on the created {@link Class}.
     */
    @objid ("fd41ad0b-bcf9-4697-b977-0f8a81bbab1b")
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
    @objid ("d4c85fdb-0d4e-4a3a-ac65-d75a8949ba80")
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
    @objid ("f3041985-41c4-4a98-9bdb-ff364e71d7c5")
    public static FloatValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FloatValue.canInstantiate(obj))
        	return new FloatValue(obj);
        else
        	throw new IllegalArgumentException("FloatValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4cb0d47c-e873-4cc8-a8e8-506b26d5d1d8")
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
    @objid ("01f55e23-6f61-4aa5-8e2f-b5cd0a5e3a57")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2246a35c-d212-44dc-bc06-dfeca3e69d77")
    public String getValue() {
        return this.elt.getTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("18385eee-e19b-4f61-b249-14f9cd646fe5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("52672600-1557-442f-ad36-d3d1207933ca")
    public void setValue(final String value) {
        this.elt.putTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("42e266cd-95f0-456a-a79f-72c7fd598f66")
    protected FloatValue(final Class elt) {
        super(elt);
    }

    @objid ("95a225c8-f353-4ac6-a77b-c22f2f7d009e")
    public static final class MdaTypes {
        @objid ("b0c20efb-e19f-49d9-987e-fd90ed7c0c20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9fae248-318d-431e-93e0-bb7e0664a27d")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("67652517-a7e4-4bb8-9247-ce7b5c0d0127")
        private static Stereotype MDAASSOCDEP;

        @objid ("8bda6a0d-1d36-41e4-b39f-15d9f89fd46d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dba7181d-2bc3-4a3f-9c2e-25773a0b5449")
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
