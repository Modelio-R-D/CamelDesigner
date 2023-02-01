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
 * Proxy class to handle a {@link Class} with << NumericValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3ba92fa8-b783-47f9-9069-045fba14f562")
public abstract class NumericValue extends Value {
<<<<<<< HEAD
    @objid ("e7143597-e141-46bf-a1b6-312900d63b14")
=======
    @objid ("ac8faed9-921a-4f96-91ce-28bba4af3519")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "NumericValue";

    /**
     * Tells whether a {@link NumericValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NumericValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("e5069fcc-49c5-430a-a8db-441b0c37bb44")
=======
    @objid ("e873bb33-1cba-4097-bb33-64d3998de155")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NumericValue.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("602df576-7043-4b6b-8c94-8674b6c153f9")
=======
    @objid ("eda9b696-0d71-4875-a777-9d8a8390f423")
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
        NumericValue other = (NumericValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("56f3ebdd-6e13-405a-9724-20b043400400")
=======
    @objid ("332c019c-a51a-432d-bd8f-c8638d6ccf9b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("ab348ae7-91df-44bf-a6f9-8e13fa9898f9")
=======
    @objid ("6a52f6fe-ce92-4899-b450-ecc80a62b65c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("adc93d7a-f959-430c-993c-4e094a141ee5")
=======
    @objid ("318cddbb-4211-4350-a888-623d661c8e20")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected NumericValue(final Class elt) {
        super(elt);
    }

    @objid ("06397469-0f26-401c-adeb-30da7a165128")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b101e761-9659-4dfc-83cc-3a7ab4a54a63")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b60dc2e-ac9c-47a1-a499-294336fbbdc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("090f9bac-defc-4a3c-a252-4ee35490c926")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d7ca03b-7996-4827-b2cc-df616e2b0b89")
=======
        @objid ("92ba2a65-07a0-4ad1-8066-b9ef4c746b11")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3ac5e1a3-b774-4fcb-9aab-456b419e30f7")
        private static Stereotype MDAASSOCDEP;

        @objid ("4995d2cf-d039-462a-9191-8f41917b0e2e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("46e9a6be-cb46-4e23-a585-fa7eb38ecd8b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a8d40881-b0b9-4426-a68a-cba902a74a5e");
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
