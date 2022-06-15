/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("361f23ca-2c1e-4a56-bef2-1f1e19a5ac29")
    public static final String STEREOTYPE_NAME = "NumericValue";

    /**
     * Tells whether a {@link NumericValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NumericValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0f9eba46-c32e-4278-937a-dd0305b643e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NumericValue.STEREOTYPE_NAME));
    }

    @objid ("f5dfe6ff-8b8a-4c13-a521-ecc27e662f11")
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
    @objid ("12eb4e5e-9e90-4897-91cf-fd66cbc662a6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("5ea515a3-cf97-439d-b670-18c455c5645c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("93ce5c43-72e2-4871-bddc-cc1ee5ae96d7")
    protected NumericValue(final Class elt) {
        super(elt);
    }

    @objid ("06397469-0f26-401c-adeb-30da7a165128")
    public static final class MdaTypes {
        @objid ("d7408905-66fc-4221-82cf-091d4c4deb4c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d500bfa6-c13f-4d20-b53c-ce5d8f43439b")
        private static Stereotype MDAASSOCDEP;

        @objid ("15f9cc8d-90d8-4008-a381-a38129f31fc6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7d1df52-f39a-4630-9ff9-6a494379ff5c")
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
