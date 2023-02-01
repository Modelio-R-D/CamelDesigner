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
 * Proxy class to handle a {@link Class} with << Value >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b2107801-5ebd-4fed-a10f-94070aefa145")
public abstract class Value {
<<<<<<< HEAD
    @objid ("c44c81db-b4c8-4ca2-a1c4-e87101a845d6")
=======
    @objid ("3872db4e-2835-455d-ad43-d532e2f9af0e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("ae556725-3c70-4a79-a967-c9b83a347c78")
=======
    @objid ("3cdc95a0-e9e5-400f-9b5b-77106c391298")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected final Class elt;

    /**
     * Tells whether a {@link Value proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Value >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("79d3b35b-10bd-4d91-aaab-31822fd5190d")
=======
    @objid ("615a513e-2ecd-4c90-873c-a9f8c0627dad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Value.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("cab961dc-b4d1-45b6-b6db-f75b0975859c")
=======
    @objid ("9cf1bf5a-2e31-444e-a86f-75990d72bade")
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
        Value other = (Value) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("87147dbc-f9ee-4982-92d9-0f9a27714906")
=======
    @objid ("83cd7f7b-3ee0-4d39-b602-61a2b878a053")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Class getElement() {
        return this.elt;
    }

<<<<<<< HEAD
    @objid ("f1cf6ae5-1690-4b68-8fe7-f4c4043fdb9a")
=======
    @objid ("e2d88069-7a76-4a6d-b9ad-77e3265102f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("e8961bd2-5654-4f38-95be-99f4fecc6379")
=======
    @objid ("23c8cef0-8d86-4882-8365-b1f39d4ebf9a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Value(final Class elt) {
        this.elt = elt;
    }

    @objid ("98e6e882-3baf-4b4c-b3c1-9b995cb33b84")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("6e0af19e-1824-4787-8917-22d0c2fca15c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4cde5401-f80e-47a5-9a5f-bc509f7660e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8da0d8f-92dc-443c-b4a3-8bd276b7a0f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3fb82ab7-8ada-4f0c-80e9-67fd4d4a8767")
=======
        @objid ("1effaa1e-8be6-421f-8232-2c086adda029")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6a7cb048-1a21-41ef-b19b-df15b6b4abcc")
        private static Stereotype MDAASSOCDEP;

        @objid ("2438fbf1-f358-4e0a-9b01-0fc5393f068b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a974150b-74d1-42dd-a4c0-437db851f60a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7cec495-c026-4fde-b42d-496bbcda924b");
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
