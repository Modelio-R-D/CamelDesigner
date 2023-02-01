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
 * Proxy class to handle a {@link Class} with << StringValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("108ceff7-c9cf-4dcb-8e30-e9a6e0322996")
public class StringValue extends Value {
<<<<<<< HEAD
    @objid ("dcc921c3-7672-4b32-b1e6-a24678b2ae48")
    public static final String STEREOTYPE_NAME = "StringValue";

    @objid ("d69ae725-4bd7-46ab-884b-ed55a704a275")
=======
    @objid ("df68147f-b968-48a0-b728-1cfb2a26b715")
    public static final String STEREOTYPE_NAME = "StringValue";

    @objid ("3aa3321d-4b96-48ad-a50d-fa4c3d4877b5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link StringValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << StringValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("706a14b6-1cfc-48ec-b208-cd325cb93460")
=======
    @objid ("f8ea81c4-51da-49c7-b0af-04b9855bce02")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << StringValue >> then instantiate a {@link StringValue} proxy.
     * 
     * @return a {@link StringValue} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("6c43d5e0-a803-4315-b62a-a8bd32a0aace")
=======
    @objid ("7d84919f-68fa-4c2e-a321-f2512fbbbebf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c142e913-a2a6-4beb-8536-143fc3e2102a")
=======
    @objid ("e28800fb-abb3-45bc-9592-c0fbf80bb200")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3e4d0c84-45e0-49cd-8a85-16056434cb4b")
=======
    @objid ("f61fa1fa-4dda-4cd5-8a8d-e15183da3f9c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static StringValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (StringValue.canInstantiate(obj))
        	return new StringValue(obj);
        else
        	throw new IllegalArgumentException("StringValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("452b72d4-924b-46f7-9877-304cc347ce14")
=======
    @objid ("1015fbf9-c0bc-4aea-a80d-8dc63e8443b8")
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
        StringValue other = (StringValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("7cd2074d-0e7e-4c25-bf7c-71c445336652")
=======
    @objid ("802d9606-1abf-4138-94e0-6b373bdaff9e")
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
    @objid ("8eaf5da7-5029-451c-9269-5ca2582fea43")
=======
    @objid ("d5274560-87f1-461f-9760-77f04706ad7b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValue() {
        return this.elt.getTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("29531bcb-2096-4a09-b0ea-f54731c06d3a")
=======
    @objid ("47a017b3-8237-40ae-9c06-4c28b7fab0fc")
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
    @objid ("96f2e4ee-8e3d-4581-aa95-73a271bfdf80")
=======
    @objid ("f1116b0b-c6a1-4b8d-8f25-4c4ce853d012")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final String value) {
        this.elt.putTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

<<<<<<< HEAD
    @objid ("a65f8440-bda3-4903-99a7-f896495c1eca")
=======
    @objid ("1db1a250-cf2d-4d2d-a009-8da5ef6b42ff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected StringValue(final Class elt) {
        super(elt);
    }

    @objid ("9399a459-61a5-4415-942d-4d13e631e29a")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c4fecec4-2dad-42b9-8e4a-a66ce957ec58")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ea6ca6b1-9083-444e-9ee8-e504a825cfac")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("9b3da71a-debb-4537-b4c8-79560a344fa8")
        private static Stereotype MDAASSOCDEP;

        @objid ("4acd765a-00f5-41d8-b465-aca46616d6df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aa6977c6-a6ce-4c9a-be6a-ed0b4f9ddc0d")
=======
        @objid ("5d4b1d15-4680-4649-b4b0-5d3cbc67a29c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4e7b7356-1762-4ede-ae35-960d1c579281")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("5501ce3e-60a8-4f87-bab1-89862d2a2e05")
        private static Stereotype MDAASSOCDEP;

        @objid ("e76eb711-5767-4200-ad9f-43f33fbe1d9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fdcd337a-e34b-4906-aad2-3381e1c784e0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
