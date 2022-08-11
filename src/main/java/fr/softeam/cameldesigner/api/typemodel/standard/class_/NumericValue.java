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
 * Proxy class to handle a {@link Class} with << NumericValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3ba92fa8-b783-47f9-9069-045fba14f562")
public abstract class NumericValue extends Value {
    @objid ("c87bbce6-c7eb-4831-b12c-6f0e2c91c9f1")
    public static final String STEREOTYPE_NAME = "NumericValue";

    /**
     * Tells whether a {@link NumericValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NumericValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("339992f5-4867-4b3b-98c8-ec8b80c122b9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NumericValue.STEREOTYPE_NAME));
    }

    @objid ("c3b3e714-6235-416b-a1dd-d01a968eec92")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1b4f27cb-0c22-4e17-bb95-fe81f164f0ce")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("a7c7e0ac-1763-4553-bf3d-faaa23825b8a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9ce51fc5-0362-458d-a11e-89c667ca78b8")
    protected NumericValue(final Class elt) {
        super(elt);
    }

    @objid ("06397469-0f26-401c-adeb-30da7a165128")
    public static final class MdaTypes {
        @objid ("a88125e4-3339-45e5-9cf4-1af1e13df253")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d5557ef6-ca53-4b31-a6e5-732f1a8fa729")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac5c7a1e-9afc-47c7-9362-7caf3c5315b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1812e10-5634-494c-8020-7bb1611b1e16")
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
