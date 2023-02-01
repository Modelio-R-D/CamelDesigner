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
 * Proxy class to handle a {@link Class} with << DoubleValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cc20daad-6f47-4d3a-babd-121eb172a4cb")
public class DoubleValue extends NumericValue {
<<<<<<< HEAD
    @objid ("e25f38ff-5b86-4314-9236-a2e614a1d607")
    public static final String STEREOTYPE_NAME = "DoubleValue";

    @objid ("286c0cdd-c6bd-4848-9c28-1dfe2e58dfe0")
=======
    @objid ("e30630e8-8cad-4549-9de5-f984fe057a81")
    public static final String STEREOTYPE_NAME = "DoubleValue";

    @objid ("198b3229-dcbb-426e-97d5-0786bd1d26a8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link DoubleValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DoubleValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("5e6c65c0-9ae2-47c6-a8d8-db5e8d2b8f35")
=======
    @objid ("b0155e1f-93c9-4ea9-9762-718805f2b663")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DoubleValue >> then instantiate a {@link DoubleValue} proxy.
     * 
     * @return a {@link DoubleValue} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("96baec62-c11a-403e-bad1-d6cad9d9714f")
=======
    @objid ("8502e705-044b-4776-9b9f-164a21b7b320")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DoubleValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME);
        return DoubleValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DoubleValue} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("9b0e1e75-65a9-4b13-baa9-b619b03f583b")
=======
    @objid ("a97e964a-2849-4fcd-8432-c829ba77935d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DoubleValue instantiate(final Class obj) {
        return DoubleValue.canInstantiate(obj) ? new DoubleValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DoubleValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("ccd912f0-c415-4fb5-a945-5b176aad331a")
=======
    @objid ("8b57269d-90ef-46b4-a925-c51e0622d227")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DoubleValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DoubleValue.canInstantiate(obj))
        	return new DoubleValue(obj);
        else
        	throw new IllegalArgumentException("DoubleValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("92ace9a5-7d0a-4181-8a0d-ff4dd5d3bfc9")
=======
    @objid ("00b9edc0-d68b-4023-8703-87c9a324398b")
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
        DoubleValue other = (DoubleValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("fdb99b29-acad-46e1-9df5-299697f13acf")
=======
    @objid ("ed8b3609-ce8a-4ad6-8f44-2513b4498e77")
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
    @objid ("9c434a85-177a-4b02-baf8-8a9957e5d05a")
=======
    @objid ("595e5f8c-3759-4fc1-9ec0-855a6e6f4ced")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValue() {
        return this.elt.getTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("edf3e20b-ef83-4036-8a29-c80d8d22f688")
=======
    @objid ("c6d8f78c-993b-4f17-8954-016ebe84c437")
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
    @objid ("c0672985-cf2c-4988-9636-d3780b435c6f")
=======
    @objid ("df3c6149-f29e-4dd1-9359-67711423d205")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final String value) {
        this.elt.putTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

<<<<<<< HEAD
    @objid ("c27906a1-abc9-4291-947d-23e9dbdae604")
=======
    @objid ("1d588d09-6e05-43ef-9be0-030f692e0a17")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DoubleValue(final Class elt) {
        super(elt);
    }

    @objid ("0478aee9-2727-4d68-be3a-307572bc0a9f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("24f5519d-0ae5-42a6-ba11-7723ad3f2bc7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd2694d3-b119-4030-a246-e86d06048222")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("8517bda5-3546-40ef-baf8-634642ab59c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f79e540-5228-42d1-b2a3-26c0f1755baa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("abf0ab95-7c1d-444d-a2a2-a96155852897")
=======
        @objid ("5c72e651-d570-47f6-86ae-dfbea96583de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0a3c97c-9fea-44cd-99b8-7491a7b3582d")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("d33ec470-cf02-4420-afbe-06119e4b8f62")
        private static Stereotype MDAASSOCDEP;

        @objid ("39a23201-943b-4af7-8db5-c9362c47e7f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d299c6ca-b688-489b-b22c-2ddf37b02318")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f7f3c3b-3812-4284-9665-7696d52500f2");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8e0fd000-262b-4aa6-9b35-fea753d10683");
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
