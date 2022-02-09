/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("0c95448c-16c1-4449-8555-4fe71d0c5baf")
    public static final String STEREOTYPE_NAME = "Limit";

    @objid ("515da6f8-294d-45c8-b3a6-b9c17b56b02e")
    public static final String INCLUDED_TAGTYPE = "included";

    @objid ("d1138fc5-7d0d-4be9-bf08-5e4c92fe7a41")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("fd034b5d-637e-452a-b842-b0079280aae7")
    protected final Class elt;

    /**
     * Tells whether a {@link Limit proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Limit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4647027c-7d85-4e8b-8a32-b09c20a099f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Limit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Limit >> then instantiate a {@link Limit} proxy.
     * 
     * @return a {@link Limit} proxy on the created {@link Class}.
     */
    @objid ("66f0728b-878c-40ff-b133-3b6aac0b5287")
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
    @objid ("db86c581-0f8f-4b5e-a332-abd70d9d0861")
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
    @objid ("26a2c0f9-9430-457a-9bcc-b2833d7c4d92")
    public static Limit safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Limit.canInstantiate(obj))
        	return new Limit(obj);
        else
        	throw new IllegalArgumentException("Limit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b980e790-5f21-4108-8001-5e856c164ec6")
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
    @objid ("013d2b48-0ac5-4cf0-96ab-9a59e7dd1464")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c4a67f07-808e-41d8-9181-094a0cdd7921")
    public String getValue() {
        return this.elt.getTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("80d194bd-3b24-448e-9d0f-dce47d4332ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("444af72d-256d-4300-bab1-d7248f23eb6f")
    public boolean isIncluded() {
        return this.elt.isTagged(Limit.MdaTypes.INCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5ba6881-bf9e-4e79-aa7e-a089698d9ec0")
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
    @objid ("b6bb1c21-860b-44e4-8364-0385f7dc0ffe")
    public void setValue(final String value) {
        this.elt.putTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("8c1d0942-a13c-4fbc-a631-91f588ad5c7d")
    protected Limit(final Class elt) {
        this.elt = elt;
    }

    @objid ("c9d6905c-c70f-42d9-b241-d1855860ebde")
    public static final class MdaTypes {
        @objid ("63cab6ac-d84f-4610-b61f-632e1a2461c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1ac4c0b8-63fc-4104-99a6-c7b977af5265")
        public static TagType INCLUDED_TAGTYPE_ELT;

        @objid ("5c754774-479d-4111-8b7f-074838fb38b8")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("b46a37bb-086e-4704-a502-da43d9f9fa40")
        private static Stereotype MDAASSOCDEP;

        @objid ("6bb12ede-7619-4a02-af94-db854a8a7bbd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d53ecdb0-3436-44b8-a1cc-6e393d2bcdf6")
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
