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
 * Proxy class to handle a {@link Class} with << BooleanValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("189044d4-f590-4d4b-94d6-f2503fd76c82")
public class BooleanValue extends Value {
<<<<<<< HEAD
    @objid ("aa83c5cb-fcfb-4cad-b618-0cd25433021f")
    public static final String STEREOTYPE_NAME = "BooleanValue";

    @objid ("04b8ddcd-298a-43ba-ac58-2bfd50d874df")
=======
    @objid ("cecf5f6f-d79d-4189-a14e-303d69a99ed5")
    public static final String STEREOTYPE_NAME = "BooleanValue";

    @objid ("a5761f78-1642-45f8-a57f-01c224a28aee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link BooleanValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BooleanValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8a29a2be-f966-4772-9a6b-e6e7c756fa5b")
=======
    @objid ("872d032c-daa1-4a64-bad0-eb2364aaad87")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BooleanValue >> then instantiate a {@link BooleanValue} proxy.
     * 
     * @return a {@link BooleanValue} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("5b75ffa5-10c2-40b2-9031-1756887e3eaa")
=======
    @objid ("f3cc8b1e-f960-486e-92a2-f7f155078e19")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("15941f55-e40a-4744-92b5-bb86483f0356")
=======
    @objid ("751874bd-bbeb-48e2-a0dc-7ef4d1805606")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("40bf80ce-f1ea-4eda-9cc3-3480c32b87a7")
=======
    @objid ("9eec1abe-00fe-437f-8e5b-619d2f9181a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static BooleanValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BooleanValue.canInstantiate(obj))
        	return new BooleanValue(obj);
        else
        	throw new IllegalArgumentException("BooleanValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("be93703e-4d19-4ced-969a-9fbddbac8b04")
=======
    @objid ("10440459-6a04-4005-9203-235574911dba")
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
        BooleanValue other = (BooleanValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("3b95238b-0403-44c7-b2e0-154d334885dd")
=======
    @objid ("b7870472-bbb8-442f-9a4a-26166b55e060")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("7b745ac6-9969-4555-9613-e5ba99ed6114")
=======
    @objid ("66ce3dba-8e7b-480f-bce1-007b5ec46966")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("fd2d9aa8-b29d-4b3e-bd42-8c2ac119b1e3")
=======
    @objid ("b37ca755-4cf9-4b46-95df-3a42c8b16611")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isValue() {
        return this.elt.isTagged(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("d42f3c8b-9bf3-4838-9e1b-b99a614f64cf")
=======
    @objid ("6eb3c9e8-3bac-44d9-9f17-7e5007cc609f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BooleanValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("0cc71174-c6d2-45a6-b743-b766f0b0fb96")
=======
    @objid ("91829927-6fd8-440b-992c-ac921a1013d7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected BooleanValue(final Class elt) {
        super(elt);
    }

    @objid ("2d228821-481c-49eb-a387-abae42f72daf")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("205515f9-5cd8-450e-a0fe-5c1eff7185a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b6821860-148c-45d5-be9a-5d853a774022")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("592ee968-2a85-4afc-a883-a3f514aa4975")
        private static Stereotype MDAASSOCDEP;

        @objid ("857fc631-9779-4e1c-8620-08a45b154461")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("007aa40f-662c-4425-b2a7-655a5eb7cdba")
=======
        @objid ("1ea5c0a7-d3a3-4836-ba3a-6eee832e1122")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3c2be22b-755e-4fa7-b37d-e5ed1b790632")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("a761c6c1-d6a6-4c75-bd12-7cb20930e596")
        private static Stereotype MDAASSOCDEP;

        @objid ("18a9e297-2d8f-4f1f-a806-8ca8a87ed8b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28b8afdd-1209-4437-8ac2-baf6f199eb52")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
