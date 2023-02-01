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
 * Proxy class to handle a {@link Class} with << IntValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("55226fdb-80c7-4d63-9159-946742bab14b")
public class IntValue extends NumericValue {
<<<<<<< HEAD
    @objid ("dc735d63-a0eb-4859-8986-9ae396df563d")
    public static final String STEREOTYPE_NAME = "IntValue";

    @objid ("b8d2dd14-6507-4c99-b33f-ddc89e187f96")
=======
    @objid ("ea9bb7d0-877a-4a37-8abb-464d472ad817")
    public static final String STEREOTYPE_NAME = "IntValue";

    @objid ("469d97ad-5171-4fd4-80af-f5af6fde3fcf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link IntValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << IntValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("ce8f7795-bb67-4e27-823a-5520e389028b")
=======
    @objid ("36c739f9-3a48-4b1c-9361-d72942453cbc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << IntValue >> then instantiate a {@link IntValue} proxy.
     * 
     * @return a {@link IntValue} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("2a7d3424-25f4-4000-b26e-bd65a7b62efd")
=======
    @objid ("ff881305-2dcc-470d-b7c3-3458a1e3335c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static IntValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME);
        return IntValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link IntValue} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("4255c2b1-87a6-43d0-b57c-5f94133b2ed3")
=======
    @objid ("9f75477b-4596-4c77-94d9-d94508f5ef9f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static IntValue instantiate(final Class obj) {
        return IntValue.canInstantiate(obj) ? new IntValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link IntValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("e0a3c65f-4367-48ac-9c31-07945d32b7df")
=======
    @objid ("ca2c8e24-8861-4796-8b0e-cec0bb03c0e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static IntValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (IntValue.canInstantiate(obj))
        	return new IntValue(obj);
        else
        	throw new IllegalArgumentException("IntValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("ebfa0226-e235-474f-a4fe-5c7dc95e9464")
=======
    @objid ("ccf706e2-a32a-49ac-9109-25eac5244dc4")
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
        IntValue other = (IntValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c5a9bc4b-e410-4542-8db7-01f9f8b5bd54")
=======
    @objid ("a2cbe0bc-341a-4e2f-a621-074f6262b70a")
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
    @objid ("a28a4b92-1d55-40d6-adc8-c368b7ed3962")
=======
    @objid ("bc72b6fc-7172-49b9-9839-57db962ac387")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValue() {
        return this.elt.getTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("291ed2cc-7cfd-489e-8dce-20d85ec0c498")
=======
    @objid ("02606f1a-ccb2-4d43-8887-71c31a59cce3")
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
    @objid ("d8e95c44-3ecb-4369-8977-ac177c51fcac")
=======
    @objid ("91a8a72b-2fdf-40af-aff0-d6af2b7b0d66")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final String value) {
        this.elt.putTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

<<<<<<< HEAD
    @objid ("85e933de-f897-4805-83a3-33ae34008d2b")
=======
    @objid ("d5c4ccc3-c3e4-401b-94eb-56eb6c4e900f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected IntValue(final Class elt) {
        super(elt);
    }

    @objid ("86784b93-598c-48c0-99d5-5e6867c51898")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("94dd7c60-ce07-468f-8894-723cee17a53e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71953a8f-d2cf-435f-b571-833358ff2e55")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("3f84a782-13ee-4afa-a620-62ece3d7f05b")
        private static Stereotype MDAASSOCDEP;

        @objid ("6fc5aaad-3dc7-4238-a2f9-15fed075953a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2af61849-e391-4267-93a8-ec6df54a03f7")
=======
        @objid ("07592478-cd6c-4d14-9f3c-62de738ec480")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d1d324dc-c262-4550-9310-feceb1a858f4")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("91310b75-37cb-4042-bac4-0709794f03e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("8457f9b7-fb10-4856-91e5-d5aade5009f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d3c7cdf3-a9bc-450f-859c-384c0184f4fb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "84b646d6-4b3e-4375-b9e3-8e6d650114b3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8c63edd5-c470-41cc-a9bf-8eb948e832ba");
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
