/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("0e267aff-18d1-4444-a2ec-e891eca4024f")
    public static final String STEREOTYPE_NAME = "Limit";

    @objid ("cf9a82d3-adc2-46f0-a5af-4bfdd1b4ef61")
    public static final String INCLUDED_TAGTYPE = "included";

    @objid ("040dd450-634b-4b8c-b3af-fc80eec81cda")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("63e3c691-e6c6-40b1-84e3-52fd1a1798ec")
    protected final Class elt;

    /**
     * Tells whether a {@link Limit proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Limit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7d1b89cd-f529-4e30-b4bd-12334792aa39")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Limit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Limit >> then instantiate a {@link Limit} proxy.
     * 
     * @return a {@link Limit} proxy on the created {@link Class}.
     */
    @objid ("8902a4de-3635-4b4e-8a36-0a97fb1432f9")
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
    @objid ("608bbaaf-81c8-477d-ad81-b2e7da9fae1f")
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
    @objid ("34c743ba-2237-4b41-93fc-490b0f241b7c")
    public static Limit safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Limit.canInstantiate(obj))
            return new Limit(obj);
        else
            throw new IllegalArgumentException("Limit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14dc9c98-bcb9-46ae-a87a-4bf51ded8f66")
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
    @objid ("e8404a74-bf89-4cc5-aa1b-b55b9cf0b09b")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3a79a2fd-16a0-4610-afa7-07f4ecef2dad")
    public String getValue() {
        return this.elt.getTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("b84776be-9c3c-4a39-8482-9d6822e3eb51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("78ea7b5d-e72b-4f22-9596-ed85533d3aa4")
    public boolean isIncluded() {
        return this.elt.isTagged(Limit.MdaTypes.INCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'included'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7119b39e-0d86-445c-ac5e-53430a79075c")
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
    @objid ("ca456166-b26d-42d3-9df4-8869cfc87b94")
    public void setValue(final String value) {
        this.elt.putTagValue(Limit.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("d8adcda3-b474-490b-9897-c8eab85f9815")
    protected Limit(final Class elt) {
        this.elt = elt;
    }

    @objid ("c9d6905c-c70f-42d9-b241-d1855860ebde")
    public static final class MdaTypes {
        @objid ("a0ce2655-6047-4b71-9e28-ac7420928e2b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a8c3b79e-686c-48f9-b358-b161b06d1c2a")
        public static TagType INCLUDED_TAGTYPE_ELT;

        @objid ("587c40ed-f437-4cf8-94e0-ad81c0998875")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("db8841ee-49cb-41e3-8e8f-7401511cf2f8")
        private static Stereotype MDAASSOCDEP;

        @objid ("ce3163fd-ed09-4ee8-8420-88670b8936c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d04822b-2a9a-4521-ae48-fef96c5107af")
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
