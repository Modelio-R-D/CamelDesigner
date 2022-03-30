/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("47717bc7-0d08-4072-9cbf-185203d0c492")
    public static final String STEREOTYPE_NAME = "Value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("f7d22b0d-6327-4e45-97d0-1886f3d184f6")
    protected final Class elt;

    /**
     * Tells whether a {@link Value proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Value >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7a35cae9-3a82-4d45-ae5b-bd523958cbf6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Value.STEREOTYPE_NAME));
    }

    @objid ("f0581900-39d2-442a-bffb-387f5abfb0d5")
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
    @objid ("5b1c6113-2f3a-4c76-ba72-4702c7861134")
    public Class getElement() {
        return this.elt;
    }

    @objid ("761602e8-56d0-4ae8-9ac9-c83b01acda00")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("90f233c3-561d-4645-aeac-6f4f14fa89bf")
    protected Value(final Class elt) {
        this.elt = elt;
    }

    @objid ("98e6e882-3baf-4b4c-b3c1-9b995cb33b84")
    public static final class MdaTypes {
        @objid ("8d7817e3-3f08-4d73-be10-ea74938523d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("91220225-8d61-42c4-8bfa-4723ea600785")
        private static Stereotype MDAASSOCDEP;

        @objid ("fe5ada75-639e-49d9-9640-7a3cd96e450e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("89375521-5eb0-42a3-8e8b-4dcb3f2301b1")
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
