/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("727ec462-5ff7-4014-8fa1-a97ae5e3c832")
    public static final String STEREOTYPE_NAME = "Value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("0f552887-f41c-49fc-8e9c-5a1e83a77ec0")
    protected final Class elt;

    /**
     * Tells whether a {@link Value proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Value >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8e11e1d4-33fd-4d89-b7f1-339fad1004c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Value.STEREOTYPE_NAME));
    }

    @objid ("f7ac66f8-57ef-4e51-acf9-db52aae8078a")
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
    @objid ("30d1eb08-9724-4c7a-9363-ff35ae833638")
    public Class getElement() {
        return this.elt;
    }

    @objid ("b7a2401a-d457-4a88-a92e-9dbb7ec33485")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("515b43d5-0601-481c-bb3b-25d401917945")
    protected Value(final Class elt) {
        this.elt = elt;
    }

    @objid ("98e6e882-3baf-4b4c-b3c1-9b995cb33b84")
    public static final class MdaTypes {
        @objid ("d3ea72ba-f7c9-4fe2-a152-673b45670b68")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("380cd0a9-bbe8-4c2f-82cd-95b36dd41730")
        private static Stereotype MDAASSOCDEP;

        @objid ("a5da7730-38cd-48c8-90ea-528dfb853a53")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1f711a4f-6428-4ff3-8cca-44cf0f11148f")
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
