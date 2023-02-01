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
 * Proxy class to handle a {@link Class} with << Limit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2a6827af-e370-4823-ae3a-3c11ff9acb3c")
public class Limit {
<<<<<<< HEAD
    @objid ("ea571e0f-36f0-4c39-9160-a8edeb29ddc1")
    public static final String STEREOTYPE_NAME = "Limit";

    @objid ("db469d47-da30-49b9-a813-a75ba56b3c28")
    public static final String INCLUDED_TAGTYPE = "included";

    @objid ("953b95b2-e6e0-4139-861d-a40aaf31aac6")
=======
    @objid ("5878e22d-8668-44ef-b5aa-ad8c8493a3d1")
    public static final String STEREOTYPE_NAME = "Limit";

    @objid ("f96e6a5e-7bbc-4283-a541-c3749b3073ff")
    public static final String INCLUDED_TAGTYPE = "included";

    @objid ("fc3d2959-4585-437d-962a-f3b9b8a1a006")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("fff628cc-0535-453a-8827-60f359b95609")
=======
    @objid ("99114fa2-b4ec-449e-9eaf-89b4e53fba65")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected final Class elt;

    /**
     * Tells whether a {@link Limit proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Limit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("635fea58-6418-4eb6-9714-41ae62b04b81")
=======
    @objid ("9f964363-513e-46e0-81c6-050640e162da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Limit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Limit >> then instantiate a {@link Limit} proxy.
     * 
     * @return a {@link Limit} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("9b1f6bfd-f9f0-4992-989b-4cf1db6843ac")
=======
    @objid ("a5aa2c2c-55e4-4c87-b610-714fea7ba77c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Limit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Limit.STEREOTYPE_NAME);
        return Limit.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Limit} proxy from a {@link Class} stereotyped << Limit >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Limit} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("022d2769-ba32-403e-b52c-c858fd579571")
=======
    @objid ("b6eabba7-a8b7-4d9f-bdff-6ecc8c89c858")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Limit instantiate(final Class obj) {
        return Limit.canInstantiate(obj) ? new Limit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Limit} proxy from a {@link Class} stereotyped << Limit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Limit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("de4ca448-be4c-4440-a478-f0e3d1fe5dd5")
=======
    @objid ("058c397e-8a08-4a6b-8ca1-6deae2f69041")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Limit safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Limit.canInstantiate(obj))
        	return new Limit(obj);
        else
        	throw new IllegalArgumentException("Limit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("2155859d-62dd-4592-8639-8087088df8c8")
=======
    @objid ("85fb5656-f567-4e04-a21a-6912f6938c63")
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
        Limit other = (Limit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("2e4b3947-dcfb-469c-96c0-45ec7a86ca59")
=======
    @objid ("310a2ddb-c878-44aa-8c46-f4b38e47b759")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c4473c31-982b-4492-89a5-8cc6559fc4f4")
=======
    @objid ("ce88643d-ee5d-4096-9afb-cce966149ab4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValue() {
        return this.elt.getTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("7f712863-7680-419d-bdb1-2510aec54ebb")
=======
    @objid ("df296f29-1440-4f06-89db-f3f2e550893d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e1e23a45-bf35-4354-ab47-ae2e60f2ecba")
=======
    @objid ("a1cf0bf0-7f1a-4392-a857-5b330d63ab09")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIncluded() {
        return this.elt.isTagged(Limit.MdaTypes.INCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("56373014-5300-4ff4-bea2-995853ae8688")
=======
    @objid ("a74ca05b-9fb3-4b28-80d7-ab2ec920062d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setIncluded(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(Limit.MdaTypes.INCLUDED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(Limit.MdaTypes.INCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("706703cf-593d-40c1-9aee-262d65c7e92c")
=======
    @objid ("627420f7-d561-4f6d-943b-08a763f84b8b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final String value) {
        this.elt.putTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

<<<<<<< HEAD
    @objid ("2e673e12-8db1-41d1-a4ff-04106490f1c6")
=======
    @objid ("15f4f0e2-170d-46d5-a302-1d2197c63b57")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Limit(final Class elt) {
        this.elt = elt;
    }

    @objid ("c9d6905c-c70f-42d9-b241-d1855860ebde")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("7d2252be-1f9e-4283-a6aa-9697f5485c6b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e1fb6a1-2b5d-4eaa-8598-ef6c08850159")
        public static TagType INCLUDED_TAGTYPE_ELT;

        @objid ("b284bf63-f2db-460e-8151-6018901bc1a3")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("b5fe904c-a9bb-46d9-b136-7b40b079a65c")
        private static Stereotype MDAASSOCDEP;

        @objid ("1781bbf8-41f0-4a70-b54b-6ad6c6de5d65")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f64224e9-0add-4ed6-a512-96137c478a93")
=======
        @objid ("740b5a44-9921-4538-a561-e30ed502ed04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("31f6b59d-859e-4d1e-a3e4-1c16b078e986")
        public static TagType INCLUDED_TAGTYPE_ELT;

        @objid ("097795d9-cfba-4132-b3b6-c395761f8375")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("7a277d05-89ad-472a-ae2c-814a92d732c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("27cc11c7-206c-40ba-b483-c284ca2dd40e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f574bf97-d07f-4fe2-a05a-97bf70dd9151")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bf1d744a-e1f0-4ace-be02-64e9edfbbba2");
            INCLUDED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74608d88-801b-4173-8a41-35e922bd8144");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf31a33d-0e91-4d1a-a2ea-eb225bdcd049");
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
