/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("d123cefb-25b8-456e-aa80-36be0d74ff89")
    public static final String STEREOTYPE_NAME = "FloatValue";

    @objid ("e67500ff-ad10-4a3e-8d41-ede66237e775")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link FloatValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FloatValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b62f2418-bd12-4cfc-81c6-c674bf573078")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FloatValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FloatValue >> then instantiate a {@link FloatValue} proxy.
     * 
     * @return a {@link FloatValue} proxy on the created {@link Class}.
     */
    @objid ("c94aa0ac-cafa-4fe4-8657-c29078731c25")
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
    @objid ("20dd93cb-e849-44f6-b327-c4bc35851bb8")
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
    @objid ("e6233476-8bcd-45b7-b9af-efd6d2e13425")
    public static FloatValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FloatValue.canInstantiate(obj))
        	return new FloatValue(obj);
        else
        	throw new IllegalArgumentException("FloatValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e45324a7-a9af-495a-bde0-22994b48cb66")
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
    @objid ("5adf4b7e-533e-4838-a8f0-78d085967b4b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("638bd639-4730-4020-b01e-626e85cff569")
    public String getValue() {
        return this.elt.getTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("7fa35e68-1d50-4edd-b4ef-82ea5e602fc4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4fd8545-98ed-458e-8c12-3854be335b34")
    public void setValue(final String value) {
        this.elt.putTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("5fff9cea-a561-427e-b263-8afe82aa1fc8")
    protected FloatValue(final Class elt) {
        super(elt);
    }

    @objid ("95a225c8-f353-4ac6-a77b-c22f2f7d009e")
    public static final class MdaTypes {
        @objid ("2629b0f9-683f-4de6-83cf-04aafd4dcc43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dafc3975-362e-4810-aea6-fe6015dab3e5")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("da80c7be-3520-4a35-bcf3-8162fe0fc87a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0b7285b-c812-462c-8f03-6f3222c7fa78")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e6d19e2-31d0-496f-9a10-2c142091d733")
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
