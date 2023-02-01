/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ce5e0395-9b48-4fc6-bde0-5b76c32e82c4")
    public static final String STEREOTYPE_NAME = "FloatValue";

    @objid ("8e0032a9-96d3-4d0f-aea3-0bbee65e1016")
=======
    @objid ("d123cefb-25b8-456e-aa80-36be0d74ff89")
    public static final String STEREOTYPE_NAME = "FloatValue";

    @objid ("e67500ff-ad10-4a3e-8d41-ede66237e775")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link FloatValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FloatValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c7df6f49-e321-4a09-b5af-61ece42a4428")
=======
    @objid ("b62f2418-bd12-4cfc-81c6-c674bf573078")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FloatValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FloatValue >> then instantiate a {@link FloatValue} proxy.
     * 
     * @return a {@link FloatValue} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("f966d015-6fbf-4abe-b2f9-dfcafbc6ff11")
=======
    @objid ("c94aa0ac-cafa-4fe4-8657-c29078731c25")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b6f9cf22-2b32-4dae-92da-b840284d4063")
=======
    @objid ("20dd93cb-e849-44f6-b327-c4bc35851bb8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7d51b587-e999-43d4-9be1-875aa88ef6b6")
=======
    @objid ("e6233476-8bcd-45b7-b9af-efd6d2e13425")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FloatValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FloatValue.canInstantiate(obj))
        	return new FloatValue(obj);
        else
        	throw new IllegalArgumentException("FloatValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("f9a24c3c-cc8f-44ea-99d7-34731cfada4a")
=======
    @objid ("e45324a7-a9af-495a-bde0-22994b48cb66")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6e7d85eb-99ab-4967-835e-83e9838a3d05")
=======
    @objid ("5adf4b7e-533e-4838-a8f0-78d085967b4b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("2cf87625-40cd-427b-be81-b16682065962")
=======
    @objid ("638bd639-4730-4020-b01e-626e85cff569")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValue() {
        return this.elt.getTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("bafe5adb-9dd6-4dfa-b29a-1f0db2ac392b")
=======
    @objid ("7fa35e68-1d50-4edd-b4ef-82ea5e602fc4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3218ac2c-af4b-4ccf-9c78-a68d610c5388")
=======
    @objid ("f4fd8545-98ed-458e-8c12-3854be335b34")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final String value) {
        this.elt.putTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

<<<<<<< HEAD
    @objid ("547e04c6-b709-4bf4-8287-5f3c70b67366")
=======
    @objid ("5fff9cea-a561-427e-b263-8afe82aa1fc8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FloatValue(final Class elt) {
        super(elt);
    }

    @objid ("95a225c8-f353-4ac6-a77b-c22f2f7d009e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("3fd15c0b-b613-499f-afb5-94363c8e6a48")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd102d39-be9b-45f3-a5ce-37845dad3a20")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("005c688a-4869-41e6-8c01-f61c726ad085")
        private static Stereotype MDAASSOCDEP;

        @objid ("e99015a0-d680-4615-b4ad-32f127d99c63")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47467d33-b835-4127-b26b-ac38293f6611")
=======
        @objid ("2629b0f9-683f-4de6-83cf-04aafd4dcc43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dafc3975-362e-4810-aea6-fe6015dab3e5")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("da80c7be-3520-4a35-bcf3-8162fe0fc87a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0b7285b-c812-462c-8f03-6f3222c7fa78")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e6d19e2-31d0-496f-9a10-2c142091d733")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
