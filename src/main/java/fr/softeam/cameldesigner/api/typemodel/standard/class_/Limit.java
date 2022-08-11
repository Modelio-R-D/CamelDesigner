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
 * Proxy class to handle a {@link Class} with << Limit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2a6827af-e370-4823-ae3a-3c11ff9acb3c")
public class Limit {
    @objid ("12f5a4ee-082b-4422-9477-4b0c9f6582bc")
    public static final String STEREOTYPE_NAME = "Limit";

    @objid ("9652f968-7014-400a-8fd5-c173b8a75057")
    public static final String INCLUDED_TAGTYPE = "included";

    @objid ("4a95951d-1040-4f0e-9240-924fe1913388")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("6570c8ef-5e38-44aa-8279-5e9880f43ce8")
    protected final Class elt;

    /**
     * Tells whether a {@link Limit proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Limit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8508db1e-e3c4-4fa3-a207-06abe374ca74")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Limit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Limit >> then instantiate a {@link Limit} proxy.
     * 
     * @return a {@link Limit} proxy on the created {@link Class}.
     */
    @objid ("d8e5e8cc-0a3b-4967-9927-0028867f0d06")
    public static Limit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Limit.STEREOTYPE_NAME);
        return Limit.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Limit} proxy from a {@link Class} stereotyped << Limit >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Limit} proxy or <i>null</i>.
     */
    @objid ("a612f8db-03db-44a5-b482-e6f41bc7075c")
    public static Limit instantiate(final Class obj) {
        return Limit.canInstantiate(obj) ? new Limit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Limit} proxy from a {@link Class} stereotyped << Limit >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Limit} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("795091c1-8d09-466f-aaf8-22602d8ad0c4")
    public static Limit safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Limit.canInstantiate(obj))
            return new Limit(obj);
        else
            throw new IllegalArgumentException("Limit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4921cf6a-d0a0-46e0-8a7d-fa89b99f14a6")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("91ed1f5f-b446-4480-a148-29458029817c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("973ea7b5-7340-48df-968e-5d11e1924043")
    public String getValue() {
        return this.elt.getTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("e9bfcb4f-afc4-4e15-ac88-511e10aac525")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a4f4ef18-2a0d-4d76-a1f8-4267aad6c287")
    public boolean isIncluded() {
        return this.elt.isTagged(Limit.MdaTypes.INCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0e07e686-12f6-4c2b-9733-6130f16205f6")
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
    @objid ("fdf9a666-18f2-481e-b6bd-d636d5696016")
    public void setValue(final String value) {
        this.elt.putTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("f901a961-0e77-4fd2-b4c2-d39b567d2551")
    protected Limit(final Class elt) {
        this.elt = elt;
    }

    @objid ("c9d6905c-c70f-42d9-b241-d1855860ebde")
    public static final class MdaTypes {
        @objid ("f39e2ba1-f162-4801-852b-a154a9e7c78c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e37ffa6-66fb-4fb7-8dd3-76bd3feebb4e")
        public static TagType INCLUDED_TAGTYPE_ELT;

        @objid ("7cdfc0a2-e00d-48ef-865c-96aafcf448e2")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("8472d1a8-589e-4585-90d9-74e64c2c0335")
        private static Stereotype MDAASSOCDEP;

        @objid ("9e3e0ecf-c01c-4cf1-884d-c3ae38cb2080")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d4640b7-28d3-42fc-8f5a-0a48db759d8b")
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
